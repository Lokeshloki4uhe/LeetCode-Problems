//LEETCODE 242. Valid Anagram

class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();
        s=s.replace(" ","");
        t=t.replace(" ","");
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            count[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0) return false;
        }
        return true;
    }
}