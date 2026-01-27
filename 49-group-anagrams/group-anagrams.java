class Solution {

     public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();    
        for (String s:strs){
            int[] charKey =new int[26]; 
            for(char c : s.toCharArray()){
                charKey[c-'a']++;
            }
            String uniqueKey= Arrays.toString(charKey);
        
            map.putIfAbsent(uniqueKey,new ArrayList<>());
            map.get(uniqueKey).add(s);
        }
    return new ArrayList<>(map.values());
    }
}