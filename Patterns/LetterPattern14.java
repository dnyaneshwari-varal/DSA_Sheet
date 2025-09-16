package Patterns;
import java.util.*;
public class LetterPattern14 {
    static void letter_pattern(int N){
        for(int i=0;i<N;i++){
            
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
                
            }System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N value: ");
        int N=sc.nextInt();

        letter_pattern(N);
    }
}
/*
Enter N value: 4
A
AB
ABC
ABCD
 */
