
import java.util.HashMap;
import java.util.Map;

public class UsingStringBuilder {
    public static void main(String[] args) {
        String letters = "Good code";
        System.out.println("Original String"+ letters);
        String output = "";
        String[] words = letters.split("");
        for (String word : words){
            String revWord = "";

            //reverse word
            for (int i = word.length() -1; i>=0;i--){
                revWord = revWord + word.charAt(i);
            }
            letters = letters + revWord + "";
        }
        System.out.println(letters);

    }

}
