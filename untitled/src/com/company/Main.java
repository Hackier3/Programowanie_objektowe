package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

class Zad1a {
    public static int countChar(String str, char c) {
        int dlugoscNapisu = str.length();
        int i=0;
        int znaki=0;
        while (dlugoscNapisu > i)
        {
            if(str.charAt(i)==c)
                znaki+=1;
            i++;
        }
        return znaki;
    }
}

class Zad1b {
    public static int countSubStr(String str, String subStr) {
        int ileRazy = str.length()-subStr.length();
        int i=0;
        int znaki=0;
        while (ileRazy > i)
        {
            if(subStr.compareTo(str.substring(i, subStr.length()+i))==0)
                znaki+=1;
            i++;
        }
        return znaki;
    }
}

class Zad1c {
    public static int srodkoweLiterki(String str, String subStr) {
        int ileRazy = str.length()-subStr.length();
        int i=0;
        int znaki=0;
        while (ileRazy > i)
        {
            if(subStr.compareTo(str.substring(i, subStr.length()+i))==0)
                znaki+=1;
            i++;
        }
        return znaki;
    }
}

class Zad2 {
    public static int znakiWPliku(String nazwaPliku, char znakWPliku){
        int count =0;

        try {
            File myObj = new File(nazwaPliku);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                for (int i=0; i<data.length(); i++) {
                    if(znakWPliku==data.charAt(i))
                        count++;
                }
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("nie znalazlem pliku");
            e.printStackTrace();
        }

        return count;
    }
}

class Zad4 {
    public static int szachownica(int n){
        BigInteger suma = new BigInteger("0");
        for (int i=0; i<n*n; i++) {
            suma = suma.add(BigInteger.valueOf((int)Math.pow(2, i)));
        }
        return suma.intValue();
    }
}

class Zad5{
    public static double odsetki(int k, double p, int n){
        BigDecimal suma = new BigDecimal(k);
        for (int i=0; i<n; i++) {
            suma = suma.add(BigDecimal.valueOf(suma.multiply(p)));
        }
        return suma.doubleValue();
    }
}

public class Main {
    public static void main(String args []) {
        Zad1a slowo = new Zad1a();
        System.out.print("1a\nw napisie jest tyle podanych znakow: " + slowo.countChar("galag", 'g'));
        Zad1b slowo2 = new Zad1b();
        System.out.print("\n1b\nw napisie jest tyle podanych stringow: " + slowo2.countSubStr("gaaag", "aa"));
        Zad2 zad2 = new Zad2();
        System.out.print("\n2\nw pliku jest tyle podanych znakow: " + zad2.znakiWPliku("siema.txt", 'c'));
        Zad4 zad4 = new Zad4();
        System.out.print("\n4\nwszystkich ziarenek jest: " + zad4.szachownica(2));
        Zad5 zad5 = new Zad5();
        System.out.print("\n5\nwartosc kapitalu po latach wynosi: " + zad5.odsetki(2000, 0.005, 5));
    }
}