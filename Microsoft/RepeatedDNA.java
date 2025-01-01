class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<String>();
        Set<String> resset = new HashSet<>();
        Set<String> set = new HashSet<>();
        int len = s.length();
        for(int i=0; i<=len-10; i++) {
            String sub = s.substring(i,i+10);
            if(!set.add(sub)){
                resset.add(sub);
            }
        }
        res.addAll(resset);
        return res;
    }
}
