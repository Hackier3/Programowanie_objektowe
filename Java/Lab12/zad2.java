package pl.imiajd.grzes;
import java.util.LinkedList;

public class zadanie2 {

    public static void main(String[] args) {
        LinkedList<String> nazwiska = new LinkedList<>();
        nazwiska.add("Brzeczyszczykiewicz");
        nazwiska.add("Hans");
        nazwiska.add("Jukon");
        nazwiska.add("Rafon");
        nazwiska.add("Talarski");
        nazwiska.add("Winiary");
        System.out.println(nazwiska);
        redukuj(nazwiska, 3);
        System.out.println(nazwiska);
        LinkedList<Integer> liczby = new LinkedList<>();
        liczby.add(1);
        liczby.add(2);
        liczby.add(3);
        liczby.add(4);
        System.out.println(liczby);
        redukuj(liczby, 2);
        System.out.println(liczby);
    }

    public static <T> void redukuj(LinkedList<T> pracownicy, int n){
        int counter = 0;
        for(int i=0; i<pracownicy.size();i++){
            counter += 1;
            if(counter == n){
                pracownicy.remove(i);
                counter = 1;
            }
        }
    }
}
