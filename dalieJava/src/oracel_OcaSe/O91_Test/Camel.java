package oracel_OcaSe.O91_Test;

interface Rideable{
	String getGait();
}

public class Camel implements Rideable{

	int weight = 2;
	
	public static void main(String[] args) {
		new Camel().go(8);
	}
	
	void go(int speed){
		--speed;
		weight++;
		int walkrate = speed * weight;
		System.out.println(walkrate + getGait());
	}
	
	@Override
	public String getGait(){
		return "mph, lope";
	}

}
