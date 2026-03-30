public class ReverseString {
    static void main() {
        String str = "welcome to Java world";
        System.out.println(str);
        String[] splitArray = str.split(" ");
        for (int i = splitArray.length - 1; i >= 0; i--) {
            System.out.print(splitArray[i] + " ");
        }
    }
}
