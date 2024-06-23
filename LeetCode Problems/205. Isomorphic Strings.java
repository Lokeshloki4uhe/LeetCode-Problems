//LEETCODE 205. Isomorphic Strings

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(!hm.containsKey(c1)){
                if(!hm.containsValue(c2)){
                    hm.put(c1,c2);
                }
                else{
                    return false;
                }
            }
            else{
                char c=hm.get(c1);
                if(c!=c2) return false;
            }
        }
        return true;
    }
}