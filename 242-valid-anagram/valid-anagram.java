class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer> set=new HashMap<>();
        for (char c : s.toCharArray()){
            if(set.containsKey(c)){
                set.put(c,set.get(c)+1);
            }else{
            set.put(c,1);
            }
        }
        for(char c : t.toCharArray()){
            if(set.containsKey(c)){
                if(set.get(c)>1){
                    set.put(c,set.get(c)-1);
                }else{
                    set.remove(c);
                }
            }else{
                return false;
            }
        }

        if(!set.isEmpty()) return false;

        return true;
    }
}