//Print N to 1 using Recursion
package recursion;
public class code4 {
    static void func(int i,int n){
        
        if(i<1) return;
        System.out.println(i);
        
        func(i-1,n);
    }
    public static void main(String[] str){
        int n=5;
        func(n,n);
    }
    
}
/*
5
4
3
2
1
*/