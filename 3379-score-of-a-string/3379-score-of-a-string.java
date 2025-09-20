class Solution {
    public int scoreOfString(String s) {
        
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int firstindex=i;
            int secondindex=i+1;
            char one=s.charAt(i);
            char two=s.charAt(i+1);
            int asci=Math.abs(one-two);
            sum+=asci;
        }
        return sum;
        
    }
}