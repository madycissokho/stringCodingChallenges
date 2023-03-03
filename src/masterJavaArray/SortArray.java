package masterJavaArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] a = {4,2,1,3};
        for(int i=0; i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]< a [j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        //merge two arrays
//        int[] a = {4,3,1,2};
//        for (int i = 0; i<a.length; i++){
//            for (int j = i+1; j<a.length;j++){
//                if (a[i] > a[j]){
//                    int temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//
//                }
//            }
//        }
//        System.out.println(Arrays.toString(a));

    }
}
