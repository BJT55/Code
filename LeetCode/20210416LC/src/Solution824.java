class Solution824 {
    public String toGoatLatin(String S) {
        String[] ss = S.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < ss.length; ++i){
            char first = ss[i].toLowerCase().charAt(0);
            if(first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u'){
                ss[i] += "ma";
            }else {
                ss[i] = ss[i].substring(1)+ss[i].substring(0,1) + "ma";
            }

            // 每个单词后面添加 'a'
            for(int j = 0; j < i+1; ++j){
                ss[i] += "a";
            }
            // 将转变后的单词放入res中
            res.append(ss[i]+" ");
        }
        return res.toString().trim();
    }
}