package sentenciafor;
import java.util.Scanner;
public class SentenciaFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma=0,f,valor,promedio;
        for(f = 1; f<= 10; f++){
            System.out.println("Ingrese valor:");
            valor = teclado.nextInt();
            suma +=valor;
        }
        System.out.println("La suma es:"+suma);
        System.out.println("El promedio es:"+suma/10);
    }
}