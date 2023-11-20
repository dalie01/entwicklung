package dalieOCP.streams._practics;

import java.util.ArrayList;
import java.util.function.Predicate;

public class P01 {
    
    public static void main(String[] args) {
        var list = new ArrayList<Double>();
        list.add(21.45);
        list.add(21.5d);
        list.add(22.6);

        Predicate<Double> ip = i -> {return i > 21.46;};        
        /** alternative DoublePredicate dp = d -> d > 33.5; */

        for (Double d : list) {
            if (ip.test(d)) {
                System.out.println(d);
            }
        }
    }
}
