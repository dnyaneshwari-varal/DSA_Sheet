package Patterns;
import java.util.*;
public class Pattern13 {
    static void Increasing_Number_Triangle(int N){
        int temp=1;
        for(int i=1;i<=N;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(temp +" ");
                temp=temp+1;
            }System.out.println();
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N value: ");
        int n=sc.nextInt();
        Increasing_Number_Triangle(n);
    }
    
}
/*
 Enter N value: 5
Enter N value: 4
1 
2 3
4 5 6
7 8 9 10

 */