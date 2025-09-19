package Patterns;

public class pattern18 {
    static void alpha_triangle(int N){
        for(int i=0;i<=N;i++){
            int ch=69-i;
            for(int j=0;j<=i;j++){
                System.out.print((char)ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        int N=4;
        alpha_triangle(N);
    }
}
/*
output
E
DE
CDE
BCDE
ABCDE
 */
