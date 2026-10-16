class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            int[] arr=new int[26];
            for(char c:s.toCharArray()){
                arr[c-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append(arr[i]+"#");
            }
            String key=sb.toString();
            if(map.containsKey(key)){
                map.get(key).add(s);
            }else{
                map.put(key,new ArrayList<>(List.of(s)));
            }
        }
        List<List<String>> ans=new ArrayList<>();
        for(List<String> list:map.values()){
            ans.add(list);
        }
        return ans;
    }
}
