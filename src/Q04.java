import java.util.Arrays;
import java.util.HashMap;

public class Q04 {

    /*
      4)  Java Program to Find Duplicate Words in a String
      Verilen bir string cümle içinde tekrar eden kelimeleri ve bu kelimelerin sayısını veren kod yazınız
     */
    public static void main(String[] args) {
        String words = "ali veli hasan hüseyin veli";

        findDuplicateWords(words);
    }

    private static void findDuplicateWords(String words) {

        //kelimeleri boşlukllardan böl  string arrayine at
        String []newWords= words.split(" ");

        //bir map içinde key value olarak yazdır
        HashMap<String, Integer> myMap = new HashMap<>();
        for (String w : newWords) {
            myMap.put(w,myMap.getOrDefault(w,0)+1);
        }

        System.out.println(myMap);

    }


}
