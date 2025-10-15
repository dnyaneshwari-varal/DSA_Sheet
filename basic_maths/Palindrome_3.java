//package basic_maths;
import java.util.*;
public class Palindrome_3 {
    public static int PalindromeN(int num){
        int temp=num;
        int PalN=0;
        while(temp > 0){
            int rem=temp%10;
            PalN=PalN*10+rem;
            temp=temp/10;
        }
        //System.out.println(PalN);
        return PalN;

    }
    public static void main(String[] str){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check Palindrome or not: ");
        int num=sc.nextInt();
        int result=PalindromeN(num);
        if(num==result){
            System.out.println(num+" Number is Palindrome!");
        }else{
            System.out.println(num+" Number is not Palindrome!");
        }

    }
}
/*
Enter number to check Palindrome or not: 
2332
2332 Number is Palindrome!

Enter number to check Palindrome or not: 
1234
1234 Number is not Palindrome!
 */