package Patterns;
import java.util.*;
public class Binary_Triangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            if(i%2 !=0){
                for(int j=1;j<=i;j++){
                    if(j%2 !=0){
                        System.out.print("1 ");
                    }else{
                        System.out.print("0 ");
                    }
                }System.out.println();
            }
            if(i%2 ==0){
                for(int j=1;j<=i;j++){
                    if(j%2 !=0){
                        System.out.print("0 ");
                    }else{
                        System.out.print("1 ");
                    }
                }System.out.println();
            }
        }
    }
}

/*
Enter row: 5
1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */