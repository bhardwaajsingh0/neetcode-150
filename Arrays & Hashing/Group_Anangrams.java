class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0; i< strs.length; i++){
            String word = strs[i];
            char[] cha = word.toCharArray();
            Arrays.sort(cha);
            String newword = new String(cha);
            if(!map.containsKey(newword)){
                map.put(newword, new ArrayList());
            }
            map.get(newword).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
