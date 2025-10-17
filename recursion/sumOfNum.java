//Given a number ‘N’, find out the sum of the first N natural numbers.
//ex=5=1+2+3+4+5=15
package recursion;

public class sumOfNum {
    static void sum(int i,int n,int add){

        if(i>n){
            System.out.println("The sum of the first " + n + " numbers is: " + add);
            return;
        }
        add=add+i;
        i++;
        sum(i,n,add);


    }
    public static void main(String[] str){
        int n=5;

        sum(1,n,0);
    }
}
