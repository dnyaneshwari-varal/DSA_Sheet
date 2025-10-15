//package basic_maths;

public class Divisor {
    public static int[] divisor(int n){
        int div[]=new int[n];
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                div[count++]=i;
            }
        }

        return div;
    }
    public static void main(String str[]){
        int num=12;
        int div[]=divisor(num);
        for(int i=0;i<div.length;i++){
            if(div[i]==0){
                break;
            }
            System.out.println(div[i]);
        }
    }

}
/*
1
2
3
4
6
12
*/
