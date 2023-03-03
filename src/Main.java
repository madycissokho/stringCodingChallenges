import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String str = "Hello";

        //Reverse String
        //Approach-1
       char[] chArr = str.toCharArray();
       for (int i = chArr.length - 1; i>=0; i--){
           System.out.print(chArr[i]);
        }
        System.out.println("=================");
       for (int i = str.length()-1; i >= 0; i--){
           System.out.print(str.charAt(i));
       }
        System.out.println("==================");
       StringBuffer sf = new StringBuffer(str);
        System.out.println(sf.reverse());

        System.out.println("=================");
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
        System.out.println("=================");
        String srt = "$ja!va$&st%ar";

       String plainSrt = srt.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(plainSrt);

        System.out.println("==============");
        String space = " j a va s ta  r  ";

        String removeSpaces = space.replaceAll("\\s", "");
        System.out.println(removeSpaces);
        System.out.println("===============");

        String rts = "Programming";
        StringBuilder sgb = new StringBuilder();
        rts.chars().distinct().forEach(c -> sgb.append((char)c));
        System.out.println(sgb);

        System.out.println("==============");
        StringBuilder sgb2 = new StringBuilder();
        for (int i= 0; i<rts.length(); i++){
            char ch = rts.charAt(i);
            int idx = rts.indexOf(ch, i+1);
            if (idx==-1){
                sgb2.append(ch);
            }
        }
        System.out.println(sgb2);

        System.out.println("===============");
        char[] arr = rts.toCharArray();
        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            boolean repeated = false;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    repeated = true;
                    break;
                }
            }
            if (!repeated){
                sb3.append(arr[i]);
            }

        }
        System.out.println(sb3);

        System.out.println("==============");
        StringBuilder sb4 = new StringBuilder();
        Set<Character> set = new LinkedHashSet();
        for (int i = 0; i < rts.length(); i++){
            set.add(rts.charAt(i));
        }
        for (Character c : set){
            sb4.append(c);
        }
        System.out.println(sb4);

    }
}