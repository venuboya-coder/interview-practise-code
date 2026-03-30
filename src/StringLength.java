public class StringLength {
    static void main() {
        String str = "testing";
        System.out.println(str.toCharArray().length);
        System.out.println(str.lastIndexOf(""));
        System.out.println(str.split("").length);
        int count = 0;
        for(char ch : str.toCharArray()) {
            count++;
        }
        System.out.println(count);
        int ans = getlength(str);
        System.out.println(ans);
    }

    public static int getlength(String str) {
        int i = 0;
        try {
            while (true) {
                str.charAt(i);
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return i;
        }
    }
}
