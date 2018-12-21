package dalieOCP.object.overloading._practice;

final class P02 {

	 private StringBuilder contents;
     public P02() {
    	 contents = new StringBuilder("_"); }
     
     public void Stuff(byte i) { contents.append("b" + i); }
     public void Stuff(long i) { contents.append("l" + i); }
     public void Stuff(float i) { contents.append("f" + i); }
     public void Stuff(Double i) { contents.append("D" + i); }
     public void Stuff(Long i) { contents.append("L" + i); }
     public void Stuff(Object i) { contents.append("O" + i); }
     public void end() {contents.append("_");}
     public void open() {System.out.println(contents);}
     
     
     public static void main(String[] args) {
		P02 env = new P02();
		env.Stuff(2);
		env.Stuff(3);
		env.Stuff(4);
		env.end();
		env.open();
		
		env = new P02();
		env.Stuff((long)2);
		env.Stuff(3.0);
		env.Stuff(4);
		env.end();
		env.open();
	}
}
