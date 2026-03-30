public class PrintWithoutLoop {
    static void main() {
        printNumber(1);
    }

    public static void printNumber(int num) {
        if (num <= 20){
            System.out.println(num);
            num++;
            printNumber(num);
        }
    }
}
