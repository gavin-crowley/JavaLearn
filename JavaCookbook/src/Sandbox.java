import java.util.Arrays;

public class Sandbox {
    public static void main(String[] args) {
//        int [] arr = new int [12];
//        int [] arr2;

//        int [] arr = {1,2,3,4,5};

//        double [] arr = {1,2,3,4,5,6,7,8,9,10};
//        double sum = 0;
//        for (double x :
//                arr) {
//            sum += x;
//        }
//        System.out.println(sum / arr.length);
//
//        String [] sortArr = {"b", "c", "a"};
//        Arrays.sort(sortArr);
//        System.out.println(Arrays.toString(sortArr));
//
//        String arr = "hello";
//        System.out.println(arr.indexOf('l'));
//        System.out.println(arr.lastIndexOf('l'));

//        String str = "I like Java";
//        System.out.println(str.length());
//        System.out.println(str.charAt(3));

        String str = "abc";
        System.out.println(str.charAt(0) + " " + str.charAt(str.length() -1));
        String str2 = "code";
        // Creating array of string length
        char[] arr = new char[str2.length()];

        // Copy character by character into array
        for (int i = 0; i < str2.length(); i++) {
            arr[i] = str2.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
