package dalieOCP.steams;

import java.util.stream.IntStream;

public class Execute {
    public static void main(String[] args) {

        /** 
         * The IntStream.range(3, 8) method call creates 
         * an IntStream that contains the integers 
         * from 3 (inclusive) to 8 (exclusive). 
         * So the resulting stream contains the integers 
         * 3, 4, 5, 6, and 7.*/
        var in = IntStream.range(3, 8);

        /**
         * The peek(System.out::println) method call 
         * on the stream prints each element 
         * to the console as it is processed.
         * So the output will be: 3,4,5,6,7
         * 
         * The map(x -> x * 2) method call on the stream 
         * multiplies each element by 2. 
         * So the resulting stream contains the integers 
         * 6, 8, 10, 12, and 14.
         */
        var ins = in.peek(System.out::println).map(x -> x * 2);

        /**
         * The noneMatch(x -> x % 2 != 0) method call on the stream 
         * checks if any of the stream elements are odd. 
         * Since all the elements in the stream are even 
         * (due to the multiplication by 2), 
         * the method call returns true.
         * 
         * The System.out.println call prints the result 
         * of the noneMatch method call to the console. 
         * In this case, it prints true.
         * So the output will be: 3,4,5,6,7 true
         */
         System.out.println(ins.noneMatch(x -> x % 2 != 0));
         
         /** 
         * The noneMatch method works by iterating over the elements 
         * in the stream and applying the given predicate to each element. 
         * If the predicate returns true for any element, 
         * then the noneMatch method immediately returns false. 
         * Otherwise, if the predicate returns false for all elements, 
         * then the noneMatch method returns true.
         * 
         * In summary, the noneMatch method is a convenient way 
         * to check if no elements in a stream match a certain condition, 
         * using a predicate that is specified by the programmer.
         * 
         */
    }
}
