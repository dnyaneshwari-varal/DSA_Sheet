package recursion;

public class code1 {
    static int x=0;
    public static void recursion(){
        if(x==3) return;      //base condition
        System.out.println(x);
        x++;
        recursion(); //recursive call
        

    } 
    public static void main(String[] str){
        recursion();
    }
}
