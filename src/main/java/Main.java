import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int value1 = scanner.nextInt();
        System.out.println("Первое число:" + value1);

        System.out.println("Введите второе число:");
        int value2 = scanner.nextInt();
        System.out.println("Второе число:" + value2);

        System.out.println("Введите третье число:");
        int value3 = scanner.nextInt();
        System.out.println("Третье число:" + value3);

        int result = sum(value1, value2, value3);
        System.out.println("Сумма чисел:" + result);
    }

    public static int sum(int value1, int value2, int value3) {
        return value1 + value2 + value3;
    }
}

