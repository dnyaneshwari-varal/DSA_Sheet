//package basic_maths;
import java.util.*;
public class find_gcd {
    public static int gcd(int n1,int n2){
        int x=0;
        int great=0;
        if(n1<n2){
            x=n1;
        }else{
            x=n2;
        }
        while(x>0){
            if(n1%x==0 && n2%x==0){
                if(great < x){
                    great=x;
                }
            }
            x--;
        }return great;

    }
    public static void main(String[] str){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n1=sc.nextInt();
        System.out.println("Enter n2: ");
        int n2=sc.nextInt();
       
        int gcd_num=gcd(n1,n2);
        System.out.println(gcd_num);

    }
}
