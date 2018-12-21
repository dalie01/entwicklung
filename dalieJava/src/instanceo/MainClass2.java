/*
 * MainClass2.java 
 * @author Administrator on 24.02.2009 um 21:04:38 
 * 
 * no Copyright
 */
package instanceo;
/**
 * <b>Class</b>MainClass2:<br>Only for Demonstration.<br>
 * 
 * @version 1.00 on 24.02.2009 um 21:04:38
 * @author dv0101
 * <br><br>
 * Since a subclass 'is a' type of its superclass, the following if statement, 
 * where Child is a subclass of Parent, returns true.
 */
class Parent {
   public Parent() {
   }//Parent
}//class Parent

class Child extends Parent {
    public Child() {
      super();
    }//Child
}//class Child

public class MainClass2 {
    /* used for demonstration of instecneof */

    public static void main(String[] args) {
        Child child = new Child();
        if (child instanceof Parent) {
          System.out.println("true");
        }//endif
    }//main

}//class MainClass2

