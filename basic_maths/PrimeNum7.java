import java.util.*;
public class PrimeNum7 {
    public static boolean PrimeNum(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] str){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num: ");
        int num=sc.nextInt();
        boolean res=PrimeNum(num);
        if(res){
            System.out.println(num+" Number is Prime");
        }else{
            System.out.println(num+" Number is not Prime number");
        }
    }
}
/*
Enter num: 10
10 Number is not Prime number

Enter num: 2
2 Number is Prime
 */