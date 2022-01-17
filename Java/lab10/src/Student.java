import pl.imiajd.klimek.Osoba;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>{
    public Student(String nazwisko, LocalDate dataUrodzenia) {
        super(nazwisko, dataUrodzenia);
    }

    private double sredniaOcen;

    @Override
    public int compareTo(Osoba o) {
        return super.compareTo(o);
    }
}
