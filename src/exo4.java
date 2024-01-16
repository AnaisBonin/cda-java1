public class exo4 {
    public static void main(String[] args) {
        String[] nameList = new String[]{"Jean", "Ahmed", "Lea", "Blanca"};
        describe(nameList);

    }

    private static void describe(String[] ArrayList) {
        for (String name : ArrayList) {
            System.out.println(name + " : " + name.length());
        }
    }
}
