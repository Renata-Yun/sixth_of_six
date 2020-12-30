import java.util.TreeSet;

public class GetHashTags
{
    public static String tags(String s)
    {
        s+=" ";
        String shortest="moooooooooooooooooooooooooore_size";
        String word="#";
        String returning="";
        String longest="";
        TreeSet<String> ans= new TreeSet();


        for (int i=0; i<s.length(); i++)
        {
            if (Character.isLetter(s.charAt(i)))
                word+=s.charAt(i);
            else
            {
                if (ans.size()<3)
                    ans.add(word);
                else
                {
                    for (String j : ans)
                    {
                        if (j.length() < shortest.length())
                            shortest = j;
                    }
                    if (word.length() > shortest.length())
                    {
                        ans.remove(shortest);
                        ans.add(word);
                    }
                }
                word="#";
                shortest="moooooooooooooooooooooooooore_size";
            }
        }
        while (!ans.isEmpty())
        {
            for (String i: ans)
            {
                if (i.length()>longest.length())
                    longest=i;
            }
            ans.remove(longest);
            longest=longest.toLowerCase();
            returning+=longest+", ";
            longest="";
        }
        return returning;
    }
}
