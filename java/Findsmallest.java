public class Findsmallest{
    public static int print(){
    int []arr={75,55,78,63,12,42,3,20,1};
        
        int small=arr[0];
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]<small){
                small=arr[i];
            }
                // System.out.print(small);
            
        }
        return small;
        
    }
    
public static void main(String []  args){
    
    System.out.println(print());
    
}
    
} 