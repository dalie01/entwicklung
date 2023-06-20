package dalieOCP.controlling.program.flow;



class Account {}
class StandardAccount extends Account {}
class PremiumAccount extends Account {

    int monthsRemaining () {
        return 10;
    }

}

public class E01 {

    record Point(int i, int j) {

    }

    //Java-Version 20 possible
//    static void testType(Object o) {
//        switch (o) {
//            case null -> System.out.println("null");
//            case String s -> System.out.println("string");
//            case StandardAccount a -> System.out.println("Standard-Account");
//            case PremiumAccount p -> System.out.println("Premium-Account");
//            case int[] ia -> System.out.println("Array");
//            default -> System.out.println("Something else");
//        }
//    }

    static void testType(Object o) {
        if (o == null) {
            System.out.println("null");
        } else if (o instanceof String) {
            System.out.println("string");
        } else if (o instanceof StandardAccount) {
            System.out.println("Standard-Account");
        } else if (o instanceof PremiumAccount) {
            System.out.println("Premium-Account");
        } else if (o instanceof int[]) {
            System.out.println("Array");
        } else {
            System.out.println("Something else");
        }
    }


    public static void main(String as[]) {
        testType(new PremiumAccount());
        testType(new StandardAccount());
        testType(new Account());
        testType(null);
        testType("");
        testType(new int[]{1,2,3,4,5});
    }
}