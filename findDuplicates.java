/*

find duplicates and count of duplicates of each element in a string array.

*/

class Solution {
    public Map<String, Integer> findDuplicates(string[] strings) {

        //String[] arr = {"kumar", "kumar", "priyank", "kumar", "xyz", "abc", "priyank"};
        Map<String, Integer> map = new HashMap<>();
        
        for(int i =0;i<strings.length;i++){
  	        int count=0;
  	        for(int j = 0; j < strings.length; j++){      
    			   if(i!=j && strings[i].equals(strings[j])){
    			    count=count+1;
    			   }
				if(count>0){
				   map.put(strings[i],count);
				 }
	        }
        }
    
        //map.forEach((key, value) -> System.out.println(key + " " + value));
	return map;
    }
}
