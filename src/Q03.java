import java.util.LinkedHashMap;

public class Q03 {

    /**
     * 3)  Java Program to Find Duplicate Characters in a String
     * *
     * Verilen String içinde tekrar eden karakterleri ve tekrer sayısını veren bir kod yazınız
     */

    public static void main(String[] args) {
        String word = "hhaaaaaaabbbbbbcccde";
        dublicateChars(word);
    }

    private static void dublicateChars(String word) {

        LinkedHashMap<Character, Integer> dublicated = new LinkedHashMap<>();
        for (char w : word.toCharArray()) {
            dublicated.put(w,dublicated.getOrDefault(w,0)+1);

        }
        System.out.println(dublicated);

    }


}
