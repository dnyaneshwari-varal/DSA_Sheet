package recursion;
public class reverse_array{
    public static int[] rev(int[] arr,int rev[],int start,int end){
       
        if(end<0) return rev;

        rev[start]=arr[end];
        return rev(arr,rev,start+1,end-1);

    }
    public static void main(String[] args){
        int arr[]={5,4,3,2,1};
        int start=0;
        int end=arr.length-1;
        int[] rev=new int[arr.length];
        int[] result=rev(arr,rev,start,end);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}