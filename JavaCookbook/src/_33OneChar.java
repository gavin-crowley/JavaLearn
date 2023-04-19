public class _33OneChar {
    public static void main(String[] args) {
//        String a = "A quick bronze fox";
//        for (int i = 0; i < a.length(); i++) { // no forEach, need the index
//            String message = String.format(
//                    "charAt is '%c', codePointAt is %3d, casted it's '%c'",
//                    a.charAt(i),
//                    a.codePointAt(i),
//                    (char) a.codePointAt(i));
//            System.out.println(message);
//        }

        String mesg = "Hello world";
// Does not compile, Strings are not iterable
// for (char ch : mesg) {
// System.out.println(ch);
// }
        System.out.println("Using toCharArray:");
        for (char ch : mesg.toCharArray()) {
            System.out.println(ch);
        }
        System.out.println("Using Streams:");
        mesg.chars().forEach(c -> System.out.println((char) c));
    }
}
