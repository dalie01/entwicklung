package dalieOCP.parsingTokenizingFormating.formating;

class Execute {
	
	public static void main(String[] args) {
		/* printf("format string", argument(s)) */
		/*
		 * %d   which must be used with integer literals, and not String or decimal (float,double) numbers.
		 * 
		 * %s 	can pass any type of primitive variable or object reference
		 * 		format flags as are not allowed 
		 * 
		 * %b 	
		 * 
		 * */
		System.out.printf("%d",1,3);//elementary level 
		System.out.printf("%1$d\n",1);// with identifier char new line 
		/* the 2$ represents the second argument */
		System.out.printf("%2$d + %1$d %n", 123, 456);//no matter in what order
		//To get a newline %n is used.
		
		int i1 = 1234;
		int i2 = -1235;
		System.out.printf("%0,10d %+,1d %n", i1, i2);//include sign + or -
		System.out.printf("%1$9d%n\n", i2);//9 minimum of characters
		float f1 = 101001244.122f;
		float f2 = -101001244.122f;
		System.out.format("%1$+-,20.2f %2$,.3f %n",f1, f2, -111111111.122f);
		//% required
		//1 identifier of argument (f1)
		//$ in depends of identifier
		//+- = include + or -
		//, = grouping 100.000,00
		//20 = output minimum 20 characters
		//.2 precision 2 after comma
		//f conversion to floating point required
		
		/*
		 * If the argument arg is null, then the result is "false". 
		 * If arg is a boolean or Boolean, then the result is the string returned by String.valueOf(arg). 
		 * Otherwise, the result is "true". 
		 */
		System.out.printf("%f %b %n", f2, i2);//
		
		
		System.out.format("[%+,-(20f] [%+,-(20.3f] %n", new Float(-1099.9999), new Float(-9011.1111));
		/*
		 The following flags apply to numeric integral conversions:
			 '+' Requires the output to include a positive sign for all positive numbers. 
			 	 If this flag is not given then only negative values will include a sign.

			 If both the '+' and '  ' flags are given then an IllegalFormatFlagsException will be thrown.
			 '  ' Requires the output to include a single extra space ('\u0020') for non-negative values.

			 If both the '+' and '  ' flags are given then an IllegalFormatFlagsException will be thrown.
			 '0' Requires the output to be padded with leading zeros to the minimum field width 
			 	following any sign or radix indicator except when converting NaN or infinity. 
			 	If the width is not provided, then a MissingFormatWidthException will be thrown.

			 If both the '-' and '0' flags are given then an IllegalFormatFlagsException will be thrown.
			 ',' 	Requires the output to include the locale-specific group separators as described in the "group" 
			 		section of the localization algorithm.
			 		
			 '(' 	Requires the output to prepend a '(' and append a ')' to negative values. 
		*/
		
		
		
		System.out.printf("%s %b %d %n", new String("Hello"), "false", 123456);
		System.out.printf("%s %b %d %n", new String("Hello"), true, 123456);
		System.out.format("%s %b %d %n", new StringBuilder("Hello"), "false",123456);
		System.out.format("%s %b %d %n", "Hello", "FALSE", new Integer(123456));
		System.out.format("%s %b %d %n", ("Hello"), "FALSE", new Integer(123456));
		
		float a = 14562975.6543f;
		System.out.printf("%+,3f %n" ,a);
		System.out.printf("%,+20f %n" ,a);
		System.out.printf("%+,f %n" ,a);
		System.out.printf("%,+f %n" ,a);
	}
}
