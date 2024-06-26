//LEETCODE 151. Reverse Words in a String

class Solution {
    public String reverseWords(String s) {
        StringBuilder result=new StringBuilder();
        StringBuilder word=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                word.append(s.charAt(i));
            }
            else if(word.length()>0){
                    result.append(word.reverse());
                    result.append(" ");
                    word.setLength(0);
            }
        }
        if (word.length() > 0) {
            result.append(word.reverse());
        }
        return result.toString().trim();
    }
}
