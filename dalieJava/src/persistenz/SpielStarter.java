package persistenz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class SpielStarter{
    public static void main(String[] args){
        Spielfigur troll = new Spielfigur("Troll", 100);
        Spielfigur zauberer = new Spielfigur("Zauberer", 80);
        Spielfigur hobbit = new Spielfigur("Hobbit", 50);
        troll.setWaffe(2);
        zauberer.setWaffe(3);
        hobbit.setWaffe(1);
        hobbit.abnipplen();
        zauberer.abnipplen();
        troll.anzeigen();
        zauberer.anzeigen();
        hobbit.anzeigen();
        
        try{
            FileOutputStream fos = new FileOutputStream("c:\\spielf.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(troll);
            oos.writeObject(zauberer);
            oos.writeObject(hobbit);
            oos.close();
        }catch(Exception e){
        }
        troll = null;
        zauberer = null;
        hobbit = null;
        try{
            FileInputStream fis = new FileInputStream("c:\\spielf.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            troll = (Spielfigur)ois.readObject();
            zauberer = (Spielfigur)ois.readObject();
            hobbit = (Spielfigur)ois.readObject();            
            ois.close();
        }catch(Exception e){
        }
        System.out.println("--------------------------");
        troll.anzeigen();
        zauberer.anzeigen();
        hobbit.anzeigen();
    }
}
