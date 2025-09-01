package Patterns;
import java.util.*;
public class Pyramid7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row: ");
        int row=sc.nextInt();
        int temp=row;
        for(int i=1;i<=row;i++){
            for(int j=temp-i; j>0;j--){
                System.out.print(" ");
            }for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
 Enter row: 4
   *
  ***
 *****
*******
 */