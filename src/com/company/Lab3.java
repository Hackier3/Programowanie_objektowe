package com.company;
import java.util.Random;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        //Zad1
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arrayOfNumbers = new int[n];
        Random r = new Random();
        for(int i=0;i<n;i++)
        {
            arrayOfNumbers[i] = r.nextInt(1998)- 999;
        }
        int even=0,odd=0;
        for(int i=0;i<n;i++)
        {
            if(arrayOfNumbers[i]%2==0)
            {
                even++;
            }
            else if(arrayOfNumbers[i]%2==1)
            {
                odd++;
            }
        }
        System.out.println("even: "+even);
        System.out.println("odd: "+odd);
        int positive = 0;
        int negative = 0;
        int zer = 0;
        for(int i=0;i<n;i++)
        {
            if(arrayOfNumbers[i]<0)
            {
                negative++;
            }
            else if(arrayOfNumbers[i]>0)
            {
                positive++;
            }
            else if(arrayOfNumbers[i]==0)
            {
                zer++;
            }
        }
        System.out.println("liczby positive: "+positive);
        System.out.println("liczby negative: "+negative);
        System.out.println("zera: "+zer);
        int najwiekszy=arrayOfNumbers[0];
        int ilenaj=0;
        for(int x=0;x<n-1;x++)
        {
            if(najwiekszy<arrayOfNumbers[x])
                najwiekszy = arrayOfNumbers[x];
        }
        for(int z=0;z<n-1;z++)
        {
            if(najwiekszy == arrayOfNumbers[z])
                ilenaj++;
        }
        System.out.println("najwiekszy element to: "+najwiekszy+'\n'+"wystepnegativee on: "+ilenaj+" razy");
        int sumnegative=0, sumpositive=0;
        for(int i=0;i<n-1;i++)
        {
            if(arrayOfNumbers[i]<0)
            {
                sumnegative+=arrayOfNumbers[i];
            }
            if(arrayOfNumbers[i]>0)
            {
                sumpositive+=arrayOfNumbers[i];
            }
        }
        System.out.println("suma liczb negative: "+sumnegative);
        System.out.println("suma liczb positive: "+sumpositive);
        int lenpositive=0;
        int maxlen=1;
        for(int i=0;i<n-1;i++)
        {
            if(arrayOfNumbers[i]>0 && arrayOfNumbers[i+1]>0)
            {
                lenpositive++;
                if(lenpositive>maxlen)
                {
                    maxlen=lenpositive;
                }
            }
        }
        System.out.println(maxlen);
        for(int i=0;i<n-1;i++)
        {
            if(arrayOfNumbers[i]>0)
            {
                arrayOfNumbers[i]=1;
            }
            else if(arrayOfNumbers[i]<0)
            {
                arrayOfNumbers[i]=0;
            }
        }
        int howManyPositive=0, howManyNegative=0, positiveRecord=0, negativeRecord=0;
        for(int i=1;i<n;i++)
        {
            System.out.println("\nAAAAAAAA"+arrayOfNumbers[i]);
            if (arrayOfNumbers[i]>0 && arrayOfNumbers[i-1]>0) {
                howManyPositive++;
                if (howManyPositive>positiveRecord)
                    positiveRecord=howManyPositive;
                howManyNegative=0;
            }
            else if (arrayOfNumbers[i]<0 && arrayOfNumbers[i-1]<0) {
                howManyNegative++;
                if (howManyNegative>negativeRecord)
                    negativeRecord=howManyNegative;
                howManyPositive=0;
            }
            else{
                howManyNegative=0;
                howManyPositive=0;
            }
        }
        System.out.println("\nrekord liczb dodatnich: "+positiveRecord);
        System.out.println("\nrekord liczb ujemnych: "+negativeRecord);




        n = r.nextInt(10)+1;
        int m = r.nextInt(10)+1;
        int k = r.nextInt(10)+1;
        int[][] tab = new int[m][n];
        int[][] tab2 = new int[n][k];
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                tab[i][j] = r.nextInt(10) + 1;
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int p=0;p<n-1;p++)
        {
            for(int t=0;t<k-1;t++)
            {
                tab[p][t] = r.nextInt(10)+1;
                System.out.print(tab[p][t]+" ");
            }System.out.println();
        }
        int[][]tab3 = new int [m][k];
        for(int y=0;y<m-1;y++)
        {
            for(int x=0;x<k-1;x++)
            {
                for(int z=0;z<n-1;z++)
                {
                    tab3[y][x]+=tab[y][z]*tab2[z][x];
                }
            }
        }
        System.out.println();
        for(int b=0;b<m-1;b++)
        {
            for(int q=0;q<k-1;q++)
            {
                System.out.print(tab3[b][q] + " ");
            }
            System.out.println();
        }
    }
}
