package dalieOCP.steams._practics;

import java.util.stream.Stream;

public class P02 {
    public static void main(String[] args) {
        var stream = Stream.of("java","OCAJP");
        System.out.println( stream.min(
            (s1,s2) -> 
                Integer.compare(s2.length(), s1.length())
        ).get());
    }
}
