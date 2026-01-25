class Solution {
    static class Node{
	        Node children[]=new Node[26];
	        int charUsed=0;

	        public Node(){
	            for(int i=0; i<26; i++){
	                children[i]=null;
	            }
	        }
	    }

	    public static void insert(String s , Node root){
	        Node curr =root;
	        for(int i=0;i<s.length();i++){
	            int index = s.charAt(i)-'a';
	            if(curr.children[index]==null){
	                curr.children[index]=new Node();
	            }     
	            curr = curr.children[index];
	            curr.charUsed++;
	        }
	    }

    
    
    public String longestCommonPrefix(String[] strs) {
        Node root =new Node();
        int minLen = Integer.MAX_VALUE;
		for(String st:strs){
			minLen = Math.min(minLen, st.length());
            insert(st,root);
        }

        StringBuilder str=new StringBuilder("");
	        Node curr=root;
	        int sLength=strs.length;
	        int i=0;
	        while(i<minLen){
	            char c =strs[0].charAt(i);
	            int indx= c - 'a';
	            if(curr.children[indx] != null && curr.children[indx].charUsed ==sLength){
	                str.append(c);
	            }else{
	            if(curr.children[indx] != null && curr.children[indx].charUsed !=sLength) break;
	            }
	            curr=curr.children[indx];
	            i++;
	        }
	        return str.toString();
        
    }
}