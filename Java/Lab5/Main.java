package com.company;
import java.util.ArrayList;

class zad1 {
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> lista = new ArrayList<>();
        int rozmiar = a.size();

        for (int i=0; i < rozmiar; i++)
        {
            lista.add(a.get(i));
        }
        rozmiar = b.size();

        for (int i=0; i < rozmiar; i++)
        {
            lista.add(b.get(i));
        }
        return lista;
    }
}

class zad2 {
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> lista = new ArrayList<>();
        int rozmiar = Math.max(a.size(), b.size());

        for (int i=0; i < rozmiar; i++)
        {
            if (i < a.size()) lista.add(a.get(i));
            if (i < b.size()) lista.add(b.get(i));
        }
        return lista;
    }
}

class zad3 {
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i_a=0, i_b=0; i_a <= a.size() && i_b <= b.size();)
        {
            try {
                Integer obj_a = a.get(i_a);
                Integer obj_b = b.get(i_b);
                if (obj_a < obj_b) {
                    lista.add(obj_a);
                    i_a++;
                }
                else
                {
                    lista.add(obj_b);
                    i_b++;
                }
            }
            catch (Exception exception) {
                if (i_a == a.size())
                {
                    for (int i=i_b; i<b.size(); i++)
                    {
                        lista.add(b.get(i));
                    }
                }
                else
                {
                    for (int i=i_a; i<a.size(); i++)
                    {
                        lista.add(a.get(i));
                    }
                }
                break;
            }
        }

        return lista;
    }
}

class zad4 {
    public static ArrayList<Integer> reversed(ArrayList<Integer> a) {
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = a.size()-1; i >= 0; i--)
        {
            lista.add(a.get(i));
        }
        return lista;
    }
}

class zad5 {
    static void reverse(ArrayList<Integer> a) {
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = a.size()-1; i >= 0; i--)
        {
            lista.add(a.get(i));
        }
        a.clear();
        a.addAll(lista);
    }
}

public class Main {
    public static void main(String args []) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(11);
        b.add(12);
        b.add(13);

        System.out.println(zad1.append(a, b));
        System.out.println(zad2.merge(a, b));
        System.out.println(zad3.mergeSorted(a, b));
        System.out.println(zad4.reversed(a));
        zad5.reverse(a);
        System.out.println(a);
    }
}