import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingSubString
{
    public static String string(String s)
    {
        Set<Character> chars= new HashSet<>();
        String currentSub="";
        String longestSub="";

        for (int i=0; i<s.length(); i++)
        {
            if (!chars.contains(s.charAt(i)))
            {
                currentSub += s.charAt(i);
                chars.add(s.charAt(i));
            }
            else
            {
                if (currentSub.length()>longestSub.length())
                    longestSub=currentSub;

                currentSub="";
                chars.clear();
            }
        }
        return longestSub;
    }
}
