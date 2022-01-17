import ins.Flet;
import ins.Fortepian;
import ins.Instrument;
import ins.Skrzypce;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String args []) {
        ArrayList<Instrument> orkiestra = new ArrayList<>();
        orkiestra.add(new Flet((LocalDate.of(2002, 12, 1)), "Yamaha"));
        orkiestra.add(new Fortepian((LocalDate.of(2001, 1, 5)), "Yamaha"));
        orkiestra.add(new Skrzypce((LocalDate.of(2002, 12, 1)), "Yamaha"));
        orkiestra.add(new Flet((LocalDate.of(2002, 12, 1)), "Yamaha"));
        orkiestra.add(new Flet((LocalDate.of(2002, 12, 1)), "Yamaha"));

        for (Instrument instrument : orkiestra){
            System.out.println(instrument.toString());
            System.out.println(instrument.dzwiek());
        }

        Flet flet1 = new Flet((LocalDate.of(2002, 12, 1)), "Yamaha");
        Flet flet2 = new Flet((LocalDate.of(2002, 12, 1)), "Yamaha");
        Flet flet3 = flet1;
        Fortepian fortacz = new Fortepian((LocalDate.of(2002, 12, 1)), "Yamaha");

        System.out.println(flet1.equals(flet2));//t
        System.out.println(flet1.equals(flet3));//t
        System.out.println(fortacz.equals(flet1));//f

        System.out.println(flet1==(flet2));//f
        System.out.println(flet1==(flet3));//t
        //System.out.println(fortacz==(flet1));
    }
}
