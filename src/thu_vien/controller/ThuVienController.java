package thu_vien.controller;

import thu_vien.model.Bao;
import thu_vien.model.Sach;
import thu_vien.model.TapChi;
import thu_vien.model.ThuVien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThuVienController {
    private static final List<Bao> baos = new ArrayList<Bao>();
    private static final List<Sach> sachs = new ArrayList<Sach>();
    private static final List<TapChi> tapChis = new ArrayList<TapChi>();
    private static Scanner scanne = new Scanner(System.in);

    public static void addThuVien() {
        int choice;
        while (true) {
            System.out.println("CHỌN LOẠI MUỐN THÊM VÀO");
            System.out.println("1. THÊM BÁO");
            System.out.println("2. thêm sách");
            System.out.println("3. thêm tạp chí");

            try {
                choice = Integer.parseInt(scanne.nextLine());
                if (choice < 1 || choice > 3) {
                    System.out.println(" LỰA CHỌN KO HỢP LỆ VUI LÒNG CHỌN LẠI");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("LỰA CHỌN KO HỢP LỆ. VUI LÒNG CHỌN LẠI");
            }
        }
        System.out.println("NHẬP MÃ TÀI LIỆU");
        String maTaiLieu = scanne.nextLine();
        System.out.println("TÊN NHÀ SUẤT BẢN");
        String nhaSuatBan = scanne.nextLine();
        System.out.println("số bản được suất bản");
        int soBanPhatHanh = Integer.parseInt(scanne.nextLine());
        switch (choice) {
            case 1:
                System.out.println("NGÀY PHÁT HÀNH");
                LocalDate ngayPhatHanh = LocalDate.now();
                Bao bao = new Bao(maTaiLieu, nhaSuatBan, soBanPhatHanh, ngayPhatHanh);
                baos.add(bao);
                break;
            case 2:
                System.out.println("TÊN TÁC GIẢ");
                String tenTacGia = scanne.nextLine();
                System.out.println("SỐ TRANG");
                int soTrang = Integer.parseInt(scanne.nextLine());
                Sach sach = new Sach(maTaiLieu, nhaSuatBan, soBanPhatHanh, tenTacGia, soTrang);
                sachs.add(sach);
                break;
            case 3:
                System.out.println("SỐ PHÁT HÀNH");
                String soPhatHanh = scanne.nextLine();
                System.out.println("THÁNG PHÁT HÀNH");
                LocalDate thangPhatHanh = LocalDate.now();
                TapChi tapChi = new TapChi(maTaiLieu, nhaSuatBan, soBanPhatHanh, soPhatHanh,thangPhatHanh);
                tapChis.add(tapChi);
                break;
        }
    }

    public static void hienThiThuVien() {
        System.out.println("CHỌN LOẠI SÁCH MÀ BẠN CẦN XEM");
        System.out.println("1.HIỆN THỊ SỐ BÁO ");
        System.out.println("2. HIỂN THỊ SỐ SÁCH");
        System.out.println("3. hiển thị tạp chí");
        int choice = Integer.parseInt(scanne.nextLine());
        switch (choice) {
            case 1:
                if (baos.isEmpty()) {
                    System.out.println(" BÁO TRONG THƯ VIỆN TRỐNG");
                } else {
                    System.out.println("DANH SÁCH BÁO");
                    for (Bao bao : baos) {
                        System.out.println(bao);
                    }
                }
                break;
            case 2:
                if (sachs.isEmpty()) {
                    System.out.println(" SÁCH TRONG THƯ VIỆN TRỐNG");
                } else {
                    System.out.println("SỐ SÁCH TRONG THƯ VIỆN");
                    for (Sach sach : sachs) {
                        System.out.println(sach);
                    }
                }
                break;
            case 3:
                if (tapChis.isEmpty()) {
                    System.out.println("TẠP CHÍ TRONG THƯ VIỆN TRÔNG");
                } else {
                    System.out.println("TẠP CHÍ TRONG THƯ VIỆN");
                    for (TapChi tapChi : tapChis) {
                        System.out.println(tapChi);
                    }
                }
                break;
            default:
                System.out.println("LỰA CHỌN CỦA BẠN KO PHÙ HỢP VUI LÒNG CHONJ LẠI");
                break;

        }
    }

    public static void timKiemTaiLieu() {
        System.out.println("nhập mã tài liệu để tìm");
        String maTaiLieu = scanne.nextLine();
        boolean found = false;
        System.out.println("danh sách tìm thây là ");
        found = seachInList(maTaiLieu, baos) ||
                seachInList(maTaiLieu, sachs) ||
                seachInList(maTaiLieu, tapChis);
        if (!found) {
            System.out.println("KO TÌM THẤY yêu cầu của bạn");

        }
    }

    private static boolean seachInList(String maTaiLieu, List<? extends ThuVien> list) {
        boolean found = false;
        for (ThuVien thuVien : list) {
            if (thuVien.getMaTaiLieu().toLowerCase().contains(maTaiLieu)) {
                System.out.println(thuVien);
                found = true;
            }
        }
        return found;

    }
}





