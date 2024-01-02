class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> hashSet = new HashSet<>();
        int max = 0;
        int j =0;
        for (int i = 0; i < s.length();i++ ) {
            if(hashSet.contains(s.charAt(i))){
                while(hashSet.contains(s.charAt(i))){
                    hashSet.remove(s.charAt(j));
                    j++;
                }
                hashSet.add(s.charAt(i));
            }
            else{
                hashSet.add(s.charAt(i));
                max = Math.max(i-j+1,max);
            }
        }
        return max;//2 3
    }
}