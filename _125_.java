public class _125_ {
    class Solution {
    public boolean isPalindrome(String s) {
        String a = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int start = 0; 
        int end = a.length()-1;

        while(end>start){
            if(a.charAt(start)!=a.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
}
