import java.util.Arrays;

class RachunekBankowy{
    static double rocznaStopaProcentowa;
    private double saldo;

    public double obliczMiesieczneOdsetki(){
        double odsetki = this.rocznaStopaProcentowa * this.saldo / 12;
        this.saldo = this.saldo + odsetki;
        return odsetki;
    }

    static void setRocznaStopaProcentowa(double nowaStopaProc){
        rocznaStopaProcentowa = nowaStopaProc;
    }

    public double getRocznaStopaProcentowa(){
        return this.rocznaStopaProcentowa;
    }

    public void setSaldo(double noweSaldo){
        this.saldo = noweSaldo;
    }

    public double getSaldo(){
        return this.saldo;
    }
}

class IntigerSet {
    boolean[] array = new boolean[100];

    IntigerSet(){
        for (int i=0; i <= 99; i++) array[i]=false;
    }

    public boolean[] union(boolean[] array1, boolean[] array2){
        boolean[] array = new boolean[100];

        for (int i=0; i<100; i++)
        {
            if (array1[i]==true || array2[i]==true) array[i]=true;
            else array[i]=false;
        }
        return array;
    }

    public boolean[] intersection(boolean[] array1, boolean[] array2){
        boolean[] array = new boolean[100];

        for (int i=0; i<100; i++)
        {
            if (array1[i]==true && array2[i]==true) array[i]=true;
            else array[i]=false;
        }
        return array;
    }

    public void insertElement(int liczba){
        if (liczba>=101);
        else this.array[liczba-1]=true;
    }

    public void deleteElement(int liczba){
        if (liczba>=101);
        else if (this.array[liczba-1]==true)this.array[liczba-1]=false;
    }

    public String toString(){
        String napis="";
        for (int i=0; i <= 99; i++)
        {
            if (this.array[i]==true)napis += i + " ";
        }
        return napis;
    }

    public boolean equals(boolean[] array){
        if (Arrays.equals(this.array, array))return true;
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy();
        saver1.setSaldo(10.0);
        RachunekBankowy.setRocznaStopaProcentowa(2);

        IntigerSet przyklad = new IntigerSet();
        przyklad.insertElement(3);
        System.out.println(przyklad.toString());

        boolean[] array = new boolean[100];
        for (int i=0; i <= 99; i++) array[i]=false;
        System.out.println(przyklad.equals(array));
    }
}