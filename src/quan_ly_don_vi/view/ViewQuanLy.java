package quan_ly_don_vi.view;

import quan_ly_don_vi.demol.CanBo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.awt.AWTEventMulticaster.add;

public class ViewQuanLy {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<CanBo> canBoList = new ArrayList<>();
    public static void main(String[] args) {
        while (true) {
            System.out.println("QUẢN LÝ CÁN BỘ");
            System.out.println("1. nhập thông tin cán bộ\n" +
                    "2. tìm kiếm theo họ tên\n" +
                    "3. sắp xếp theo tên\n" +
                    "4. hiện thị thông tin về danh sách cán bộ\n" +
                    "5. thoát chương trình");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("NHẬP ĐÚNG YÊU CẦU");
            }
        }

    }

//    private static void addCanBo() {
//        System.out.println("nhập họ tên cán bộ");
//        String hoTen = scanner.nextLine();
//        System.out.println("nhập năm sinh");
//        LocalDate ngaySinh = LocalDate.parse(scanner.nextLine());
//        System.out.println("Nhập giới tinhs");
//        String gioiTinh = scanner.nextLine();
//        System.out.println("NHẬP ĐỊA CHỈ");
//        String diaChi = scanner.nextLine();
//        CanBo canBo = new CanBo(hoTen,ngaySinh,gioiTinh,diaChi) {
//            canBoList.add(canBo);
//        }}
}
