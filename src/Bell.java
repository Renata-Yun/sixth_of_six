import java.util.Arrays;

public class Bell
{
    public static int bell(int n)
    {
        int ans;
        int[] first;
        int[] zeros = {0};
        int[] second = {1};

        for (int i = 2; i < n + 1; ++i)
        {
            first = second.clone();
            second = Arrays.copyOf(zeros, i);
            second[0]= first[first.length-1];

            for (int j = 1; j < second.length; ++j)
            {
                second[j] = second[j - 1] + first[j - 1];
            }
        }
        ans = second[second.length - 1];
        return ans;
    }
}


