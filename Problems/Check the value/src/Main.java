import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        if (num < 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}