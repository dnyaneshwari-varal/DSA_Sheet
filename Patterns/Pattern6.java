package Patterns;
import java.util.*;
public class Pattern6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row: ");
        int row=sc.nextInt();
        int temp=row;
        for(int i=0;i<=row;i++){
            int x=1;
            for(int j=temp-i;j>0;j--){
                System.out.print(x +" ");
                x++;
            }System.out.println();
        }
    }

}
/*
Enter row: 5
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1
 */
