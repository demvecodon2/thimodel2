package quan_ly_tai_khoan.view;

import quan_ly_tai_khoan.controller.TheQuanLy;

import java.util.Scanner;

public class QuanLyTaiKhoan {



    public static void main(String[] args) {
        TheQuanLy theQuanLy = new TheQuanLy();
        Scanner scanner = new Scanner(System.in);
     while (true){
          System.out.println("Chọn chức năng theo số(để tiếp tục)");
          System.out.println("1. Thêm mới");
         System.out.println("2. xoá");
         System.out.println("3. xem danh sách các tài khoản ngaan hàng");
         System.out.println("4. tìm kếm");
         System.out.println("5. thoát");
         System.out.println("chọn chức năng:");
        int choice =Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                theQuanLy.add();
                break;
            case 2:
                theQuanLy.delete();
                break;
            case 3:
                theQuanLy.hienThiThe();
                break;
            case 4:
                theQuanLy.searchById();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("lựa chọn của bạn không hợp lệ");
        }

     }
    }
}
