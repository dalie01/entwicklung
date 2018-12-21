package dalieOCP.string.indexOf;

class Execute {
	
	public static void main(String[] args) {
		String s3 = "INXS";
		System.out.println(s3.indexOf("X",2));//is beginnIndex
		System.out.println(s3.indexOf("X",4));
		System.out.println(s3.lastIndexOf("N", 2));//search backwards beginnIndex also from left
	}
}
