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
        System.out.println("\n����� ���������� � �����������\n ������� ������ �����");
        int a = sc.nextInt();
        System.out.println("�������� ��������: -,+,/ ��� *");
        String sign = sc.next();
        System.out.println("������� ������ �����: ");
        int b = sc.nextInt();

        sc.close();
        int res = Calc(a, b, sign);
        System.out.printf("��������� = %d", res);
    }
}
