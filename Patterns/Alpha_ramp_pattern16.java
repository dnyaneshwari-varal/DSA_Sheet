package Patterns;

public class Alpha_ramp_pattern16 {
    static void alpha_ramp(int N){
        
        for(int i=0;i<N;i++){
            int temp=65+i;
            //System.out.println(temp);
            for(int j=0;j<=i;j++){
                
                System.out.print((char)temp);
    
            }System.out.println();
        }
    }
    public static void main(String[] args){
        int N=5;
        alpha_ramp(N);

    }
    
}

/*
A
BB
CCC
DDDD
EEEEE
 */
