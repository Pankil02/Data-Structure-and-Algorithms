class Solution {

     public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
            
        for (String s:strs){
            if(s.length()==0){
                 new ArrayList<ArrayList<String>>();
            }
            int[] charKey =new int[26]; 
            for(char c : s.toCharArray()){
                charKey[c-'a']++;
            }
            String uniqueKey= Arrays.toString(charKey);
            if(!map.containsKey(uniqueKey)) {
                map.put(uniqueKey,new ArrayList<String>());
            }
            map.get(uniqueKey).add(s);
        }
    return new ArrayList<>(map.values());
    }
}