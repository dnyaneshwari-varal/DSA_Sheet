package Patterns;
import java.util.*;
public class Pattern5 {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Rows: ");
    int row=sc.nextInt();
    int temp=row;
    for(int i=0;i<row;i++){
        for(int j=temp-i;j>0;j--){
            System.out.print("* ");
        }System.out.println();
    }
   }
}
/*
 output
Enter Rows: 5
* * * * * 
* * * *
* * *
* *
*
 */
