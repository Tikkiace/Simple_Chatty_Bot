import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            if (m % 4 == 0 && m > max) {
                max = m;
            }
        }

        System.out.println(max);

    }
}