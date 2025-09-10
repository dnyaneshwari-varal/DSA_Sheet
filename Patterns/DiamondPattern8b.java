package Patterns;
import java.util.*;
public class DiamondPattern8b {


    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows: ");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }System.out.println();
        }int temp=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            
            }
            for(int k=1;k<=temp*2-1;k++){
                System.out.print("*");
            }temp--;
            System.out.println();
        }
    }
}

/*
 output
 Enter rows: 
4
   *
  ***
 *****
*******
 *****
  ***
   *
*/