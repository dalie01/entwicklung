package dalieOCP.pattern.factory.abstractFactory;

interface App {}
class WordProcessor implements App {}
class TextEditor implements App {}


interface Font {}
class RichFont implements Font {}
class RegularFont implements Font {}


abstract class AppFactory {
	protected abstract App getApp();
	protected abstract Font getFont();
	
	public App getAppInstance() {
		App appln = getApp();
		return appln;
	}

	public Font getFontInstance() {
		Font font = getFont();
		return font;
	}
	
}

class WordAppFactory extends AppFactory {
	/* Concrete Factory classes */
	
	protected App getApp() {//Implement Factory Method to return a specific App object.
		return new WordProcessor();
	}

	protected Font getFont() {
		return new RichFont();
	}
}

class TextEditAppFactory extends AppFactory {
	/* Concrete Factory classes */
	
	protected App getApp() {//Implement Factory Method to return a specific App object.
		return new TextEditor();
	}

	protected Font getFont() { 
		return new RegularFont();
	}
}
class Execute {
	/*
	 * The Abstract Factory pattern is used to create a family of related products
	 * */
	
	public static void main(String[] args) {
		AppFactory aF1 = new WordAppFactory();
		App app1 = aF1.getAppInstance();
		System.out.println(app1 instanceof WordProcessor);
		Font font1 = aF1.getFontInstance();
		System.out.println(font1 instanceof RichFont);
		
		AppFactory aF2 = new TextEditAppFactory();
		App app2 = aF2.getAppInstance();
		System.out.println(app2 instanceof TextEditor);
		Font font2 = aF2.getFontInstance();
		System.out.println(font2 instanceof RegularFont);
		
		
	}
}
