package dalieOCP.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Execute {

    /**
     * In this example we have a list of strings and we want to filter all the strings that start with "c",
     * convert them to uppercase and sort the result.
     * Here map is used to convert every string in the list to uppercase.
     * The String::toUpperCase method is applied to each element of the stream
     * and the result is a new stream whose elements are the strings converted to uppercase.
     * */
    public static void main(String[] args) {
        var myList = List.of("a1", "b1", "c2", "c1"); // List.of() returns an immutable list
        myList.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        /**
         * Zusammengefasst wird map in Java Streams verwendet,
         * um eine Funktion auf jedes Element eines Streams anzuwenden
         * und einen neuen Stream mit den Ergebnissen zu erstellen.
         * */


        // Ein weiteres Beispiel mit Optional
        // um mit der möglichen null-Liste umzugehen.
        // Optional.ofNullable(myList) gibt ein Optional-Objekt zurück,
        // das die Liste enthält oder leer ist, wenn die Liste null ist.
        // Mit orElseGet(Arrays::asList) stellen wir sicher, dass wir eine leere Liste erhalten,
        // wenn myList null ist, was verhindert, dass eine NullPointerException ausgelöst wird,
        // wenn wir den Stream aufrufen.

        Optional<List<String>> optionalList = Optional.ofNullable(myList);// Optional.ofNullable(myList) returns an Optional object containing the list or empty if the list is null
        List<String> filteredList = optionalList.orElseGet(Arrays::asList).stream() // orElseGet(Arrays::asList) makes sure we get an empty list if myList is null, which prevents a NullPointerException from being thrown when we call the stream
                .filter(s -> s.startsWith("c")) // filter all strings that start with "c"
                .map(String::toUpperCase) // convert all strings to uppercase
                .sorted()   // sort the result
                .collect(Collectors.toList());  // collect the result into a list

        System.out.println(filteredList); // Ausgabe: [C1, C2] oder "Die Liste ist null.", wenn myList null ist
    }

}