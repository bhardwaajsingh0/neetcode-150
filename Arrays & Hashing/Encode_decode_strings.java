class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i= 0;
        while(i< str.length()){
            int delimiter = str.indexOf('#',i);
            int l = Integer.parseInt(str.substring(i,delimiter));
            int start = delimiter+1;
            int end = start+l;
            list.add(str.substring(start,end));
            i=end;
        }
        return list;
    }
}
