/*
 * Created of DV0101 on 30.04.2010 16:00:39
 *
 * Filename	  Artikel.java
 */
package patternObserver;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * class ArtikelView.
 *
 * @version 	1.00 30.04.2010 um 16:00:39
 * @author 		DV0101
 */
public class ArtikelView extends JFrame implements Observer  {
    
    private Artikel subject;
    private JTextField txtNr = new JTextField(10);
    private JTextField txtBezeichnung = new JTextField(20);
    private JButton btnOK = new JButton("Übernehmen");
    
    /** Creates a new instance of ArtikelView */
    public ArtikelView() {
        setSize(300,200);
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(new JLabel("Nr: "));
        getContentPane().add(txtNr);
        getContentPane().add(new JLabel("Bezeichnung: "));
        getContentPane().add(txtBezeichnung);
        getContentPane().add(btnOK);
    }//ArtikelView
    
    public void setSubject(Artikel _subject) {
        subject = _subject;
        subject.attach(this);
    }//setSubject
    
    @Override
	public void update() {
        txtNr.setText(Integer.toString(this.subject.getNr()));
        txtBezeichnung.setText(this.subject.getBezeichnung());
    }//update
    
    void save() {
        subject.setNr(Integer.parseInt(txtNr.getText()));
        subject.setBezeichnung(txtBezeichnung.getText());
    }//save
    
    public void init() {
		update();
		btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				save();
				System.out.println("OK");
			}// actionPerformed
		});
	}// init
    
}//class ArtikelView
