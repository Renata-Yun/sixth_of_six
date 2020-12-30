import java.util.HashSet;
import java.util.Set;

public class TranslateWord
{
    public static String pigWord(String s)
    {
        s = s.toLowerCase();
        String word = "";
        char[] temp = {'a', 'e', 'i', 'o', 'u', 'y'};
        Set<Character> letters = new HashSet<>();
        for (char c : temp) letters.add(c);

        if (letters.contains(s.charAt(0)))
            return (s + "yay");
        else
        {
            for (int i = 0; i < s.length(); ++i)
            {
                if (!letters.contains(s.charAt(i)))
                    word += s.charAt(i);
                else
                {
                    s = s.substring(i);
                    break;
                }
            }
            return (s + word + "ay");
        }
    }

    public static String pigSentence(String s)
    {
        String ans = "";
        String word = "";

        for (int i = 0; i < s.length(); ++i)
        {
            if (Character.isLetter(s.charAt(i)) && i != s.length() - 1)
                word += s.charAt(i);
            else if (word.length() >= 1)
            {
                if (s.length() - 1 == i)
                {
                    word += s.charAt(i);
                    word=pigWord(word);
                    ans+=word;
                }
                else
                {
                    word = pigWord(word);
                    ans += word + s.charAt(i);
                    word = "";
                }
            }
        }

        return ans;
    }
}
