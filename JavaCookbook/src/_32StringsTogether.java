public class _32StringsTogether {
    public static void main(String[] args) {
        String s1 = "Hello" + ", " + "World";
        System.out.println(s1);
// Build a StringBuilder, and append some things to it.
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hello");
        sb2.append(',');
        sb2.append(' ');
        sb2.append("World");
// Get the StringBuilder's value as a String, and print it.
        String s2 = sb2.toString();
        System.out.println(s2);
// Now do the above all over again, but in a more
// concise (and typical "real-world" Java) fashion.
        System.out.println(
                new StringBuilder()
                        .append("Hello")
                        .append(',')
                        .append(' ')
                        .append("World"));
    }
}
