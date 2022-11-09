package Q1_Q10;

public class Q7_Reverse_Integer {
    public static void main(String[] args) {
        int number = 123;

        System.out.println(reverse(number));
    }

    public static int reverse(int number) {
        long reverseNum = 0;
        int lastDigit = 0;

        while(number > 0){
            lastDigit = number % 10;
            /// 123
            // last digit = 3
            // reverseNum = 0 + lastDigit
            if(reverseNum == 0){
                reverseNum += lastDigit;
            } else {
                // reverseNum * 10 + lastDigit
                reverseNum = reverseNum * 10 + lastDigit;
            }
            number /= 10;

            if(reverseNum > Integer.MAX_VALUE || reverseNum < Integer.MIN_VALUE){
                throw new RuntimeException("Reversed number exceed integer limit");
            }
        }
        return (int)reverseNum;
    }

    public static int reverseInteger(int number){
        long reversed = 0;
        while(number != 0){
            reversed = reversed * 10 + number % 10;

            number /= 10;

            if(reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE){
                throw new RuntimeException("Reversed Integer exceeds int limits.");
            }

        }
        return (int)reversed;

    }
}
