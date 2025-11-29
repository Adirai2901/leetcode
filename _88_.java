import java.util.ArrayList;
import java.util.Collections;

public class _88_ {
    class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        ArrayList<Integer> abc = new ArrayList<>();
        for(int i = 0; i < m;i++){
           
            
            abc.add(arr1[i]);
        }
        for(int j = 0; j < n; j++){
            abc.add(arr2[j]);
        }
        Collections.sort(abc);
        for(int i = 0; i < abc.size();i++){
            arr1[i]= abc.get(i);
        }
        
    }
}
}
