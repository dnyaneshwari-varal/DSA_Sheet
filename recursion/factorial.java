package recursion;
//iterative solution
/*public class factorial {
    public static int fact(int x){
        int res=1;
        for(int i=x;i>0;i--){
            res=res*i;
        }
        return res;


    }
    public static void main(String[] arg){
        int x=5;
        int result=fact(x);
        System.out.println("Factorial of "+x +" is: "+result);
    }

}
    */

public class factorial{
    public static int fact(int n,int result){
        if(n==0){
            return result;
        }
        result=result*n;
        return fact(n-1,result);

    }
    public static void main(String[] args){
        int x=5;
        int res=1;
        int result=fact(x,res);
        System.out.println("Factorial of " + x + " is: " + result);

    }
}
