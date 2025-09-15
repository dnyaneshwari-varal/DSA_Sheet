package Patterns;
import java.util.*;
public class num_crown_pattern12 {
    public static void main(String[] str){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row: ");
        int n=sc.nextInt();
        
        
        for(int i=1;i<=n;i++){
            //1st
             for(int j=1;j<=i;j++){
                 System.out.print(j);
            }
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            //2nd
            int temp=i;
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print(temp);
                temp=temp-1;
            }System.out.println();


        }
        
    }
}
/*
output
Enter row: 4
1      1
12    21
123  321
12344321

Enter row: 7
1            1
12          21
123        321
1234      4321
12345    54321
123456  654321
12345677654321
 */
