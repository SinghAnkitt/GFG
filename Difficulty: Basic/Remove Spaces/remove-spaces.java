class Solution {
    public String removeSpaces(String s) {
        // code here
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == ' '){
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }
}