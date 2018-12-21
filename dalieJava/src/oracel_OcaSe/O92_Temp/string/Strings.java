package oracel_OcaSe.O92_Temp.string;


class Strings {
	
	String x;

	public static void main(String[] args) {
		String x = "Jena";
		System.out.println(x.indexOf("x"));
		System.out.println(x.length() +  ";" + x.substring(x.length()));
		System.out.println(x.indexOf('J'));
		System.out.println(x.indexOf("a"));
		System.out.println(x.charAt(x.length()-1));
		System.out.println(x.substring(0, 2) + x.substring(0));
		
		String[][] i = new String[][]{{"Stuttgart"},{"Jena","Jena-Lobeda"}};
		System.out.println(i[1][1].substring(0));
		System.out.println(Math.PI);
		
		StringBuilder sb = new StringBuilder("eLion");
		String ejg = null;
		ejg = sb.append("X").substring(sb.indexOf("L"),sb.indexOf("X"));
		System.out.println(ejg);
		System.gc();
	}
	
}
