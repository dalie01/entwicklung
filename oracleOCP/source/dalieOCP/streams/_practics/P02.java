package dalieOCP.streams._practics;

import java.util.stream.Stream;

public class P02 {
    public static void main(String[] args) {
        var stream = Stream.of("java","OCAJA");
        /**
         * The java.util.stream.Stream.min function is a operation 
         * in the Java Stream API that returns the minimum element 
         * in a stream according to the provided comparator. 
         * It returns an Optional object containing the minimum value 
         * if the stream is not empty, or an empty Optional if the stream is empty.
         */
        System.out.println( stream.min(
            /** 
             * the value 0 if x == y; 
             * a value less than 0 if x < y; 
             * and a value greater than 0 if x > y */
            (s1,s2) -> Integer.compare(s2.length(), s1.length())).get()
        );
    }
}
