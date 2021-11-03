package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

class zad1a {
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

class zad1b {
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

class zad2 {
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

class zad4 {
    public static int szachownica(int n){
        BigInteger suma = new BigInteger("0");
        for (int i=0; i<n*n; i++) {
            suma = suma.add(BigInteger.valueOf((int)Math.pow(2, i)));
        }
        return suma.intValue();
    }
}

class zad5{
    public static double odsetki(int k, double p, int n){
        BigDecimal suma = new BigDecimal(k);
        BigDecimal zmienna = new BigDecimal(p);
        for (int i=0; i<n; i++) {
            suma = suma.add((suma.multiply(zmienna)));
        }
        return Math.round(suma.doubleValue() * 100.0) / 100.0;
    }
}

public class Lab4 {
    public static void main(String args []) {
        zad1a slowo = new zad1a();
        System.out.print("1a\nw napisie jest tyle podanych znakow: " + slowo.countChar("galag", 'g'));
        zad1b slowo2 = new zad1b();
        System.out.print("\n1b\nw napisie jest tyle podanych stringow: " + slowo2.countSubStr("gaaag", "aa"));
        zad2 zad2 = new zad2();
        System.out.print("\n2\nw pliku jest tyle podanych znakow: " + zad2.znakiWPliku("siema.txt", 'c'));
        zad4 zad4 = new zad4();
        System.out.print("\n4\nwszystkich ziarenek jest: " + zad4.szachownica(2));
        zad5 zad5 = new zad5();
        System.out.print("\n5\nwartosc kapitalu po latach wynosi: " + zad5.odsetki(2000, 0.005, 5));
    }
}