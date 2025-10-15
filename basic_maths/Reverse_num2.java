//package basic_maths;
import java.util.*;
public class Reverse_num2 {
    public static int RevNum(int num){
        int temp=num;
        int rev=0;
        while(temp>0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        return rev;
    }
    public static void main(String[] str){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num: ");
        int num=sc.nextInt();
        int Rnum=RevNum(num);
        System.out.println("Reverse num is "+Rnum);
        }
}
/*
Enter num: 012400
Reverse num is 421

Enter num: 12345
Reverse num is 54321

 */