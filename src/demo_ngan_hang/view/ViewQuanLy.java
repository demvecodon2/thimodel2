package demo_ngan_hang.view;

import demo_ngan_hang.controller.QuanLyN;

import java.util.Scanner;

public class ViewQuanLy {
    private static final Scanner scanner = new Scanner(System.in);
    private final QuanLyN quanLyN = new QuanLyN();


    public static void main(String[] args) {
        while (true) {
            System.out.println("QUẢN LÝ THẺ NGÂN HÀNG");
                System.out.println("1.TẠO TÀI KHOẢN\n" +
                        "2. xem danh sách tài khoản\n" +
                        "3. xoá danh sách\n" +
                        "4. chuyển khoản\n" +
                        "5. thêm tiền vào tài khoản\n" +
                        "6. thoát chương trình");
                int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    QuanLyN.addTaiKhoan();
                    break;
                case 2:
                    QuanLyN.hienThiTaiKhoan();
                    break;
                case 3:
                    QuanLyN.xoaTaiKhoan();
                    break;
                case 4:
                    QuanLyN.chuyenTien();
                    break;
                case 5:
                    QuanLyN.nopTienVaoTaiKhoan();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("LỰA CHỌN KHÔNG HỢP LỆ. VUI LÒNG CHỌN LẠI.");
            }
        }
    }
}
