package dalieOCP.functional.consumer;

import static java.lang.System.out;
import java.util.function.Consumer;
import java.util.function.Function;

class GroupImpl implements Group {
	
    private String key;
    private String name;
    
    public GroupImpl(String key, String name) {
    	this.key = key;
    	this.name = name;
	}
    
    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

}

interface Group {

    public String getKey();

    public String getName();

	
//	default <T> T withGroup(Function<Group, T> helper) {
//		return helper.apply(this);
//	}

}

public class Execute {

	public static void main(String[] args) {
		withGroup(group -> {

			out.format("1. %s %s %n", group.getKey(), group.getName());
		});
		
		withGroup("2", "Hello", group -> {
			
			out.format("2. %s %s %n", group.getKey(), group.getName());
		});
	}

	public static void withGroup(final Consumer<Group> consumer) {
		Group group = createGroup();
		try {
			consumer.accept(group);
		} finally {
			out.format("withGroup %s %s %n", group.getKey(), group.getName());
		}
	}
	
	public static void withGroup(String key, String name, final Consumer<Group> consumer) {
		Group group = createGroup(key, name);
		try {
			consumer.accept(group);
		} finally {
			out.format("withGroup %s %s %n", group.getKey(), group.getName());
		}
	}

	private static Group createGroup() {
		Group group = new GroupImpl("1", "Test");
		return group;
	}

	private static Group createGroup(String key, String name) {
		Group group = new GroupImpl(key, name);
		return group;
	}

}
