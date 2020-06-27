public class Exercise8 {
    public static void main(String args[])
    {
        String text1 = "This is a comparison";
        String text2 = "THIS is A comparison";
        int c = text1.compareToIgnoreCase(text2);
        System.out.println(c);
    }
}
