/*Given an array of strings, return a Map<String, Boolean> where each different string 
  is a key and its value is true if that string appears 2 or more times in the array.


wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
*/

//Solution 1: (2 Loops)
  
public Map<String, Boolean> wordMultiple(String[] strings) {
  
  Map<String, Boolean> map = new HashMap<>();
  
    for(int i =0;i<strings.length;i++){
      boolean foundDupe = false;
       for(int j = 0; j < strings.length; j++){
    	   if(i!=j && strings[i].equals(strings[j])){
    	    foundDupe=true;
    	   }
    	 map.put(strings[i],foundDupe);
      }
      
    }

  //map.forEach((key, value) -> System.out.println(key + " " + value));
  
  return map;
  
}

//Solution 2: (1 loop)

public Map<String, Boolean> wordMultiple(String[] strings) {
  
  Map<String, Boolean> map = new HashMap<>();
  for(int i = 0; i < strings.length; i++)
  {
  Boolean foundDupe = map.containsKey(strings[i]);
   if(foundDupe){
    map.put(strings[i], true);
    }
    else{
	  map.put(strings[i], false);
    }
  }

  return map;
  
}
