package Patterns;
public class pattern17{
    static void alpha_hill(int N){
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }
            int ch=64;
            for(int k=1;k<=i;k++){
                System.out.print((char)(ch+k));
            }
            int ch2=63+i;
            for(int l=1;l<=i-1;l++){
                System.out.print((char)ch2);
                ch2--;
            }
            System.out.println();
        }

    }
    public static void main(String [] args){
        int N=4;
        alpha_hill(N);
    }

}

/*
 output
   A
  ABA
 ABCBA
ABCDCBA

 */