import java.util.Scanner;

public class Task3 {
    public int Calc(int a, int b, String sign) {
        int res = 0;
        switch (sign) {
            case ("+"):
                res = a + b;
                break;

            case ("-"):
                res = a - b;
                break;

            case ("*"):
                res = a * b;
                break;

            case ("/"):
                res = a / b;
                break;

            default:
                break;

        }
        return res;
    }

    public void startTask3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nДобро пожаловать в калькулятор\n Введите первое число");
        int a = sc.nextInt();
        System.out.println("Выберете операцию: -,+,/ или *");
        String sign = sc.next();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();

        sc.close();
        int res = Calc(a, b, sign);
        System.out.printf("Результат = %d", res);
    }
}
