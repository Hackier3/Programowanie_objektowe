package pl.imiajd.klimek;
import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable<Osoba>{
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia){
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String toString(){
        return getClass().getName() + "[" + this.nazwisko + " " + this.dataUrodzenia.getYear() + "-" + this.dataUrodzenia.getMonth() + "-" + this.dataUrodzenia.getDayOfMonth() + "]";
    }

    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
        Osoba osoba = (Osoba) obj;
        return this.compareTo(osoba) == 0;
    }

    @Override
    public int compareTo(Osoba o) {
        int compareNazwisko = nazwisko.compareTo(o.nazwisko);
        if( compareNazwisko != 0) return compareNazwisko;
        else return dataUrodzenia.compareTo(o.dataUrodzenia);
    }
}
