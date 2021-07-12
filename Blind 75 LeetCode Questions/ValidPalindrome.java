class Solution {
    public boolean isPalindrome(String s) {
        
        String input = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
          if (input.length() == 0 || input.length() == 1) return true;
       
        int i = 0;
        int j = input.length()-1;
        
        while (input.charAt(i) == input.charAt(j) && i < j){
            
            i++;
            j--;
            
        }
        return (i == j || input.charAt(i) == input.charAt(j));
        
        
        
    }
}