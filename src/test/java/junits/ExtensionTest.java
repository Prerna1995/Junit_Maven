package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

public class ExtensionTest {
    @ExtendWith(EnvExtension.class)
    
    @Test
    public void junit1() {
        
        assertTrue(StringsFunctions.isPalindrome("radar"));
        System.out.println("Inside Test");
        
    }

 

}