package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FindingOutAboutClassFields {

	public static void main(String[] args) {
		Artikel salz = new Artikel();
		try {
			Class<?> cls = Class.forName(salz.getClass().getName());
			
			Field fieldList[] = cls.getDeclaredFields();
			for (int i = 0; i < fieldList.length; i++) {
				Field fld = fieldList[i];
				System.out.println(
						"name..:" + fld.getName()
						+ "\n typ..:" + fld.getType() );
			}//for

			Method metList[] = cls.getDeclaredMethods();
			for (Method method : metList) {
				Class<?>[] parameterTypes = method.getParameterTypes();
				System.out.print("Parameter Types:");
				for (Class<?> class1 : parameterTypes) {
					System.out.println(class1.getName());
				}
			}
			
		
			for (int i = 0; i < metList.length; i++) {
				Method met = metList[i];
				System.out.println("methodenName..:" + met.getName() );
				
			if(met.getName().endsWith("setNumber")) 
				met.invoke(salz,4711);
			if(met.getName().endsWith("setDescripten"))
				met.invoke(salz,"salz");
			if(met.getName().endsWith("setAvailable"))
				met.invoke(salz,new Boolean(true));
			}//for
			System.out.println(salz.getNumber() +","+ salz.getDescripten() +"."+ salz.isAvailable() );
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}//try
	}//main

}//FindingOutAboutClassFields
