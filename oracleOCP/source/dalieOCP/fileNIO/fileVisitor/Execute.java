package dalieOCP.fileNIO.fileVisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class Execute {

	public static void main(String[] args) throws IOException {
		Path dire = Paths.get("source\\dalieOCP\\fileNIO");
		PrintDirs dirs = new PrintDirs();
		Files.walkFileTree(dire, dirs);
	}
}


class PrintDirs extends SimpleFileVisitor<Path> {
	
	 public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
             throws IOException
         {
		 System.out.println("preVisitDirectory:" + Files.isDirectory(dir) + dir.toString());	
             return FileVisitResult.CONTINUE;
         }
	                           
       public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
           throws IOException
       {
           System.out.println("visitFile:" + file.getFileName());
           BasicFileAttributes basic = 
        		   Files.readAttributes(file,BasicFileAttributes.class);
           System.out.println(basic.lastModifiedTime());
           System.out.println(basic.lastAccessTime());
           System.out.println(basic.creationTime());
           return FileVisitResult.CONTINUE;
       }
       
       public FileVisitResult postVisitDirectory(Path dir, BasicFileAttributes attrs)
               throws IOException
           {
    	   		System.out.println("postVisitDirectory:" + Files.isDirectory(dir) + dir.getFileName());	
                   return FileVisitResult.CONTINUE;
                   // directory iteration failed
           }
}