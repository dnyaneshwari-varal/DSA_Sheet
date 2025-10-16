//print Name N times using Recursion
package recursion;


public class code2 {
    static void recursion(int i,int n){
        if(i>n) return;
        System.out.println("Dnyana");
        
        recursion(i+1,n);
    }
    public static void main(String []str){
        int n=4;
        //String name="Dnyana";
        recursion(1,n);

    }
}
