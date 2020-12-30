public class PalindromeDescendant
{
    public static boolean descendant(int num)
    {
        String newNum=Integer.toString(num);
        int numeral=0;
        boolean start=true;
        boolean ans=true;
        do
        {
            if (!start)
            {
                newNum="";
                while (num!=0)
                {
                    numeral=num%10;
                    num/=10;
                    numeral+=num%10;
                    num/=10;
                    newNum=numeral+newNum;
                    //  System.out.println(newNum);
                }
            }
            num=Integer.parseInt(newNum);
            String left = Integer.toString(num);
            String right;

            right = left.substring(left.length() / 2);
            left = left.substring(0, left.length() / 2);
            right = reverse(right);
            start=false;
            if (left.equals(right))
                break;
        } while (num>10);

        if (num>10 && num<100 && num%10!=num/10)
            ans=false;
        return ans;
    }

    static String reverse(String s)
    {
        String ans="";
        for (int i=0; i<s.length(); i++)
            ans=s.charAt(i)+ans;
        return ans;
    }
}
