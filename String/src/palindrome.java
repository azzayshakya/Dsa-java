public class palindrome {
    public static boolean isPalindrome(String s) {
        String str =s.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        String s = "amanaplanaanalpanama";
        System.out.println(isPalindrome(s));



    }
}
