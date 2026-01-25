class Solution {
    
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str=new StringBuilder("");
        Arrays.sort(strs);
        for(int i=0; i<strs[0].length();i++){
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                str.append(strs[0].charAt(i));
            }else return str.toString();
        }
        return str.toString();
    }
}