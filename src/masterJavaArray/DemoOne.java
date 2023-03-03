package masterJavaArray;

import java.util.Arrays;
import java.util.stream.Stream;

public class DemoOne {
    public static void main(String[] args) {
        String[] arr = new String[3];
        arr[0] = "Sachin";
        arr[1] = "Adam";
        arr[2] = "Salih";
        System.out.println(Arrays.toString(arr));
        System.out.println("Approach-1");
        for (int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Approach-2");
        String[] names = {"Yahya","Mariam","Issa"};
        for (String name : names){
            System.out.println(name);
        }
        System.out.println("Approach-3");
        Stream.of(names).forEach(name-> System.out.println(name));

        System.out.println("=============Reverse======");
        int[] nums = {1,2,4,6,78,99,0};
        String[] nm = {"Mady","Mohammad","Ayoub","Yusuf"};
        for (int i = nm.length; i>=0; i--){

        }
        for (int i = nums.length -1; i >=0; i--){
            System.out.println(nums[i]);
        }
        System.out.println("================");
        int[][] arry = new int[2][2];
        arry[0][0]=1;
        arry[0][1]=2;
        arry[1][0]=6;
        arry[1][1]=8;
        for (int[] ar : arry){
            for (int a : ar){
                System.out.println(a);

            }
        }
    }


}
