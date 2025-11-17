package recursion;


public class factorial{
    public static int fact(int num,int x){
         if(num==1){
            return 1;
            
        }
        x=num*x;
        return fact(num-1, x);
       

    }
    public static void main(String[] args){
        int num=5;
        int x=1;
        int result=fact(num,x);
        System.out.println("Factorial of " + x + " is: " + result);

    }
}
