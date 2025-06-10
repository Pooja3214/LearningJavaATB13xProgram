package JavaPrograms;

public class PalindromeString {

    public static boolean isPalindrome(String s)
    {
     s=s.toLowerCase();

     String rev="";

     for(int i=s.length()-1;i>=0;i--){
         rev= rev+s.charAt(i);

     }
//     s=rev;
        return (s.equals(rev));

    }

    public static void main(String[] args) {
       String s1="racecar";

       String s2="act";

        if (isPalindrome(s1)
        ) {
            System.out.println(s1 + " is a palindrome");
        }else {
            System.out.println(s1 + " is a not palindrome");
        }

        if (isPalindrome(s2))
        {
            System.out.println(s2 + " is a palindrome");
        }else {
            System.out.println(s2 + " is a not palindrome");
        }
    }


}
