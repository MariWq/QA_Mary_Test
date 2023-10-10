package src;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(1000);

        int[] MyArrey = new int[20];

        for (int i = 0; i < MyArrey.length; i++) {
            MyArrey[i] = rand.nextInt(1000);
            System.out.println(MyArrey[i]);
        }
    }
}
