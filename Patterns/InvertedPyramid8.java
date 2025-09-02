package Patterns;
import java.util.*;
public class InvertedPyramid8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row=sc.nextInt();
        int temp=row;

        for(int i=1;i<=row;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*temp-1;k++){
                System.out.print("*");
            
            }temp--;
            System.out.println();
        }

    }
}
/*
output:
Enter rows: 4
*******
 *****
  ***
   *
 
 */