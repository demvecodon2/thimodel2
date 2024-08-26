package quan_ly_ngan_hang.view;

import java.util.Scanner;

public class ViewQuanLy {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("nhập yêu cầu của bạn\n" +
                    "1.khách hàng \n" +
                    "2.quản lý ngân hàng\n" +
                    "3.thoát chương trình ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("ko đúng yêu cầu vui long nhập lại" );
            }
        }
    }
}
