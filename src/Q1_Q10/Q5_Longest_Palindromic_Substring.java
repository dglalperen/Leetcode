package Q1_Q10;

public class Q5_Longest_Palindromic_Substring {
    public static void main(String[] args) {

    }

    public static String longestPalindrome(String s){
        if(s == null || s.length() < 1) return "";

        int start = 0;
        int end = 0;
        for(int i=0; i< s.length(); i++){
            int len1 = expandFromMiddle(s, i, i);
            int len2 = expandFromMiddle(s, i, i+1);

            int length = Math.max(len1,len2);
            if(length > end - start){
                start = i - (length - 1) / 2;
                end = i + (length / 2);
            }
        }
        return s.substring(start,end + 1);
    }

    public static int expandFromMiddle(String s, int left, int right){
        if(s == null || left > right) return 0;

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return right - left - 1;
    }
}
