package dalieOCP.fileIO.usingCharacterIO.writer._pratice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

final class P02 {

	public static void main(String[] args) {
//		try(PrintWriter pw = new PrintWriter(new File("Execute.txt"))) {
//			try(PrintWriter pw = new PrintWriter(new FileWriter("Execute.txt"))) {
//				try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Execute.txt")))) {
					try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("Execute.txt"),true)))) {
						
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
