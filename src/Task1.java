import java.util.Scanner;

public class Task1 {
    public void startTask1(){
        System.out.println("������� ����� �� 1 � ������:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sumA = 0;
        int facA = 1;
        for (int i = 1; i <= a; i++) {
            sumA += i;
            facA *= i;
        }
        System.out.println(sumA);
        System.out.println(facA);
    }
}
