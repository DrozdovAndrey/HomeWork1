public class Task2 {
    public void startTask2() {
        System.out.println("������� ��� ������� ����� �� 1 �� 1000");
        int n = 1000;
        for (int i = 2; i < n; i++) {
            boolean a = true;
            int q = (int) Math.sqrt(i);
            for (int j = 2; j <= q; j++) {
                if ((i % j) == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.print(i + " ");
            }
        }
    }
}
