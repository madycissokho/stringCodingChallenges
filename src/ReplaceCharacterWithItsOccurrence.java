public class ReplaceCharacterWithItsOccurrence {
    public static void main(String[] args) {
        String input = "opentext";
        char charToReplace = 't';
        //expected output = open1ex2

        //check char presence in string
        if (input.indexOf(charToReplace)== -1){
            System.out.println("Given Character Not Available In Input String..");
            System.exit(0);
        }
        int cnt = 1;
        //logic to replace char occurrence in string
       for (int i = 0; i < input.length(); i++){
           char ch = input.charAt(i);
           if (ch == charToReplace){
               input = input.replaceFirst(String.valueOf(charToReplace), String.valueOf(cnt));
               cnt++;
           }
       }
        System.out.println(cnt);
        }


}
