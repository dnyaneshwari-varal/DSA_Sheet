package Patterns;
import java.util.*;
public class Pattern1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int row=sc.nextInt();
        System.out.println("Enter coloums:");
        int clm=sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<clm;j++){
                System.err.print("* ");
            }System.out.println();
        }
    }
}
/*
 Enter rows:
4
Enter coloums:
4
* * * * 
* * * * 
* * * * 
* * * * 

 */