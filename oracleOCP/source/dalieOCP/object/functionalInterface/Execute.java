package dalieOCP.object.functionalInterface;

/**
 * The Calculator interface is marked with the @FunctionalInterface annotation to indicate that it is a functional interface.
 * It has a single abstract method called calculate() that takes two int parameters and returns an int.
 * The Calculator interface also includes a default method called add(), which provides an implementation for adding two numbers.
 * This method can be overridden by implementing classes if desired.
 * Additionally, the Calculator interface includes a static method called subtract(), which provides an implementation for subtracting two numbers.
 * This method can be called directly on the interface without needing an instance.
**/
 @FunctionalInterface
interface Calculator {
    /**
     * "It must have exactly one abstract method": A functional interface must define exactly one abstract method.
     *
     * This abstract method represents the behavior or functionality that the interface describes.
     * It typically declares the parameters and return type of the behavior.
    **/
     int calculate(int a, int b);

    default int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }
}


public class Execute {

    public static void main(String[] args) {
        Calculator multiply = (a, b) -> a * b;
        int result = multiply.calculate(5, 3);
        System.out.println("Result: " + result);

        int sum = multiply.add(2, 3);
        System.out.println("Sum: " + sum);

        int difference = Calculator.subtract(7, 4);
        System.out.println("Difference: " + difference);
    }

}
/**
 * The `@FunctionalInterface` annotation in Java is used to indicate that an interface is intended to be a functional interface.
 * A functional interface is an interface that specifies a single abstract method and is intended to be used as the basis for lambda expressions or method references.
 *
 * The `@FunctionalInterface` annotation is not strictly required for a functional interface to be functional.
 * It is optional but highly recommended to provide clarity and communicate the intended usage of the interface.
 *
 * Here are the characteristics and implications of using the `@FunctionalInterface` annotation:
 *
 * 1. Single Abstract Method (SAM): The interface annotated with `@FunctionalInterface` must have exactly one abstract method.
 *    This single abstract method defines the contract or behavior associated with the interface.
 *    Additional default or static methods can be present in the interface, but they should not interfere with the single abstract method.
 *
 * 2. Lambda Expressions and Method References: The purpose of a functional interface is to be used with lambda expressions or method references,
 *    which provide a concise way to implement the single abstract method.
 *    The `@FunctionalInterface` annotation serves as a signal to the developer that the interface is intended to be used in this functional programming manner.
 *
 * 3. Compiler Enforced: When an interface is annotated with `@FunctionalInterface`, the Java compiler enforces the rule of having only one abstract method.
 *    If there are multiple abstract methods in the interface, the compiler will raise a compilation error.
 *
 * 4. API Design and Clarity: The `@FunctionalInterface` annotation helps to improve the API design by clearly indicating the intention of the interface.
 *    It provides a hint to other developers that the interface is meant to be used as a functional interface,
 *    encouraging them to implement it using lambda expressions or method references.
 *
 * By using the `@FunctionalInterface` annotation, you make your intention clear and benefit from the compiler's enforcement of the single abstract method rule.
 * It helps ensure that the interface is used appropriately in functional programming scenarios and promotes code readability and maintainability.
 * It's important to note that the `@FunctionalInterface` annotation is optional, and an interface can still be used as a functional interface without it.
 * However, it's good practice to include the annotation to explicitly declare the interface's functional nature and provide clarity to other developers using the interface.
 **/