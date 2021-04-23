import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int output = 0;

        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                output = output + 1;
            }
        }
        System.out.println(output);

    }
}