package com.dalie.beehive.configuration.tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.configuration.ConfigurationException;

import com.dalie.beehive.configuration.factory.ProjectFactory;

public class CopyFiles extends Task {
		
	@Override
	void execute() {
		try {
			Files.walkFileTree(Paths.get(
					ProjectFactory.getProjectConfig().getString("Project.Configuration.Share")),
						new ProjectFactory(Paths.get(
										ProjectFactory.getRoot().toString(),"share")));
				
			} catch (IOException | ConfigurationException e) {
				e.printStackTrace();
			}
	}
}
