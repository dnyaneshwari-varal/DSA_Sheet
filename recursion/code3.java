//Print 1 to N using Recursion
package recursion;

public class code3 {
    static void func(int i,int n){
        if(i>n) return;
        System.out.println(i);
        func(i+1,n);
    }
    public static void main(String[] str){
        int n=5;
        func(1,n);
    }
}
/*
1
2
3
4
5
*/