import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {



        ArrayList<String> al = new ArrayList<>();
        al.add("Mady");
        al.add("Leila");
        al.add("Ali");
        al.add("Siri");
        al.add("Aron");

        ArrayList<String> s = (ArrayList<String>) al.stream()
                .filter(s1->s1.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(s);
    }
}
