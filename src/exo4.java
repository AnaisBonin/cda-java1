import java.util.ArrayList;
import java.util.Arrays;

public class exo4 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String> (Arrays.asList("Jean", "Ahmed", "Lea", "Blanca"));
        describe(nameList);

    }

    private static void describe(ArrayList<String> ArrayList) {
        for (String name : ArrayList) {
            int length = name.length();

            if (length >= 4) System.out.println(name + " : " + length);
        }
    }
}
