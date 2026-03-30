public class VowelCount {
    static void main() {
        String str = "AEIOUaeiou";
        int vCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                vCount++;
            }
        }
        System.out.println(vCount);
    }

    public static boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
                c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }
}
