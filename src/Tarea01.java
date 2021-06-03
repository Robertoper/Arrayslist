import java.util.ArrayList;

public class Tarea01 {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<Integer>();
        for (int i = 0; i<=9;i++){
            array.add(-211);
        }
        for (int i = 0; i<=array.size()-1;i++){
            System.out.println("La posición "+i+" contiene "+ array.get(i));
        }
    }
}
