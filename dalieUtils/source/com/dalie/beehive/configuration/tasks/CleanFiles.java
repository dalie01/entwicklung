package com.dalie.beehive.configuration.tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.dalie.beehive.configuration.factory.CleanFactory;
import com.dalie.beehive.configuration.factory.ProjectFactory;

public class CleanFiles extends Task {

	void execute() {
		try {
			Files.walkFileTree(	Paths.get(
				ProjectFactory.getRoot().toString(),"share"), 
					new CleanFactory(
							Paths.get(ProjectFactory.getRoot().toString(),"share")));
		} catch (IOException e) {
				e.printStackTrace();
		}
	}
 
}
