package masterJavaArray;

import java.util.Arrays;

public class PrintDuplicateElements {
    public static void main(String[] args) {
        int[] e = {2,4,2,3,5,3};
        for (int i = 0; i<e.length; i++){
            for (int j = i+1; j<e.length; j++){
                if (e[i]==e[j]){
                    System.out.println(e[i]);
                }
            }
        }
    }
}
