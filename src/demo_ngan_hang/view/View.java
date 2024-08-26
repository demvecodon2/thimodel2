//package demo_ngan_hang.view;
//
//import demo_ngan_hang.controller.QuanLyN;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class View {
//    private static final Scanner scanner = new Scanner(System.in);
//    private final QuanLyN quanLyN = new QuanLyN();
//
//    public static void main(String[] args) {
//        View view = new View();
//        view.start();
//    }
//
//    public void start() {
//        while (true) {
//            showMenu();
//            int choice = getUserChoice();
//            switch (choice) {
//                case 1:
//                    quanLyN.addTaiKhoan();
//                    break;
//                case 2:
//                    quanLyN.hienThiTaiKhoan();
//                    break;
//                case 3:
//                    quanLyN.xoaTaiKhoan();
//                    break;
//                case 4:
//                    quanLyN.chuyenTien();
//                    break;
//                case 5:
//                    System.exit(0);
//                default:
//                    System.out.println("LỰA CHỌN KHÔNG HỢP LỆ. VUI LÒNG CHỌN LẠI.");
//            }
//        }
//    }
//
//    private void showMenu() {
//        System.out.println("VUI LÒNG CHỌN ");
//        System.out.println("1. Tạo tài khoản");
//        System.out.println("2. Xem danh sách tài khoản");
//        System.out.println("3. Xóa tài khoản");
//        System.out.println("4. Chuyển khoản");
//        System.out.println("5. Thoát chương trình");
//    }
//
//    private int getUserChoice() {
//        int choice = -1;
//        while (choice < 1 || choice > 5) {
//            try {
//                choice = scanner.nextInt();
//                scanner.nextLine();
//            } catch (InputMismatchException e) {
//                System.out.println("VUI LÒNG NHẬP MỘT SỐ NGUYÊN.");
//                scanner.next();
//            }
//        }
//        return choice;
//    }
//}
