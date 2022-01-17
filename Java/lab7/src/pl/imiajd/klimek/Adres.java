package pl.imiajd.klimek;

public class Adres{
    private String ulica;
    private int numer_domu;
    private Integer numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;

    Adres(String ulica, int numer_domu, int numer_mieszkania, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }
    public Adres(String ulica, int numer_domu, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public String pokaz(){
        String napis = this.kod_pocztowy + " " + this.miasto + "\n" + this. ulica + " " + this.numer_domu;
        if (this.numer_mieszkania != null)napis += " " + this.numer_mieszkania;
        return napis;
    }
}
