/* 
 * Autor				dv0101<br>
 * Date of creation: 	11.03.2008<br>
 * File					RowHeaderExample.java<br>
 * State				Geramany
 * 
 */
package privat;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class RowHeaderExample {

    public static void main(String[] args) {
        TableModel model = new AbstractTableModel()
        {
             @Override
			public int getColumnCount() { return 10; }
             @Override
			public int getRowCount() { return 1000; }
             @Override
			public String getColumnName(int col) { return "Column "+col; }

             @Override
			public Object getValueAt(int row, int col)
             {
                 if (col == 0) return "Line "+row;
                 return new Float(row/col);
             }
         };

         /* all this is only so that the row header values can be contained in
            the TableModel. If you use separate TableModels for row header and
            table itself, this can be skipped ... */

         TableColumnModel columnModel = new DefaultTableColumnModel();
         for (int i = 1; i < model.getColumnCount(); i++)
         {
             TableColumn c = new TableColumn(i);
             c.setHeaderValue(model.getColumnName(i));
             columnModel.addColumn(c);
         }

         TableColumnModel rowHeaderColumnModel = new DefaultTableColumnModel();
         rowHeaderColumnModel.addColumn(new TableColumn(0));

         /* ... until here, and these lines would be something like
            JTable table = new JTable(model);
            JTable rowHeader = new JTable(rowHeaderModel);
         */

         JTable table = new JTable(model, columnModel);

         JTable rowHeader = new JTable(model, rowHeaderColumnModel);

         // the first important line
         table.setSelectionModel(rowHeader.getSelectionModel());

         /* I still haven't found a solution that does not hardcode the size */
         rowHeader.setMaximumSize(new Dimension(80, 10000));

         rowHeader.setBackground(table.getTableHeader().getBackground());
         rowHeader.setForeground(table.getTableHeader().getForeground());

         JViewport viewport = new JViewport();
         viewport.setView(rowHeader); // the second important line
         viewport.setPreferredSize(rowHeader.getMaximumSize());

         table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
         rowHeader.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

         JScrollPane scrollPane = new JScrollPane(table);
         scrollPane.setRowHeader(viewport); // the third important line

         JFrame frame = new JFrame("Simple JTable Test");
         frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
         frame.setSize(400, 300);
         frame.setVisible(true); 
    }//main
}//class RowHeaderExample
