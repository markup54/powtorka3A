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
