package com.dalie.beehive.configuration;

import com.dalie.beehive.configuration.tasks.CleanFiles;
import com.dalie.beehive.configuration.tasks.CopyFiles;
import com.dalie.beehive.configuration.tasks.Task;

public class Builder {
	
	public static void main(String[] args) {
		Task[] tasks = new Task[] {new CleanFiles(), new CopyFiles()};
		Task.executeTasks(tasks);
	}
}
