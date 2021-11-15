public class RomanToInteger {
    public static int romanToInt(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'I') {
                result += 1;
            }
            else if(s.charAt(i) == 'V') {
                result += 5;
            }
            else if(s.charAt(i) == 'X') {
                result += 10;
            }
            else if(s.charAt(i) == 'L') {
                result += 50;
            }
            else if(s.charAt(i) == 'C') {
                result += 100;
            }
            else if(s.charAt(i) == 'D') {
                result += 500;
            }
            else if(s.charAt(i) == 'M') {
                result += 1000;
            }
            for(int j = i + 1; j < s.length(); j++) {
                if((s.charAt(i) == 'I' && s.charAt(j) == 'V') || (s.charAt(i) == 'I' && s.charAt(j) == 'X')) {
//                    System.out.println(result);
                    result -= 2;
//                    System.out.println(result);
                }
                else if((s.charAt(i) == 'X' && s.charAt(j) == 'L') || (s.charAt(i) == 'X' && s.charAt(j) == 'C')) {
                    result -= 20;
                }
                else if((s.charAt(i) == 'C' && s.charAt(j) == 'D') || (s.charAt(i) == 'C' && s.charAt(j) == 'M')) {
                    result -= 200;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }
}
