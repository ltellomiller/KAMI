import java.util.Scanner;

public class cliente {

          public static void main (String args[])
        {

            System.out.println ("Por favor introduzca en nombre del cliente a guardar:");

            Scanner entradaEscaner = new Scanner (System.in);

            String entradaTeclado = entradaEscaner.nextLine ();

            System.out.println ("El cliente : \"" + entradaTeclado +"\" ha sido guardado en base de datos");
        }

}
