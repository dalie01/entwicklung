/*
 * Created of DV0101 on 15.09.2009 21:02:34
 *
 * Filename	  GetCallByRef.java
 */
package callByRef;

class UserType{
    
    private int content;
    
    /** @return Returns the content. */
    public int getContent() {
        return content;
    }//getContent
    /** @param content The content to set. */
    public void setContent(int content) {
        this.content = content;
    }//setContent
    
    public void toCalculateCallByReferenz(UserType intValue) {
        intValue.setContent(intValue.getContent() * 3);
    }//toCalculate
    
    public void toCalculateCallByValue(int content) {
        this.content = content * 3;
    }//toCalculate
    
}//class UserType

/**
 * Class <code>GetCallByRef</code> demonstrated call by referenz.
 *
 * @version 	1.00 15.09.2009 um 21:02:34
 * @author 		DV0101
 * <br>
 */
public class GetCallByRef {
    /* Class to demonstrate of CallByReferenz */

    public static void main(String[] args) {
        UserType userType = new UserType();
        userType.setContent(5);
        System.out.println("Value.: " + userType.getContent());
        userType.toCalculateCallByReferenz(userType);
        System.out.println("toCalculate Value.: " + userType.getContent());
        
        userType.setContent(5);
        System.out.println("Value.: " + userType.getContent());
        userType.toCalculateCallByValue(5);
        System.out.println("toCalculate Value.: " + userType.getContent());       
    }//main

}
