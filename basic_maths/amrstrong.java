//An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
//Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.
//package basic_maths;
import java.util.*;
public class amrstrong {
    public static boolean isArmstrong(int num){
        int temp=num;
        int count=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        
        int sum=0;
        temp=num;
        while(temp>0){
            int rem=temp%10;
            int mult=1;
            for(int i=1;i<=count;i++){
                mult=mult*rem;
            }
            temp=temp/10;
            sum=sum+mult;
        }
        if(num==sum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String []str){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num: ");
        int num=sc.nextInt();
        System.out.println(isArmstrong(num));
        
    }
    
}
/*
Enter num: 
432
false

Enter num: 
153
true

 */