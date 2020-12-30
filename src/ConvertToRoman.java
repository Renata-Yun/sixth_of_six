public class ConvertToRoman
{
    public static String convert(int num)
    {
        String ans = "";
        switch (num % 10)
        {
            case 1:
                ans += "I";
                break;
            case 2:
                ans += "II";
                break;
            case 3:
                ans += "III";
                break;
            case 4:
                ans += "IV";
                break;
            case 5:
                ans += "V";
                break;
            case 6:
                ans += "VI";
                break;
            case 7:
                ans += "VII";
                break;
            case 8:
                ans += "VIII";
                break;
            case 9:
                ans += "IX";
                break;
        }
        num/=10;
        if (num!=0)
        {
            switch (num%10)
            {
                case 1:
                    ans = "X"+ans;
                    break;
                case 2:
                    ans = "XX"+ans;
                    break;
                case 3:
                    ans = "XXX"+ans;
                    break;
                case 4:
                    ans = "XL"+ans;
                    break;
                case 5:
                    ans = "L"+ans;
                    break;
                case 6:
                    ans = "LX"+ans;
                    break;
                case 7:
                    ans = "LXX"+ans;
                    break;
                case 8:
                    ans = "LXXX"+ans;
                    break;
                case 9:
                    ans = "XC"+ans;
                    break;
            }
            num/=10;
            if (num!=0)
            {
                switch (num%10)
                {
                    case 1:
                        ans = "C"+ans;
                        break;
                    case 2:
                        ans = "CC"+ans;
                        break;
                    case 3:
                        ans = "CCC"+ans;
                        break;
                    case 4:
                        ans = "CD"+ans;
                        break;
                    case 5:
                        ans = "D"+ans;
                        break;
                    case 6:
                        ans = "DC"+ans;
                        break;
                    case 7:
                        ans = "DCC"+ans;
                        break;
                    case 8:
                        ans = "DCCC"+ans;
                        break;
                    case 9:
                        ans = "CM"+ans;
                        break;
                }
                num/=10;
                if (num%10!=0)
                {
                    switch(num%10)
                    {
                        case 1:
                            ans = "M"+ans;
                            break;
                        case 2:
                            ans = "MM"+ans;
                            break;
                        case 3:
                            ans = "MMM"+ans;
                            break;
                    }
                }
            }
        }
        return ans;
    }
}
