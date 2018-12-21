package com.dalie.beehive.configuration.tasks;

public abstract class Task {
	
	abstract void execute();
	
	public static void executeTasks(Task... t) {
		for(int i = 0;i < t.length; i++) {
			t[i].execute();
		}
	}
}
