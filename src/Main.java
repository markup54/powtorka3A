import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {

    public static ArrayList<Integer> losujLiczby(){
        ArrayList<Integer> wylosowane = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            wylosowane.add((int)(Math.random()*51+100));
        }
        return wylosowane;
    }
    public static int sumaZListy(ArrayList<Integer> liczbyDoSumowania){
        int suma =0;
        for (Integer liczba: liczbyDoSumowania) {
            suma =suma +liczba;
        }
        return suma;
    }
    public static HashSet<Integer> zapiszDoZbioru(ArrayList<Integer> liczbyDoZapisu){
        HashSet<Integer> zbior = new HashSet<>();
        zbior.addAll(liczbyDoZapisu);
        return zbior;

    }
    public static void ileRazy(ArrayList<Integer> wszystkieLiczby){
        HashSet<Integer> bezpowt = zapiszDoZbioru(wszystkieLiczby);
        ArrayList<Integer>ilePowtorzen = new ArrayList<>();
        for (int i = 0; i < 151; i++) {
            ilePowtorzen.add(0);
        }
        for (Integer liczba:bezpowt
             ) {
            for (Integer liczbapowt: wszystkieLiczby
                 ) {
                if(liczba == liczbapowt){
                    ilePowtorzen.set(liczba,ilePowtorzen.get(liczba)+1);
                }
            }
        }
        int maksimum = 0;
        for (int ile:ilePowtorzen) {
            if(maksimum<ile)
                maksimum = ile;
        }
        System.out.println(ilePowtorzen);
        System.out.println(maksimum);
        System.out.println(ilePowtorzen.indexOf(maksimum));
    }
    public static void main(String[] args) {
        ArrayList<Integer> wylosowaneLiczby = losujLiczby();
        System.out.println(wylosowaneLiczby);
        System.out.println(sumaZListy(wylosowaneLiczby));
        HashSet<Integer> liczbyBezPowtorzen = zapiszDoZbioru(wylosowaneLiczby);
        System.out.println("liczb bez powtórzeń "+liczbyBezPowtorzen.size());
        ileRazy(wylosowaneLiczby);
        for (Integer liczba: wylosowaneLiczby
             ) {
            if(liczba % 10 == 1){
                System.out.println(liczba);
            }
        }
    }
}