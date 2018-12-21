package com.dalie.beehive.configuration.factory;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class ProjectFactory extends SimpleFileVisitor<Path> {
	
	private final Path targetPath;
    private Path sourcePath = null;
    
    public ProjectFactory(Path targetPath) {
        this.targetPath = targetPath;
    }
	
    
    @Override
    public FileVisitResult preVisitDirectory(
    		final Path dir, final BasicFileAttributes attrs) throws IOException {
    	
    	if (sourcePath == null) {    
        	sourcePath = dir;
        	
        } else {
        	try {
        		System.out.println("Create   Directory:" + 
        				targetPath.resolve(sourcePath.relativize(dir).toString()));
        		
        		Files.createDirectories(targetPath.resolve(sourcePath.relativize(dir)));
        	} catch (FileAlreadyExistsException e) {
        		System.out.println(e.getMessage());
        	}
        }
        
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(final Path file,final BasicFileAttributes attrs) throws IOException {
    	try {
    		System.out.println("Copy     File     :" + 
    				targetPath.resolve(sourcePath.relativize(file).toString()));
    		
    		Files.copy(file,targetPath.resolve(sourcePath.relativize(file)));
    	} catch (FileAlreadyExistsException e) {
    		System.out.println(e.getMessage());
    	}
    	
    	return FileVisitResult.CONTINUE;
    }
    
    
    public static List<Path> listFiles(Path path, String s) throws IOException {
    	List<Path> files = new ArrayList<>();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path entry : stream) {
                if (Files.isDirectory(entry)) {
                    listFiles(entry,s);
                }
                if(entry.endsWith(s))
                	files.add(entry);
            }
        }
        return files;
    }

    public static List<Path> listDomains(Path path, Path s) throws IOException {
    	List<Path> files = new ArrayList<>();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path entry : stream) {
                if(Files.isDirectory(entry) && entry.startsWith(s))
                	files.add(entry);
            }
        }
        return files;
    }

    
	public static PropertiesConfiguration getProjectConfig () throws ConfigurationException {
		return new PropertiesConfiguration(
				getPathRoot("dalie.properties").toAbsolutePath().toFile());
	}
	
	public static Path getPathRoot(String s) {
		return Paths.get(getRoot().toString(),s);
	}
	
	public static Path getRoot() {
		String p = getUserDir().getParent().getFileName().toString();
		return p != null && p.endsWith("dalieUtils") ? getUserDir().getParent().getParent() : getUserDir().getParent();
		
	}
	
	public static Path getUserDir() {
		return Paths.get(System.getProperty("user.dir"));
	}

}
