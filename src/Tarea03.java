import java.util.ArrayList;
import java.util.Random;

public class Tarea03 {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<Integer>();
        Random generador=new Random();
        for (int i = 0; i<=999;i++){
            int numeroAleatorio=generador.nextInt(90)+9;
            array.add(numeroAleatorio);
        }
        System.out.println("El contenido del array: "+array);
    }
}
