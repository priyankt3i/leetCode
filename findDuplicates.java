/*

find duplicates and count of duplicates of each element in a string array.

*/

class Solution {
    public map<String, Integer> findDuplicates(string[] strings) {

        String[] arr = {"kumar", "kumar", "priyank", "kumar", "xyz", "abc", "priyank"};
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i =0;i<arr.length;i++){
  	        int count=0;
  	        for(int j = 0; j < arr.length; j++){      
    			   if(i!=j && arr[i].equals(arr[j])){
    			    count=count+1;
    			   }
  				 if(count>0){
  				   map.put(arr[i],count);
  				 }
	        }
        }
    
        map.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
