import java.security.spec.RSAOtherPrimeInfo;

public class Osoba {
    private int idOsoby;
    private String imieOsoby;
    public static int liczbaObiektow = 0;

    public Osoba(int idOsoby, String imieOsoby) {
        this.idOsoby = idOsoby;
        this.imieOsoby = imieOsoby;
        liczbaObiektow++;
    }

    public Osoba() {
        idOsoby = 0;
        imieOsoby ="";
        liczbaObiektow++;
    }

    public Osoba(Osoba osoba) {
        this.idOsoby = osoba.idOsoby;
        this.imieOsoby = osoba.imieOsoby;
        liczbaObiektow++;
    }
    public void wypiszDane(String imiePrzekazane){
        if(imieOsoby ==""){
            System.out.println("Brak danych");
        }
        else{
            System.out.println("Cześć "+imiePrzekazane+" mam na imię "+imieOsoby);
        }
    }
}
