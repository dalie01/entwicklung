package dalieOCP.collection.set.treeSet._practice;

import java.util.TreeSet;

public class P03 {

    public static void main(String[] args) {
        var set = new TreeSet<>();
        set.add(Integer.valueOf(1));
        set.add((int) Short.valueOf("2"));
        System.out.println(set);

        int i = 5;
        float f = 5.5f;
        double d = 3.8;
        char c = 'a';
        if (i == f)
            c++;
        if( ( (int)(f + d)) == ( (int)f + (int)d)) {
            c += 2;
        }
        System.out.println(c);

    }

}