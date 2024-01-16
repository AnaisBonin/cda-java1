import java.util.ArrayList;
import java.util.Arrays;

public class exo4 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<> (Arrays.asList("Jean", "Ahmed", "Lea", "Blanca"));
        describe(nameList);
        to_upper_case(nameList);

    }

    private static void describe(ArrayList<String> ArrayList) {
        for (String name : ArrayList) {
            int length = name.length();

            if (length >= 4) System.out.println(name + " : " + length);
        }
    }

    private static void to_upper_case(ArrayList<String> ArrayList) {
        for (String name : ArrayList) {
            String upperName = name.toUpperCase();
            System.out.println(upperName);
        }
    }

}
