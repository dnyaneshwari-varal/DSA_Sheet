package Patterns;
public class DiamondPattern8 {
    
    public static void main(String[]args){
        int row=6;
        int temp=row/2;
        for(int i=1;i<=temp;i++){
            for(int j=i;j<temp;j++){
                System.out.print(" ");
            
            }
            for(int k=1;k<=(i*2-1);k++){
                System.out.print("*");
            }System.out.println();
        }
        for(int i=temp-1;i>=1;i--){
            for(int j=i;j<temp;j++){
                System.out.print(" ");
            
            }
            for(int k=1;k<=(i*2-1);k++){
                System.out.print("*");
            }System.out.println();
            
        }
    }
}
