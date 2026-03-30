public class StarPattern {
    static void main() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
