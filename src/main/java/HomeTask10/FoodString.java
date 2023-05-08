package HomeTask10;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FoodString {
    public static void Show(String txt) {
        txt = txt.toLowerCase();
        txt = txt.replaceAll(" ", "");
        String[] words = txt.split(",");
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < words.length; i++) {
            if (words[i] != "") {
                list.add(words[i]);

                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        words[j] = "";
                    }
                }
            }
        }

        for (String word : list){

            System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1, word.length()));
        }
    }

    public static void main (String [] args) {
        String str = "масло, масло, колбаса, молоко";
        Show(str);
    }


}
