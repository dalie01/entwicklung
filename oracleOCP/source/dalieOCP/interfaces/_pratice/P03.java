package dalieOCP.interfaces._pratice;

interface P03I3 {
    String timbreType = "Lindeman-Sobel";
    void play();
}

abstract class AP03 implements P03I3 {
//    void playNote(String note);
   abstract void playNote(String note);
}

final class P03 implements P03I3 {

	static String timbreType = "ASA";
    public void play() { }
    void playNote(String note) { }
    
    public static void main(String[] args) {
		System.out.println(P03.timbreType);
	}
    
}
