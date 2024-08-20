package quan_ly_phuong_tien.view;


import java.util.Scanner;

import static quan_ly_phuong_tien.controller.PhuongTienController.*;

public class QuanLyPhuongTien {

    private static final Scanner scanner = new Scanner(System.in);
    public  static void main(String[] args) {
        while (true){
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("1. THÊM MỚI PHƯƠNG TIỆN");
            System.out.println("2. HIỆN THỊ DANH SÁCH PHƯƠNG TIỆN");
            System.out.println("3. XOÁ PHƯƠNG TIỆN");
            System.out.println("4. TÌM KIẾM PHƯƠNG TIỆN");
            System.out.println("5. CHỈNH SỬA PHƯƠNG TIỆN");
            System.out.println("6. THOÁT");
            int choi = scanner.nextInt();
            switch (choi){
                case 1:
                    themPhuongTien();
                    break;
                case 2:
                    hienThiPhuongTien();
                    break;
                case 3:
                    xoaPhuongTien();
                    break;
                case 4:
                    timKiemPhuongTien();
                    break;
                case 5:
                    chinhSuaPhuongTien();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("VUI LÒNG NHẬP ĐÚNG YÊU CẦU");
            }
        }

    }

}
