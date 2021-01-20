import java.util.HashMap;
import java.util.Map;

public class Pentalog {

    public static void main(String[] args) {

        String s = "ddffgdagta";
        HashMap<Character, Integer> aparitii = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {

            if (aparitii.containsKey(s.charAt(i)))
                aparitii.put(s.charAt(i), aparitii.get(s.charAt(i)) + 1);
            else
                aparitii.put(s.charAt(i), 1);


        }

        for (Map.Entry<Character, Integer> entry :
                aparitii.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey());
                break;
            }
        }


    }
}
