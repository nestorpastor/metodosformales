package aserciones;

import org.junit.Test;


public class MetodoTest {
    @Test
    public void testcantPositivosConsecutivos() {
        System.out.println("Test Case metodo cantPositivosConsecutivos");
        // arrange
        int[] c = {-100, 0, 21, -1, 0, 0};
        int expResult = 0;
        // act
        int result = Metodo.cantPositivosConsecutivos(c);
         // assert
         System.out.println(result);
        assert result == expResult: String.format("El número devuelto no cumple la postcondición (%d)", result);
    }
    
    @Test
    public void testcantPositivosConsecutivos2() {
        System.out.println("Test Case metodo cantPositivosConsecutivos2");
        // arrange
        int[] c = {1, 70, 0, 1, 1, 3};
        int expResult = 3;
        // act
        int result = Metodo.cantPositivosConsecutivos(c);
         // assert
         System.out.println(result);
        assert result == expResult: String.format("El número devuelto no cumple la postcondición (%d)", result);
    }
    
}