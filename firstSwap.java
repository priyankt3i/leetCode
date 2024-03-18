/* We'll say that 2 strings "match" if they are non-empty and their first chars are the same. 
Loop over and then return the given array of non-empty strings as follows: 
if a string matches an earlier string in the array, swap the 2 strings in the array. 
A particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled. 
Using a map, this can be solved making just one pass over the array. More difficult than it looks.

Example Set:

firstSwap(["ab", "ac"]) → ["ac", "ab"]
firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]

*/

public String[] firstSwap(String[] strings) {
    Map<String, Integer> map = new HashMap<>();
    Integer swapped = -1;
    for (int i = 0; i < strings.length; i++) {
        String firstChar = strings[i].substring(0, 1);
        //System.out.println(firstChar);
        Integer prevIndex = map.get(firstChar); // check if map has first char

        if (prevIndex == null) { //if map doesnt have first char
            map.put(firstChar, i); // add to map
            continue;
        }
        if (prevIndex == swapped) { // check map if this has swapped before
            continue;
        }
        
        String temp = strings[i];
        strings[i] = strings[prevIndex];
        strings[prevIndex] = temp; 
        
        map.put(firstChar, swapped); // add to map and mention swappped
    }
  
  return strings;
}
