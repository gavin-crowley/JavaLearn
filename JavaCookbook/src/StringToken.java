public class StringToken {
    public static void main(String[] args) {
        String myString = "abcdef";
//        for (String word: myString.split("")
        for (String word: myString.split(",")
        ) {
            System.out.println(word);
        }
    }
}
