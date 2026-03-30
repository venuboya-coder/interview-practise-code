public class Print_1_to_100 {
    /**
     * output numbers from 1 ... 100
     * without using any numbers in your code
     */
    static void main() {
        int one = 'A'/'A';
        String s1 = "..........";

        for (int i=one; i<=(s1.length() * s1.length()); i++) {
            System.out.println(i);
        }
        //using ASCII value
        //a-97 b-98 c-99 d-100
        for (int i=one; i<='d'; i++) {
            System.out.println(i);
        }

    }
}
