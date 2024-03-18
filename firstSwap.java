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
