public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        //horizatally scan
        String prefix = strs[0];
        for(int i = 0; i < strs.length; i++) {
            //check if strs[i] contains exactly strs[0] which is prefix
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() -1);
                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
