/**
 * <h6>Apply object compositions principles (including HAS-A relationship)</h6>
 * 
 * <p>
 * 	Object composition enables you to use the existing functionality
 * 	of classes without extending them. The approach is simple: create and
 * 	use objects of other classes in your own class.
 * </p>
 * 
 * <p>
 * Just to revise, composition and Inheritance are ways to reuse code to 
 * get additional functionality. In Inheritance, a new class, 
 * which wants to reuse code, inherit an existing class, known as super class. 
 * This new class is then known as sub class. On composition, a class, 
 * which desire to use functionality of an existing class, doesn't inherit, 
 * instead it holds a reference of that class in a member variable, 
 * that’s why the name composition. 
 * Inheritance and composition relationships are also 
 * referred as IS-A and HAS-A relationships. Because of IS-A relationship, 
 * an instance of sub class can be passed to a method, 
 * which accepts instance of super class. 
 * This is a kind of Polymorphism, which is achieved using Inheritance. 
 * A super class reference variable can refer to an instance of sub class. 
 * By using composition, you don’t get this behavior, 
 * but still it offers a lot more to tilde the balance in its side.
 * </p>
 * 
 * 
 * <p>
 * In short, don't use Inheritance just for the sake of code reuse, 
 * Composition allows more flexible and extensible mechanism to reuse code. 
 * Make sure you don't forget this rule, if you don't to do this :)
 * Always favor composition over Inheritance in Java and OOP
 * </p>
 * 
 * @author dalie.de
 *
 */
package dalieOCP.object.relationship.compositionPrinciples;