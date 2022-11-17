package operadores;
import java.util.Scanner;
public class Operadores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el segundo entero:");
        int numero2=entrada.nextInt();
        System.out.println("Escriba el primer entero:");
        int numero1=entrada.nextInt();
        if(numero1==numero2){
            System.out.printf("%d==%d\n",numero1,numero2);
        }
        if(numero1!=numero2){
            System.out.println(numero1+"!="+numero2+"\n");
        }
        if(numero1<numero2){
            System.out.printf("%d<%d\n",numero1,numero2);
        }
        if(numero1>numero2){
            System.out.printf(numero1+">"+numero2+"\n");
        }
    }
}