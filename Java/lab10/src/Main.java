import pl.imiajd.klimek.Osoba;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        grupa.add(new Osoba("Debowska", LocalDate.of(2002, 02, 28)));
        grupa.add(new Osoba("Debowska", LocalDate.of(2002, 02, 27)));
        grupa.add(new Osoba("Sadowski", LocalDate.of(2001, 04, 30)));
        grupa.add(new Osoba("Wackowska", LocalDate.of(2021, 04, 30)));
        grupa.add(new Osoba("Klimek", LocalDate.of(2002, 01, 26)));

        for (Osoba osoba : grupa) {
            System.out.println(osoba.toString());
        }

        grupa.sort(null);

        for (Osoba osoba : grupa) {
            System.out.println(osoba.toString());
        }
    }
}