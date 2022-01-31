import java.time.LocalTime;

public class T implements Comparable<T>{

    private Integer wiek;
    private LocalTime czas;
    private String nazwa;

    public T(Integer wiek, LocalTime czas, String nazwa) {
        this.wiek = wiek;
        this.czas = czas;
        this.nazwa = nazwa;
    }

    public boolean isSorted(T a, T b){
            if (a.wiek.compareTo(b.wiek) < 0)
                return false;
            else if (a.nazwa.compareTo(b.nazwa) < 0)
                return false;
            else if (a.czas.compareTo(b.czas) < 0)
                return false;
            return true;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }


//    public int compareTo(T o) {
//        if (this.wiek.compareTo(o.wiek) != 0)
//            return this.wiek - o.wiek;
//        else if (this.nazwa.compareTo(o.nazwa) != 0)
//            if (this.nazwa.compareTo(o.nazwa) > 0)
//                return 1;
//            else return -1;
//        if ((this.czas.compareTo(o.czas) == 0))
//            return 0;
//        else if ((this.czas.compareTo(o.czas) > 0))
//            return 1;
//        else return -1;
}
