package flugsimulator;

/**
 * @author dv0101 am 04.07.2008 um 20:14:53
 *
 * Flugsimulatorstartenentwurf.java
 * 
 */

public class Flugsimulatorstartenentwurf {

    public static void main(String[] args) {
        
        boolean[][][] spielfeld = new boolean[10][10][10];
		Flugzeug flugzeug = new Flugzeug (new Koordinate(0,2,0));
		Berg berg = new Berg(new Koordinate(2,2,0),new Koordinate(5,5,5));
        
		System.out.println("\n" +"Anfang:"+"\n" + berg.anfang.l);
		System.out.println(berg.anfang.b);
		System.out.println(berg.anfang.h);
		System.out.println("\n" +"Länge,Breite,Höhe;"+"\n"+ berg.ende.l);
		System.out.println(berg.ende.b);
		System.out.println(berg.ende.h);
		System.out.println("\n" + "Ende:"+"\n" + (berg.anfang.l + berg.ende.l));
		System.out.println(berg.anfang.b + berg.ende.b);
		System.out.println(berg.anfang.h + berg.ende.h +"\n");
		
		
		for(int hoch = berg.anfang.h; hoch < berg.ende.h;++hoch)
		for(int breit = berg.anfang.b;breit < berg.ende.b;++breit)
		for(int lang = berg.anfang.l;lang < berg.ende.l;++lang){
		
		System.out.print("\n"+spielfeld[lang][breit][hoch]);
		spielfeld[lang][breit][hoch] = true; 		
		System.out.print("\n"+lang +"\n" + breit +"\n"+ hoch);
		System.out.print("\n"+spielfeld[lang][breit][hoch] +"\n"); 
		
		}//for 
		
		
		System.out.println("Start "+ spielfeld[flugzeug.pos.l][flugzeug.pos.b][flugzeug.pos.h]);
		System.out.print("Start "+flugzeug.pos.l); 
		System.out.print(flugzeug.pos.b);
		System.out.print(flugzeug.pos.h + "\n");
		
		
		while(!spielfeld[flugzeug.pos.l][flugzeug.pos.b][flugzeug.pos.h]){
		++flugzeug.pos.l;
		System.out.println(spielfeld[flugzeug.pos.l][flugzeug.pos.b][flugzeug.pos.h]);
		System.out.println("weiterfliegen");
		System.out.print(flugzeug.pos.l); 
		System.out.print(flugzeug.pos.b);
		System.out.print(flugzeug.pos.h);
		}//while
		
		System.out.println(spielfeld[flugzeug.pos.l][flugzeug.pos.b][flugzeug.pos.h]);
		System.out.println("chrash");
		System.out.print(flugzeug.pos.l); 
		System.out.print(flugzeug.pos.b);
		System.out.print(flugzeug.pos.h);
		
        
    }//main
}//class Flugsimulatorstartenentwurf

