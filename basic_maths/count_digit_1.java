//package basic_maths;
import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class count_digit_1 {
    public static int countDig(int num){
        int temp=num;
        int count=0;
        while(temp>0){
            //int digit =temp%10;
            count++;
            temp=temp/10;
        }
        return count;
    }
    public static void main(String[] str){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num: ");
        int num=sc.nextInt();
        int digit=countDig(num);
        System.out.println("Digit present in "+num+" are: "+digit);
    }
}
/*
Enter num: 
34256
Digit present in 34256 are: 5
 */