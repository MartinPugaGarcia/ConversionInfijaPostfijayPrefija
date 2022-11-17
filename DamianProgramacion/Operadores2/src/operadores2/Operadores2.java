package operadores2;
import java.util.Scanner;
public class Operadores2 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba el numero:");
        numero=entrada.nextInt();
        switch(numero){
            case 1 -> System.out.println("Tengo un lagarto");
            case 2 -> System.out.println("Tengo un perro");
            case 3 -> System.out.println("Tengo un gato");
            case 4 -> System.out.println("Tengo una serpiente");
            case 5 -> System.out.println("Tengo un loro");
        }
    }
}