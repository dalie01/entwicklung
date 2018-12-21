package dalieOCP.string.replace;

class Execute {
	public static void main(String[] args) {
		String target = "amita, matinda,shreya,mike, and anthony are arrogant";
		System.out.println(target.replaceAll("\\b\\w", "A"));
		System.out.println(target.replace("\\b\\w", "A"));// doesn’t accept a regex pattern. no efforts 
	
		String list = "6386 SE-6380--6376--4284--4280--4274 HE";
		System.out.println(list.replaceAll("64","8" ));
		System.out.println(list.replaceAll("[64]","8" ));
		System.out.println(list.replaceAll("[643]","8" ));
		 for (String str : list.split("-") ) {
             System.out.format("%s %n", str);
        }
	}
}
