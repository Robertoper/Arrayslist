import java.util.ArrayList;
import java.util.Random;

public class Tarea09 {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<Integer>();
        Random generador=new Random();
        int posicionMaxima=0;
        for (int i = 0; i<=9;i++){
            int numeroAleatorio=generador.nextInt(100)+1;
            array.add(numeroAleatorio);

        }
        System.out.println("El contenido del ArrayList original es: "+array);
        int numeroMaximo= array.get(0);
        for (int i = 0; i<array.size()-1;i++){
            if (numeroMaximo< array.get(i)){
                numeroMaximo= array.get(i);
                posicionMaxima=i;
            }
        }
        System.out.println("El número más alto dentro del ArrayList es "+numeroMaximo+" en la posicion "+posicionMaxima);
    }
}
