public class Palindrome {

    public static void main(String[] args) {

        int num = 999, rev = 0, rem, ori;

        ori = num;

        
        while( num != 0 )
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num  /= 10;
        }

        
        if (ori == rev)
            System.out.println(ori + " is a palindrome.");
        else
            System.out.println(ori+ " is not a palindrome.");
    }
}