class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<String> hashSet = new HashSet<>();
        int max = 0;
        int j =0;
        for (int i = 0; i < s.length();i++ ) {
            if(hashSet.contains(String.valueOf(s.charAt(i)))){
                while(hashSet.contains(String.valueOf(s.charAt(i)))){
                    hashSet.remove(String.valueOf(s.charAt(j)));
                    j++;
                }
                hashSet.add(String.valueOf(s.charAt(i)));
            }
            else{
                hashSet.add(String.valueOf(s.charAt(i)));
                max = Math.max(i-j+1,max);
            }
        }
        return max;//2 3
    }
}