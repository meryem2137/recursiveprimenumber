import java.util.Scanner;

public class asalsayı {
    static boolean asalmı(int n,int i){
        if(n<=1){
            System.out.print(n+"asal sayı değildir");
            return false;
        }if(i==1){
            System.out.print(n +"asal sayıdır");
            return true;
        }if(n%i==0 && i<n){
            System.out.print(n+"asal sayı değildir");
            return false;
        }return asalmı(n,i-1);

    }
    public static void main(String[] args){
       asalmı(7,3);
}}
