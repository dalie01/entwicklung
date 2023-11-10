package dalieOCP.optional;

import java.util.NoSuchElementException;
import java.util.Optional;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * This class demonstrates the usage of Optional class in Java.
 */
public class Execute {
        public static void main(String[] args) {
            String str = null; // This could be null
            var optional = Optional.ofNullable(str);//This is how you create an Optional       
            if (optional.isPresent()) {
                System.out.println(optional.get());
            }
            optional = Optional.of(null);// Line 12 will throw a NullPointerException
            if (optional.isPresent()) {
                System.out.println(optional.get());
            }
        }

        @Test
        public void testOptionalWithValue() {
            String str = "Hello, world!";
            var optional = Optional.ofNullable(str);
            assertTrue(optional.isPresent());
            assertEquals(str, optional.get());
        }

        @Test
        public void testOptionalWithNull() {
            var optional = Optional.ofNullable(null);
            assertFalse(optional.isPresent());
            assertThrows(NoSuchElementException.class, optional::get);
        }
    
}