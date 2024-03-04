public class Q02 {


    /**
     * 2)  Java Program to Check Palindrome String
     * *
     * Verilen String ifadenin palindrome olup olmadığını kontrol eden kod yazınız
     */
    public static void main(String[] args) {

        String word = "ijavaji";
        System.out.println(palindrome(word));

    }

    public static boolean palindrome(String s) {
        StringBuilder reverse = new StringBuilder(s);
        reverse = reverse.reverse();

        boolean s1 = (s.equals(reverse.toString())) ?true: false;
        return s1;
    }
}
