import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tarea0502 {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<Integer>();
        Scanner teclado=new Scanner(System.in);
        Random generador=new Random();
        for (int i = 0; i<=9;i++){
            int numeroAleatorio=generador.nextInt(50)+1;
            array.add(numeroAleatorio);

        }
        System.out.println("El contenido del ArrayList original es: "+array);
        System.out.println("Que valor quiere buscar en el array?");
        int entrada=teclado.nextInt();

        for (int i = 0; i<=array.size()-1;i++){
            if (array.get(i) == entrada){
                System.out.println(entrada+" se encuentra en el ArrayList.");
            }
        }
    }
}
