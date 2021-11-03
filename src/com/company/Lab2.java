package com.company;
import java.util.Scanner;
import static java.lang.Math.*;

public class Lab2 {
    public static void main(String args []) {
        //1
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] liczby = new double[n];
        for (int i=0; i<n; i++) {
            liczby[i] = scan.nextInt();
        }
        //a
        double wynik = 0;
        for(int i = 0; i<n; i++) {
            wynik+=liczby[i];
        }
        System.out.println("1.1a\n" + wynik +"\nb");

        //b
        wynik = 1;
        for(int i = 0; i<n; i++) {
            wynik*=liczby[i];
        }
        System.out.println(wynik+"\nc");

        //c
        wynik = 0;
        for(int i = 0; i<n; i++) {
            wynik+=abs(liczby[i]);
        }
        System.out.println(wynik+"\nd");

        //d
        wynik = 0;
        for(int i = 0; i<n; i++) {
            wynik+=Math.sqrt(abs(liczby[i]));
        }
        System.out.println(wynik+"\ne");

        //e
        wynik = 1;
        for(int i = 0; i<n; i++) {
            wynik*=abs(liczby[i]);
        }
        System.out.println(wynik+"\nf");

        //f
        wynik = 0;
        for(int i = 0; i<n; i++) {
            wynik+=pow(liczby[i], 2);
        }
        System.out.println(wynik+"\ng");

        //g
        wynik = 0;
        double wynik2 = 1;
        for(int i = 0; i<n; i++) {
            wynik+=liczby[i];
            wynik2*=liczby[i];
        }
        System.out.println(wynik + "\n"+wynik2 + "\nh");

        //h
        wynik = 0;
        for(int i = 0; i<n; i++) {
            wynik+=pow(-1, i+1)*liczby[i];
        }
        System.out.println(wynik+"\ni");

        //i
        wynik = 0;
        int down = 1;
        for(int i = 0; i<n; i++) {
            down*=i+1;
            wynik+=(pow(-1, i)*liczby[i])/down;
        }
        System.out.println(wynik+"\n1.2");

        //1.2
        double[] liczby2 = new double[n];

        double jeden = liczby[0];
        for(int i = 0; i<n-1; i++) {
            liczby2[i] = liczby[i+1];
        }
        System.out.println("\n\n\n");
        liczby2[liczby2.length-1] = jeden;
        for(int i = 0; i <=liczby2.length-1; i++){
            System.out.println(liczby2[i]+"\n2.1a");
        }
        //2.1a
        int howMany = 0;
        for(int i = 0; i<n; i++){
            if(liczby[i] %2 != 0)
                howMany++;
        }
        System.out.println(howMany+"\nb");

        //b
        for(int i = 0; i<n; i++){
            if(liczby[i] %3 == 0 && liczby[i]%5!=0)
                howMany++;
        }
        System.out.println(howMany+"\nc");

        //c
        for(int i = 0; i<n; i++){
            if(sqrt(liczby[i]) %2 == 0)
                howMany++;
        }
        System.out.println(howMany+"\nd");

        //d
        for(int i = 1; i<n-1; i++){
            if(liczby[i] < (liczby[i-1]+liczby[i+1])/2)
                howMany++;
        }
        System.out.println(howMany+"\ne");

        //e
        down = 1;
        for (int i = 1; i < n; i++) {
            down *= i;
            if (pow(2, i) <= liczby[i] && liczby[i] <= down)
                howMany++;
        }
        System.out.println(howMany+"\nf");

        //f
        for(int i = 0; i<n; i++){
            if(i+1%2 != 0 && liczby[i]%2==0)
                howMany++;
        }
        System.out.println(howMany+"\ng");

        //g
        for(int i = 0; i<n; i++){
            if(liczby[i] %2 !=0 && liczby[i] >=0)
                howMany++;
        }
        System.out.println(howMany+"\nh");

        //h
        for(int i = 0; i<n; i++){
            if(abs(liczby[i]) < pow(i, 2))
                howMany++;
        }
        System.out.println(howMany+"\n2.2");

        //2.2
        for(int i = 0; i<n; i++){
            if(liczby[i] > 0)
                howMany+=2*liczby[i];
        }
        System.out.println(howMany+"\n2.3");

        //2.3
        int zeros = 0, plus = 0, minus = 0;
        for(int i = 0; i<n; i++){
            if(liczby[i] == 0)
                zeros++;
            else if(liczby[i] < 0)
                minus++;
            else
                plus++;
        }
        System.out.println(howMany+"\n2.4");

        //2.4
        double max = liczby[0];
        double min = liczby[0];

        for(int i = 0; i<n;i++)
            if(i > 0) {
                if (liczby[i] > max)
                    max = liczby[i];
                if(liczby[i] < min)
                    min = liczby[i];
            }
        System.out.println(min+"\n"+max+"\n2.5");

        //2.5
        for(int i = 0; i<n-1;i++){
            if(liczby[i] > 0 && liczby[i+1] > 0)
                howMany++;
        }
        System.out.println(howMany);
    }
}