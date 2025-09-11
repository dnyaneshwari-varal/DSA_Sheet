package Patterns;
import java.util.*;
public class num_crown_pattern12 {
    public static void main(String[] str){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }System.out.println();
        }int x=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;i++){
                System.out.println(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(x);
                x--;
            }x=x+i;
        }
    }
}
