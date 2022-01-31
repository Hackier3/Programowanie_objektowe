import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<T> mojaLista = new ArrayList<>();
        mojaLista.add(new T(26, LocalTime.of(12, 3 ,68), "Marek"));
        mojaLista.add(new T(26, LocalTime.of(10, 3 ,68), "Krystian"));
        mojaLista.add(new T(26, LocalTime.of(11, 3 ,68), "Marek"));
        mojaLista.add(new T(26, LocalTime.of(11, 3 ,68), "Agata"));
        mojaLista.add(new T(26, LocalTime.of(12, 3 ,68), "Filip"));

        for (T t : mojaLista) {
            t.isSorted(t, t);
        }
    }
}
