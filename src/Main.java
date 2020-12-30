import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int x;
        String s1;
        String[] smas;

        //1
        System.out.println("Программа №1");
        System.out.println("Введите кол-во элементов");
        x=scanner.nextInt();
        System.out.println(Bell.bell(x));

        //2.1
        System.out.println("Программа №2.1");
        System.out.println("Введите слово");
        s1=scanner.nextLine();
        System.out.println(TranslateWord.pigWord(s1));

        //2.2
        System.out.println("Программа №2.2");
        System.out.println("Введите предложение");
        s1=scanner.nextLine();
        System.out.println(TranslateWord.pigSentence(s1));

        //3
        System.out.println("Программа №3");
        System.out.println("Введите параметры rgb(a)");
        s1=scanner.nextLine();
        System.out.println(ValidColor.color(s1));

        //4
        System.out.println("Программа №4");
        System.out.println("Введите url-запрос");
        s1=scanner.nextLine();
        System.out.println("Введите кол-во аргументов, требующих удаления");
        x=scanner.nextInt();
        smas=new String[x];
        System.out.println("Введите аргументы");
        for (int i=0; i<x; ++i)
            smas[i]=scanner.nextLine();
        System.out.println(StripUrl.param(s1,smas));

        //5
        System.out.println("Программа №5");
        System.out.println("Введите строку");
        s1=scanner.nextLine();
        System.out.println(GetHashTags.tags(s1));

        //6
        System.out.println("Программа №6");
        System.out.println("Введите число");
        x=scanner.nextInt();
        System.out.println(Ulam.ulam(x));

        //7
        System.out.println("Программа №7");
        System.out.println("Введите строку");
        s1=scanner.nextLine();
        System.out.println(LongestNonRepeatingSubString.string(s1));

        //8
        System.out.println("Программа №8");
        System.out.println("Введите число");
        x=scanner.nextInt();
        System.out.println(ConvertToRoman.convert(x));

        //9
        System.out.println("Программа №9");
        System.out.println("Введите строку");
        s1=scanner.nextLine();
        System.out.println(Formula.formula(s1));

        //10
        System.out.println("Программа №10");
        System.out.println("Введите число");
        x=scanner.nextInt();
        System.out.println(PalindromeDescendant.descendant(x));
    }
}
