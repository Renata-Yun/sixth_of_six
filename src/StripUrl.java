import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StripUrl
{
    public static String param(String url, String[] params)
    {
        int i=0;
        StringBuilder ans=new StringBuilder();
        StringBuilder param= new StringBuilder();
        boolean done=false;

        HashSet notNeededParams =new HashSet(Arrays.asList(params));
        Set<StringBuilder> parametrs= new HashSet<StringBuilder>();

        for (i=0; url.charAt(i)!='?'; ++i)
            ans.append(url.charAt(i));
        if (ans.length()==url.length())
            return ans.toString();
        else
        {
            ans.append('?');
            while (!done)
            {
                for (i=url.length()-1; url.charAt(i) != '?'; --i)
                    param.insert(0,url.charAt(i));

                if (!notNeededParams.contains(param.charAt(i)))
                {
                    if(!parametrs.contains(param.substring(0,param.length()-2)))
                        parametrs.add(param);
                }
                param.setLength(0);

                if (i==url.length()-1)
                {
                    done = true;
                    if (ans.charAt(ans.length()-1)=='&')
                        ans.deleteCharAt(ans.length()-1);
                }
                else
                    ans.append('&');
            }
        }
        return ans.toString();
    }
}
