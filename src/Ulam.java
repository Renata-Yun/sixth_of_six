import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

class Ulam
{
    static Vector<Integer> arr = new Vector<Integer>();

    static int ulam(int num)
    {

        Set<Integer> s = new HashSet<Integer>();

        arr.add(1);
        s.add(1);

        arr.add(2);
        s.add(2);

        for (int i = 3; i < 100000; i++) {

            int count = 0;

            for (int j = 0; j < arr.size(); j++) {

                if (s.contains(i - arr.get(j)) && arr.get(j) != (i - arr.get(j)))
                    count++;

                if (count > 2)
                    break;
            }

            if (count == 2)
            {
                arr.add(i);
                s.add(i);
            }
        }
        return arr.elementAt(num-1);
    }
}
