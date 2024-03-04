import java.util.LinkedHashMap;
import java.util.Map;

public class Q01 {
    /**
     * 1) Java Program to Find the First Non-repeated Character in a String
     * *
     * Girilen sitring bir ifadede tekrar etmeyen ilk karakteri getiren kodu yazınız.
     *
     * @param args
     */
    public static void main(String[] args) {

        String word = "Sabasbh";
        System.out.println(firstNonRepeatedCharacter(word));

    }

    public static char firstNonRepeatedCharacter(String s) {
        s = s.toLowerCase();
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char w : s.toCharArray()) {
            charCount.put(w, charCount.getOrDefault(w, 0) + 1);
        }
        for (Map.Entry<Character, Integer> each : charCount.entrySet()) {
            if (each.getValue() == 1) {
                return each.getKey();
            }
        }

        return '0';

    }
}
