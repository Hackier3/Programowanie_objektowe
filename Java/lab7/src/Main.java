import pl.imiajd.klimek.Adres;
import pl.imiajd.klimek.Osoba;

public class Main {
    public static void main(String args []) {
        Adres moj_dom = new Adres("", 3, "Nowa Wieś", "09-310");
        System.out.println(moj_dom.pokaz());

        Osoba filip = new Osoba("Klimek", 2002);
        Osoba.Student przedmiot = filip.new Student("informatyka");
        Osoba.Nauczyciel kasa = filip.new Nauczyciel(2200);
        System.out.println(filip.getNazwisko() + " " + przedmiot.getKierunek() + " " + kasa.getPensja());
    }
}
