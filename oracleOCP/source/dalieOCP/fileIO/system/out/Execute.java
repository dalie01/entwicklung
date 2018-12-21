package dalieOCP.fileIO.system.out;

import java.util.Locale;

class Execute {
	public static void main(String[] args) {
		
		/* use the default platform encoding */
		System.out.format("%s","Hello");
		System.out.format(Locale.CANADA, "%d", 12);

		System.out.println("Hello");
		System.out.print("World");
	}
}
