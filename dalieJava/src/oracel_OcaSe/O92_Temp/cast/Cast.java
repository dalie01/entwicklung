package oracel_OcaSe.O92_Temp.cast;

class Game {
	
	//public Game(int i){}
	
	public void play(){System.out.println("Game.play");}
}

class Soccer extends Game {
	
	//public Soccer(int i){
		//this();
	//}
	
//	public Soccer() {
	//	super(1);
	//}
	
	public void play(){System.out.println("Soccer.play");}
	//public void play(String test){System.out.println("Soccer.play");}
}

class Cast {

	public static void main(String[] args) {
		Game g = new Game();
		Game gs = new Soccer();
		//Soccer sg = (Soccer)new Game(2);
		Soccer s = new Soccer();
		//Soccer sg = (Soccer)g;
		g.play();
		gs.play();
		s.play();
		//sg.play();
	}
}
