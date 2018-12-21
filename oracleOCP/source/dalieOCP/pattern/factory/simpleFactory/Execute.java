package dalieOCP.pattern.factory.simpleFactory;

interface App {
	void open(String filename);
}

class WordProcessor implements App {
	public void open(String filename) {
		System.out.println("WordProcessor" + filename);
	}
}

class TextEditor implements App {
	public void open(String filename) {
		System.out.println("TextEditor" + filename);
	}
}

class AppFactory {
	
	public static App getAppInstance(String fileExtn) {
		/*
		 * Implements Simple Factory pattern by returning App object 
		 * according to parameter value.
		 * */
		
		App appln = null;
		if (fileExtn.equals(".doc")) {
			appln = new WordProcessor();
			
		} else if (fileExtn.equals(".txt") || fileExtn.equals(".xml")) {
			appln = new TextEditor();
		}
		return appln;
	}
}

class Execute {
	/* Simple Factory pattern (or Static Factory pattern) */
	
	public static void main(String[] args) {
		App app = AppFactory.getAppInstance(".doc");
		app.open("Hello.doc");
		App app2 = AppFactory.getAppInstance(".xml");
		app2.open("Hello.xml");
	}
}
