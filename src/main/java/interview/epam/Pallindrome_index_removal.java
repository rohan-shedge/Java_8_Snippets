package interview.epam;

public class Pallindrome_index_removal {
    public static void main(String[] args) {
        Pallindrome_index_removal pi = new Pallindrome_index_removal();
        System.out.println(pi.palindromeIndex("abbav"));
    }

    private boolean palindromeIndex(String s) {
        if(s.length() < 2) {
            return true;
        }

        for (int i = 0; i < s.length(); i++) {
            
        }
        return false;
    }

/*
    public static int palindromeIndex(String s) {
        char[] chars = s.toCharArray();
        if(isPadlindromeAfterRemoval(chars, -1)) return -1;
        for(int index = 0; index < chars.length; index++) {
            if(isPadlindromeAfterRemoval(chars, index)) {
                return index;
            }
        }
        return -1;
    }

    private static boolean isPadlindromeAfterRemoval(char[] chars, int index) {
        if(chars.length <= 2) return true;
        int left = 0, right = chars.length - 1;
        while(left < right) {
            if(left == index) {
                left ++;
            } else if (right == index) {
                right --;
            }
            if(chars[left] != chars[right]) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

*/

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
/*
    public int palindromeIndex(String s) {
        for (int i = 0; i < s.length() ; i++) {
            String temp = s.substring(0, i) + s.substring(i + 1);
            if(isPallindrome(temp)){
                return i;
            }
        }
        return -1;
    }

    static boolean isPallindrome(String s) {
        for (int i = 0, j = s.length()-1; i < s.length()/2; i++, j--) {
            if(!(s.charAt(i) == s.charAt(j))) {
                return false;
            }
        }
        return true;
    }*/
}

