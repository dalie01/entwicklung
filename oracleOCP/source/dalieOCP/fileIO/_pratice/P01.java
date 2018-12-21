package dalieOCP.fileIO._pratice;

import java.io.File;

final class P01 {

	public static void main(String[] args) {
		File f = new File("C:\\folder1\\folder2\\Test.txt");
		/*
		 * This is just the last name in the pathname's name sequence. 
		 * If the pathname's name sequence is empty, then the empty string is returned.
		 * */
		System.out.println(f.getName());//prints Test.txt
		/*
		 *  Returns the pathname string of this abstract pathname's parent, 
		 *  or null if this pathname does not name a parent directory.
		 * */
		System.out.println(f.getParent());//prints C:\folder1\folder2
	}
}
