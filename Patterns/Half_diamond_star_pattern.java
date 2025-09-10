package Patterns;
import java.util.*;

public class Half_diamond_star_pattern {
    static void firstHalf(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
   }
   static void secondHalf(int n){
        for(int i=1;i<n;i++){
            //System.out.println(i);
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }System.out.println();
        }

   }
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter row: ");
    int n=sc.nextInt();
    firstHalf(n);
    secondHalf(n);
   }
}

/*
output
Enter row: 
5
*
**
***
****
*****
****
***
**
*
 */