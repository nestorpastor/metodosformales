package aserciones;

import java.util.Arrays;

public class Metodo {

    public static void main(String[] args) {
 
      /*  Crear un metodo que reciba un arreglo por parametro y calcule 
        la cantidad de valores positivos consecutivos en ese arreglo 
        y devuelva el numero entero con la cantidad mas grande de positivos 
        consecutivos encontrados en el arreglo.
     */
    
        System.out.println("Métodos Formales");
 
    }
    
    public static int procesarArray(int[] tabla) {
        int i = 0;
        while (i < tabla.length && tabla[i] != 0 )  {
              i = i + 1;
        }
        if (i < tabla.length) return i;
        else return -1;
    }
    
    public static int cantPositivosConsecutivos(int[] columna) {
        System.out.println(Arrays.toString(columna));
        int i = 0;
        int max = 0;
                while (i < columna.length)  {
                    while (i < columna.length && columna[i] <= 0){
                        i++;
                    }
                    if (i < columna.length){
                        int positivos = 0;
                        while (i < columna.length && columna[i] > 0){
                            positivos++; i++;
                        }
                        if(positivos > max && positivos > 1){
                            max = positivos;
                        }
                    }
        }
        return max;
    }
    
}