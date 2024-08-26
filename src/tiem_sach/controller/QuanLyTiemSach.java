package tiem_sach.controller;

import tiem_sach.mode.Sach;
import tiem_sach.mode.TapChi;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLyTiemSach {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Sach> sachList = new ArrayList<>();
    private static final List<TapChi> tapChiList = new ArrayList<>();
    private static final String FILE_PATH = "src/tiem_sach/file/tiemsach.csv";

    public QuanLyTiemSach() {
    }

    public static void add() {
        int choice = getChoice("Chọn loại bạn muốn thêm vào tiệm:\n1. Thêm sách\n2. Thêm tạp chí", 1, 2);
        System.out.println("Nhập mã tài liệu:");
        String maTaiLieu = scanner.nextLine();
        System.out.println("Nhập tiêu đề:");
        String tieuDe = scanner.nextLine();
        System.out.println("Nhà sản xuất:");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Nhập năm xuất bản (yyyy-MM-dd):");
        LocalDate ngaySanXuat = LocalDate.parse(scanner.nextLine());

        switch (choice) {
            case 1:
                System.out.println("Nhập tên tác giả:");
                String tenTacGia = scanner.nextLine();
                System.out.println("Số trang trong sách:");
                double soTrangSach = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập thể loại sách:");
                String theLoaiSach = scanner.nextLine();
                Sach sach = new Sach(maTaiLieu, tieuDe, nhaSanXuat, ngaySanXuat, tenTacGia, soTrangSach, theLoaiSach);
                sachList.add(sach);
                saveDataToFile();
                break;
            case 2:
                System.out.println("Nhập chủ đề tạp chí:");
                String chuDe = scanner.nextLine();
                TapChi tapChi = new TapChi(maTaiLieu, tieuDe, nhaSanXuat, ngaySanXuat, chuDe);
                tapChiList.add(tapChi);
                saveDataToFile();
                break;
        }
    }

    public static void hienThiTaiLieu() {
        loadDataFromFile();
        int choice = getChoice("Lựa chọn loại tài liệu mà bạn muốn xem:\n" +
                "1. Hiển thị sách trong tiệm\n" +
                "2. Hiển thị tạp chí trong tiệm\n" +
                "3. Hiển thị tất cả tài liệu trong cửa hàng", 1, 3);
        switch (choice) {
            case 1:
                if (sachList.isEmpty()) {
                    System.out.println("Sách trong tiệm hiện tại không có.");
                } else {
                    System.out.println("Sách trong tiệm:");
                    for (Sach sach : sachList) {
                        System.out.println(sach);
                    }
                }
                break;
            case 2:
                if (tapChiList.isEmpty()) {
                    System.out.println("Tạp chí trong tiệm hiện tại không có.");
                } else {
                    System.out.println("Tạp chí trong tiệm:");
                    tapChiList.forEach(System.out::println);
                }
                break;
            case 3:
                if (sachList.isEmpty() && tapChiList.isEmpty()) {
                    System.out.println("Hiện tại trong cửa hàng chưa có tài liệu.");
                } else {
                    System.out.println("Các tài liệu trong cửa hàng:");
                    sachList.forEach(System.out::println);
                    tapChiList.forEach(System.out::println);
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                break;
        }
    }

    public static void xoaTaiLieu() {
        int choice = getChoice("Chọn loại tài liệu để xóa:\n1. Sách\n2. Tạp chí", 1, 2);
        System.out.println("Nhập mã tài liệu cần xóa:");
        String maTaiLieu = scanner.nextLine();

        switch (choice) {
            case 1:
                sachList.removeIf(sach -> sach.getMaTaiLieu().equals(maTaiLieu));
                saveDataToFile();
                break;
            case 2:
                tapChiList.removeIf(tapChi -> tapChi.getMaTaiLieu().equals(maTaiLieu));
                saveDataToFile();
                break;
            default:
                System.out.println("Chọn không hợp lệ.");
                return;
        }

        System.out.println("Xóa thành công.");
    }

    public static void timKiemTaiLieu() {
        System.out.println("Nhập mã tài liệu gần đúng để tìm kiếm:");
        String maTaiLieu = scanner.nextLine();

        List<Sach> sachTimKiem = sachList.stream()
                .filter(sach -> sach.getMaTaiLieu().contains(maTaiLieu))
                .collect(Collectors.toList());

        List<TapChi> tapChiTimKiem = tapChiList.stream()
                .filter(tapChi -> tapChi.getMaTaiLieu().contains(maTaiLieu))
                .collect(Collectors.toList());

        System.out.println("Kết quả tìm kiếm sách:");
        sachTimKiem.forEach(System.out::println);

        System.out.println("Kết quả tìm kiếm tạp chí:");
        tapChiTimKiem.forEach(System.out::println);
    }

    private static void loadDataFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(",");
                if (split.length == 7) {
                    String maTaiLieu = split[0];
                    String tieuDe = split[1];
                    String nhaSanXuat = split[2];
                    LocalDate ngaySanXuat = LocalDate.parse(split[3]);
                    String tenTacGia = split[4];
                    double soTrangSach = Double.parseDouble(split[5]);
                    String theLoaiSach = split[6];
                    Sach sach = new Sach(maTaiLieu, tieuDe, nhaSanXuat, ngaySanXuat, tenTacGia, soTrangSach, theLoaiSach);
                    sachList.add(sach);
                }else { if(split.length==5){
                    String maTaiLieu = split[0];
                    String tieuDe = split[1];
                    String nhaSanXuat = split[2];
                    LocalDate ngaySanXuat = LocalDate.parse(split[3]);
                    String chuDe = split[4];
                    TapChi tapChi= new TapChi(maTaiLieu,tieuDe,nhaSanXuat,ngaySanXuat,chuDe);
                    tapChiList.add( tapChi );
                }
                }
//                String maTaiLieu = split[0];
//                String tieuDe = split[1];
//                String nhaSanXuat = split[2];
//                LocalDate ngaySanXuat = LocalDate.parse(split[3]);
////                if () {
//                String tenTacGia = split[4];
//                double soTrangSach = Double.parseDouble(split[5]);
//                String theLoaiSach = split[6];
//                Sach sach = new Sach(maTaiLieu, tieuDe, nhaSanXuat, ngaySanXuat, tenTacGia, soTrangSach, theLoaiSach);
//                sachList.add(sach);
//                } else {
//                    String chuDe = split[4];
//                    TapChi tapChi = new TapChi(maTaiLieu, tieuDe, nhaSanXuat, ngaySanXuat, chuDe);
//                    tapChiList.add(tapChi);
//                }
            }
        } catch (IOException ex) {
            System.err.println("Error loading data from file: " + ex.getMessage());
        }
    }

    private static boolean isSach(String maTaiLieu) {
        return maTaiLieu != null && maTaiLieu.startsWith("S");
    }

    private static int getChoice(String prompt, int min, int max) {
        int choice;
        while (true) {
            System.out.println(prompt);
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= min && choice <= max) {
                    return choice;
                } else {
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private static void saveDataToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Sach sach : sachList) {
                bw.write(sach.toCsvString() + "\n");
            }
            for (TapChi tapChi : tapChiList) {
                bw.write(tapChi.toCsvString() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error saving data to file: " + e.getMessage());
        }
    }
}
