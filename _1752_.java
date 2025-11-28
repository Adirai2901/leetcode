public class _1752_ {
    class Solution {
    public boolean check(int[] arr) {

        for(int x = 0;x<arr.length;x++){
        boolean a = true;

            for(int i =0; i < arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    a =  false;
                    break;
                }
            }
        if(a){
            return true;
        }
        
            int temp = arr[0];
            for(int i = 0; i< arr.length-1;i++){
                arr[i]  = arr[i+1];

            }
            arr[arr.length-1]= temp;
        }
        return false;
    }
}
}
