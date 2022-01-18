package pl.imiajd.grzes;
import java.util.LinkedList;

public class zadanie1 {

    public static void main(String[] args) {
	LinkedList<String> nazwiska = new LinkedList<>();
    nazwiska.add("Brzeczyszczykiewicz");
    nazwiska.add("Hans");
    nazwiska.add("Jukon");
    nazwiska.add("Rafon");
    nazwiska.add("Talarski");
    nazwiska.add("Winiary");
    System.out.println(nazwiska);
    redukuj(nazwiska, 2);
    System.out.println(nazwiska);
    }

    public static void redukuj(LinkedList<String> pracownicy, int n){
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
