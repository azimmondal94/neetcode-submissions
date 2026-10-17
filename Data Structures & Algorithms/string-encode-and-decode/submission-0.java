class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s:strs){
            sb.append(s.length()).append(":").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int n=str.length();
        List<String> list=new ArrayList<>();
        int index=0;
        while(index<n){
            //extract the number
            int num=0;
            while(str.charAt(index)!=':'){
                num=num*10+(str.charAt(index)-'0');
                index++;
            }
            index++;
            list.add(str.substring(index,index+num));
            index=index+num;
        }
        return list;
    }
}
