public class isPalindrome {
    public boolean isPalindrome(int x) {
        String tmp = String.valueOf(x);
        int start = 0;
        int end = tmp.length() - 1;
        for(int i = 0; i < tmp.length() / 2; i++) {
            if(tmp.charAt(start) != tmp.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
