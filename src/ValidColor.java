public class ValidColor
{
    public static boolean color(String s)
    {
        s = s.toLowerCase();
        String type = "";
        String word = "";
        double num = 0;
        int temp = 0;
        int cnt = 0;
        boolean ans = true;

        while (s.charAt(temp) != '(')
        {
            type += s.charAt(temp);
            temp++;
        }

        for (int i = temp + 1; i < s.length(); ++i)
        {
            if (Character.isDigit(s.charAt(i)) || s.charAt(i) == '.')
                word += s.charAt(i);
            else if (word != "")
            {
                num = getNum(word);
                if (num > 255)
                {
                    ans = false;
                    break;
                }
                cnt++;
                word = "";
            }
        }
        System.out.println(type);
        System.out.println(cnt);

        if (ans)
            if (type.equals("rgba") && cnt != 4)
                ans = false;
            else if (type.equals("rgb") && cnt != 3)
            {
                ans = false;
            }
        return ans;
    }

    public static double getNum(String word)
    {
        double num = 0;
        int cnt = 10;
        boolean dot = false;
        for (int j = 0; j < word.length(); ++j)
        {
            if (word.charAt(j) == '.')
                dot = true;
            else if (!dot)
            {
                num+=Character.getNumericValue(word.charAt(j));
                if (j!=word.length()-1)
                    if (word.charAt(j+1)!='.')
                        num*=10;
            }
            else
            {
                num*=cnt;
                num+=Character.getNumericValue(word.charAt(j));
                num/=cnt;
                cnt*=10;
            }
        }
        return num;
    }
}
