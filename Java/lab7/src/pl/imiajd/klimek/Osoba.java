package pl.imiajd.klimek;

public class Osoba {
    String nazwisko;
    int rokUrodzenia;

    public Osoba(String nazwisko, int rokUrodzenia){
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public class Student{
        String kierunek;

        public Student(String kierunek){
            this.kierunek = kierunek;
        }

        public String getKierunek() {
            return kierunek;
        }
    }

    public class Nauczyciel{
        int pensja;

        public Nauczyciel(int pensja){
            this.pensja = pensja;
        }

        public int getPensja() {
            return pensja;
        }
    }
}
