package demo_ngan_hang.controller;

import demo_ngan_hang.demol.TaiKhoan;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class QuanLyN {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<TaiKhoan> taiKhoanList = new ArrayList<>();

    public static void addTaiKhoan() {
        System.out.println("NHẬP SỐ TÀI KHOẢN:");
        long soTaiKhoan = scanner.nextLong();
        scanner.nextLine();

        System.out.println("NHẬP TÊN TÀI KHOẢN:");
        String tenTaiKhoan = scanner.nextLine().trim();

        TaiKhoan taiKhoan = new TaiKhoan(soTaiKhoan, tenTaiKhoan);
        taiKhoanList.add(taiKhoan);
        System.out.println("THÊM THÀNH CÔNG VỚI SỐ TIỀN BAN ĐẦU LÀ 50 ĐỒNG.");
    }

    public static void hienThiTaiKhoan() {
        if (taiKhoanList.isEmpty()) {
            System.out.println("KHÔNG CÓ TÀI KHOẢN NÀO.");
        } else {
            taiKhoanList.forEach(System.out::println);
        }
    }

    public static void xoaTaiKhoan() {
        System.out.println("NHẬP TÊN TÀI KHOẢN MUỐN XÓA:");
        String tenTaiKhoan = scanner.nextLine().trim();

        TaiKhoan taiKhoanToRemove = taiKhoanList.stream()
                .filter(tk -> tk.getTenTaiKhoan().equals(tenTaiKhoan))
                .findFirst()
                .orElse(null);

        if (taiKhoanToRemove != null) {
            taiKhoanList.remove(taiKhoanToRemove);
            System.out.println("XÓA THÀNH CÔNG.");
        } else {
            System.out.println("KHÔNG TÌM THẤY TÀI KHOẢN CÓ TÊN: " + tenTaiKhoan);
        }
    }

    public static void chuyenTien() {
        System.out.println("NHẬP TÊN TÀI KHOẢN NGUỒN:");
        String tenTaiKhoanNguon = scanner.nextLine().trim();

        TaiKhoan taiKhoanNguon = taiKhoanList.stream()
                .filter(tk -> tk.getTenTaiKhoan().equals(tenTaiKhoanNguon))
                .findFirst()
                .orElse(null);

        if (taiKhoanNguon == null) {
            System.out.println("KHÔNG TÌM THẤY TÀI KHOẢN NGUỒN CÓ TÊN: " + tenTaiKhoanNguon);
            return;
        }

        System.out.println("NHẬP TÊN TÀI KHOẢN ĐÍCH:");
        String tenTaiKhoanDich = scanner.nextLine().trim();

        TaiKhoan taiKhoanDich = taiKhoanList.stream()
                .filter(tk -> tk.getTenTaiKhoan().equals(tenTaiKhoanDich))
                .findFirst()
                .orElse(null);

        if (taiKhoanDich == null) {
            System.out.println("KHÔNG TÌM THẤY TÀI KHOẢN ĐÍCH CÓ TÊN: " + tenTaiKhoanDich);
            return;
        }

        System.out.println("NHẬP SỐ TIỀN CẦN CHUYỂN:");
        double soTienChuyen;
        try {
            soTienChuyen = scanner.nextDouble();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("SỐ TIỀN PHẢI LÀ MỘT SỐ.");
            scanner.next();
            return;
        }

        if (soTienChuyen <= 0) {
            System.out.println("SỐ TIỀN PHẢI LỚN HƠN 0.");
            return;
        }

        if (taiKhoanNguon.getSoTienTrongTk() < soTienChuyen) {
            System.out.println("SỐ TIỀN TRONG TÀI KHOẢN NGUỒN KHÔNG ĐỦ ĐỂ CHUYỂN.");
            return;
        }

        taiKhoanNguon.chuyenKhoan(taiKhoanDich, soTienChuyen);
        System.err.println("CHUYỂN KHOẢN THÀNH CÔNG.");
    }
    public static void nopTienVaoTaiKhoan() {
        System.out.println("NHẬP TÊN TÀI KHOẢN ĐỂ NỘP TIỀN:");
        String tenTaiKhoan = scanner.nextLine().trim();

        TaiKhoan taiKhoan = taiKhoanList.stream()
                .filter(tk -> tk.getTenTaiKhoan().equals(tenTaiKhoan))
                .findFirst()
                .orElse(null);

        if (taiKhoan == null) {
            System.out.println("KHÔNG TÌM THẤY TÀI KHOẢN CÓ TÊN: " + tenTaiKhoan);
            return;
        }

        System.out.println("NHẬP SỐ TIỀN CẦN NỘP:");
        double soTienNop;
        try {
            soTienNop = scanner.nextDouble();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("SỐ TIỀN PHẢI LÀ MỘT SỐ.");
            scanner.next();
            return;
        }

        if (soTienNop <= 0) {
            System.out.println("SỐ TIỀN PHẢI LỚN HƠN 0.");
            return;
        }

        taiKhoan.nopTien(soTienNop);
        System.out.println("NẠP TIỀN THÀNH CÔNG.");
    }
}
