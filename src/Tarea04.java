import java.util.ArrayList;
import java.util.Random;

public class Tarea04 {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<Integer>();
        ArrayList<Integer> arrayCopia;
        Random generador=new Random();
        for (int i = 0; i<=9;i++){
            int numeroAleatorio=generador.nextInt(100)+1;
            array.add(numeroAleatorio);
        }
        arrayCopia=(ArrayList<Integer>)array.clone();
        arrayCopia.set(9,-7);

        System.out.println("origunañ"+array);
        System.out.println("copia"+arrayCopia);
    }
}
