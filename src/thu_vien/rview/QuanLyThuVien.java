package thu_vien.rview;

import thu_vien.model.ThuVien;

import java.util.List;
import java.util.Scanner;

import static thu_vien.controller.ThuVienController.*;

public class QuanLyThuVien {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
          while (true){
              System.out.println("QUẢN LÝ THƯ VIỆN");
              System.out.println("1. Nhập thông tin về các tài liệu\n"
                      +"2. Hiển thị thông tin về các tài liệu\n"+
                      "3. Tìm kiếm tài liệu theo loại\n"+
                      "4.thoát khỏi chương trình"
                      );
              int choi = scanner.nextInt();
              switch (choi){
                  case 1:
                      addThuVien();
                      break;
                  case 2:
                      hienThiThuVien();
                      break;
                  case 3:
                      timKiemTaiLieu();
                      break;
                  case 4:
                      System.exit(0);
                  default:
                      System.out.println("LỰA CHỌN KO HỢP CHỌN LẠI");

              }
          }
    }


}
