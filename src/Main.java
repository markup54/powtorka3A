import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static ArrayList<Integer> losujLiczby(){
        ArrayList<Integer> wylosowane = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            wylosowane.add((int)(Math.random()*51+100));
        }
        return wylosowane;
    }
    public static void main(String[] args) {
        ArrayList<Integer> wylosowaneLiczby = losujLiczby();
        System.out.println(wylosowaneLiczby);
    }
}