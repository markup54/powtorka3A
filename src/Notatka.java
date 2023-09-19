/**
 * Klasa: Notatka
 * opis: klasa przechowująca informacje o notatce
 * pola: licznikNotatek - pole statyczne przechowujące liczbę utworzonych obiektów
 *         unikatowyNumer - nr notatki
 *         tytul - tytul notatki
 *         tresc - tresc notatki
 * autor: 00000000000000000000
 */
public class Notatka {
    private static int licznikNotatek;
    private int unikatowyNumer;
    private String tytul;
    private String tresc;

    public Notatka(String tytul, String tresc) {
        this.tytul = tytul;
        this.tresc = tresc;
        licznikNotatek++;
        unikatowyNumer = licznikNotatek;

    }
    public void wypiszTytuTresc(){
        System.out.println("Tytuł "+tytul+" treść: "+tresc);
    }
    public void wypiszWszystko(){
        System.out.println(tytul+","+tresc+","+unikatowyNumer+","+licznikNotatek);
    }
}
