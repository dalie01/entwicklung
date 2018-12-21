package dalieOCP.exception._practice;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

final class P01 {
	
	@SuppressWarnings({ "unused", "hiding", "resource" })
	public static void main(String[] args) {
		try {
			BufferedOutputStream f = new BufferedOutputStream(new DataOutputStream((new FileOutputStream("binary.data"))));
			throw new RuntimeException();
			
		} catch (FileNotFoundException e) {
			System.out.println("1");

		} catch (IOException e) {
			System.out.println("3");
			
		} catch (Exception e) {
			System.out.println("4");
			
		} finally {
			System.out.println("5");
		}
		System.out.println("6");
	}
}
