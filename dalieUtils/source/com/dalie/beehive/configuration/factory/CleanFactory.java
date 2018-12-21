package com.dalie.beehive.configuration.factory;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class CleanFactory extends SimpleFileVisitor<Path> {
	
	private final Path targetPath;
	
	public CleanFactory(Path targetPath) {
		this.targetPath = targetPath;
	}
	
	@Override
	public FileVisitResult postVisitDirectory(
			Path directory, IOException exc) throws IOException {
		
			if(targetPath.compareTo(directory) != 0) {
				System.out.println("Deleting Directory:" + directory);
				Files.deleteIfExists(directory);
			}
			
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Path file,
			BasicFileAttributes attrs) throws IOException {
		
		if (file.toFile().isFile()) { 
			System.out.println("Deleting File     :" + file);
			Files.deleteIfExists(file);
		}
	    return FileVisitResult.CONTINUE;
	}
	
}
