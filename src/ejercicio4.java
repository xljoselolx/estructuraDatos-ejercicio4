import java.util.Scanner;
/**Programa que declare un vector de diez elementos enteros y pida números para
 * rellenarlo hasta que se llene el vector o se introduzca un número negativo.
 * Entonces se debe imprimir el vector (sólo los
 elementos introducidos)*/

public class ejercicio4
{
    //arreglo
    Integer [] vector;

    Scanner scanner;
    public ejercicio4()
    {
        this.vector = new Integer[10];
        scanner =new Scanner(System.in);
    }
        public void ejecutar ()
        {
            //vector segun condiciones

            int i = 0;
            while (i < vector.length)
            {
                int numero = scanner.nextInt();
                if (numero >= 0)
                {
                    vector[i]= numero;
                    i++;
                }
                else
                { break;
                }
            int j=0;
                while (j<vector.length)
                {
                    if (vector[j] != null)
                    {
                        System.out.println("vector[" + j + "]: " + vector[j]);
                        j++;
                    }else
                    {break;}
                }

            }


        }

}
