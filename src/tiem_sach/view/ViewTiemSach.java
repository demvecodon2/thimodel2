package tiem_sach.view;

import tiem_sach.controller.QuanLyTiemSach;

import java.util.Scanner;

public class ViewTiemSach {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Nhap thu vien?");
            System.out.println("1. Hiển thị danh sách tài liệu trong tiệm");
            System.out.println("2. Thêm mới tài liệu vào trong tiệm");
            System.out.println("3. Xoá tài liệu theo mã");
            System.out.println("4. Tìm kiếm tài liệu theo mã gần đúng");
            System.out.println("5. Thoát chương trình");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    QuanLyTiemSach.hienThiTaiLieu();
                    break;
                case 2:
                    QuanLyTiemSach.add();
                    break;
                case 3:
                    QuanLyTiemSach.xoaTaiLieu();
                    break;
                case 4:
                    QuanLyTiemSach.timKiemTaiLieu();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng nhập đúng các chức năng trên");
            }
        }
    }
}
