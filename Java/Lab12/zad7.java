package pl.imiajd.grzes;

public class zadanie7 {
    public static void main(String[] args){
        int n = 30;
        boolean pierwsze[] = new boolean[n+1];
        for(int i=0;i<=n;i++)
            pierwsze[i] = true;
        for(int i = 2; i*i <=n; i++){
            if(pierwsze[i] == true) {
                for (int j = i * i; j <= n; j += i)
                    pierwsze[j] = false;
            }
        }
        for(int i=2; i<=n; i++){
            if(pierwsze[i] == true)
                System.out.print(i+" ");
        }
    }
}
