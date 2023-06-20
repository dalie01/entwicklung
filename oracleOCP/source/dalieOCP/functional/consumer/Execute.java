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

	/**
	 * default <T> T withGroup(Function<Group, T> helper):
	 * This is a default method declaration in the interface.
	 * Default methods were introduced in Java 8 and allow interfaces to provide method implementations.
	 * <T>: This is a generic type parameter that specifies the type of the return value.
	 *  T: This is the return type of the method.
	 *  withGroup: This is the name of the default method.
	 *  Function<Group, T> helper: This is the parameter of the method.
	 *  It is a functional interface called Function from the java.util.function package, which takes a Group object as input and returns a value of type T.
	 *  The default keyword indicates that this method has a default implementation within the interface itself.
	 *  This means that classes implementing the Group interface are not required to provide their own implementation of this method.
	 *  Instead, they can use the default implementation provided by the interface.
	 *  The purpose of this withGroup() method is to provide a way to apply a helper function to the Group object.
	 *  It takes a Function as an argument and applies that function to the Group object (this).
	 *  The return value of the function is then returned by the withGroup() method.
	**/
	 default <T> T withGroup(Function<Group, T> helper) {
		return helper.apply(this);
	}

}

public class Execute {

	public static void main(String[] args) {
		Group demo = createGroup("1","Test01");
		/**
		 * Here, Group::getKey is a method reference to the getKey() method defined in the Group interface.
		 * It represents a function that takes a Group object as input and produces a String result.
		 * When apply() is called on this function, it will invoke the getKey() method on the group object, and returning the key value.
		**/
		String key = demo.withGroup(Group::getKey);
		out.format("Group Key: %s %n",key);

		String name = demo.withGroup(Group::getName);
		out.format("Group Name: %s %n",name);

		withGroup(group -> {

			out.format("1. Group Key: %s Group Name: %s %n", group.getKey(), group.getName());
		});
		
		withGroup("3", "Test03", group -> {
			
			out.format("2.  Group Key: %s Group Name: %s %n", group.getKey(), group.getName());
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
		Group group = new GroupImpl("2", "Test02");
		return group;
	}

	private static Group createGroup(String key, String name) {
		Group group = new GroupImpl(key, name);
		return group;
	}

}