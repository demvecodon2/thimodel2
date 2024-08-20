package quan_ly_phuong_tien.controller;

import quan_ly_phuong_tien.model.*;
        import java.io.*;
        import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhuongTienController {
    private static final List<Oto> otos = new ArrayList<>();
    private static final List<XeMay> xeMays = new ArrayList<>();
    private static final List<XeTai> xeTais = new ArrayList<>();
    private static final List<HangSanXuat> hangSanXuats = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    private static final String OTOS_FILE = "src/quan_ly_phuong_tien/data/oto.csv";
    private static final String XEMAYS_FILE = "src/quan_ly_phuong_tien/data/xeMay.csv";
    private static final String XETAIS_FILE = "src/quan_ly_phuong_tien/data/xetai.csv";
    private static final String HANGSANXUATS_FILE = "src/quan_ly_phuong_tien/data/hangsansuat.csv";


    static {
        readOtosFromFile();
        readXeMaysFromFile();
        readXeTaisFromFile();
        readHangSanXuatsFromFile();
    }

    public static void themPhuongTien() {
        int choice;
        while (true) {
            System.out.println("CHỌN LOẠI PHƯƠNG TIỆN");
            System.out.println("1. Thêm oto");
            System.out.println("2. Thêm xe máy");
            System.out.println("3. Thêm xe tải");


            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 || choice > 3) {
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại từ 1 đến 4.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập số từ 1 đến 3.");
            }
        }

        System.out.println("Nhập biển kiểm soát");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("CHỌN HÃNG SẢN XUẤT");
        for (int i = 0; i < hangSanXuats.size(); i++) {
            System.out.println((i + 1) + ". " + hangSanXuats.get(i).getTenHangSanXuat() + " (" + hangSanXuats.get(i).getQuocGiaSanXuat() + ")");
        }
        int hangChoice;
        while (true) {
            try {
                hangChoice = Integer.parseInt(scanner.nextLine()) - 1;
                if (hangChoice < 0 || hangChoice >= hangSanXuats.size()) {
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập một số hợp lệ.");
            }
        }
        HangSanXuat hangSanXuat = hangSanXuats.get(hangChoice);
        LocalDate namSanSuat = LocalDate.now();
        System.out.println("NHẬP TÊN CHỦ SỞ HỮU");
        String chuSoHuu = scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println("NHẬP KIỂU XE");
                String kieuXe = scanner.nextLine();

                int choNgoi;
                while (true) {
                    try {
                        System.out.println("NHẬP SỐ CHỖ NGỒI");
                        choNgoi = Integer.parseInt(scanner.nextLine());
                        if (choNgoi <= 0) {
                            System.out.println("Số chỗ ngồi phải lớn hơn 0. Vui lòng nhập lại.");
                            continue;
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Số chỗ ngồi không hợp lệ. Vui lòng nhập một số hợp lệ.");
                    }
                }
                Oto oto = new Oto(bienKiemSoat, hangSanXuat.getTenHangSanXuat(), namSanSuat, chuSoHuu, choNgoi, kieuXe);
                otos.add(oto);
                writeOtosToFile();
                break;

            case 2:
                double congSuat;
                while (true) {
                    try {
                        System.out.println("NHẬP CÔNG SUẤT");
                        congSuat = Double.parseDouble(scanner.nextLine());
                        if (congSuat <= 0) {
                            System.out.println("Công suất phải lớn hơn 0. Vui lòng nhập lại.");
                            continue;
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Công suất không hợp lệ. Vui lòng nhập một số hợp lệ.");
                    }
                }
                XeMay xeMay = new XeMay(bienKiemSoat, hangSanXuat.getTenHangSanXuat(), namSanSuat, chuSoHuu, congSuat);
                xeMays.add(xeMay);
                writeXeMaysToFile();
                break;
            case 3:
                double taiTrong;
                while (true) {
                    try {
                        System.out.println("NHẬP TRỌNG TẢI");
                        taiTrong = Double.parseDouble(scanner.nextLine());
                        if (taiTrong <= 0) {
                            System.out.println("Trọng tải phải lớn hơn 0. Vui lòng nhập lại.");
                            continue;
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Trọng tải không hợp lệ. Vui lòng nhập một số hợp lệ.");

                    }

                }

                XeTai xeTai = new XeTai(bienKiemSoat, hangSanXuat.getTenHangSanXuat(), namSanSuat, chuSoHuu, taiTrong);
                xeTais.add(xeTai);
                writeXeTaisToFile();
                break;


        }
    }

    public static void hienThiPhuongTien() {
        System.out.println("CHỌN LOẠI PHƯƠNG TIỆN CẦN XEM");
        System.out.println("1: Hiển thị ô tô");
        System.out.println("2: Hiển thị xe máy");
        System.out.println("3: Hiển thị xe tải");
        int choice = Integer.parseInt(scanner.next());
        switch (choice) {
            case 1:
                if (otos.isEmpty()) {
                    System.out.println("DANH SÁCH TRỐNG");
                } else {
                    System.out.println("DANH SÁCH Ô TÔ");
                    for (Oto oto : otos) {
                        System.out.println(oto);
                    }
                }
                break;
            case 2:
                if (xeMays.isEmpty()) {
                    System.out.println("DANH SÁCH TRỐNG");
                } else {
                    System.out.println("DANH SÁCH XE MÁY");
                    for (XeMay xeMay : xeMays) {
                        System.out.println(xeMay);
                    }
                }
                break;
            case 3:
                if (xeTais.isEmpty()) {
                    System.out.println("DANH SÁCH TRỐNG");
                } else {
                    System.out.println("DANH SÁCH XE TẢI");
                    for (XeTai xeTai : xeTais) {
                        System.out.println(xeTai);
                    }
                }
                break;
            default:
                System.out.println("LỰA CHỌN CỦA BẠN KHÔNG PHÙ HỢP");
                break;
        }
    }

    public static void xoaPhuongTien() {
        System.out.println("Nhập biển kiểm soát mà bạn muốn xóa");
        String bienKiemSoat = scanner.next();
        boolean found = false;

        found = removePhuongTienFromList(bienKiemSoat, otos) ||
                removePhuongTienFromList(bienKiemSoat, xeMays) ||
                removePhuongTienFromList(bienKiemSoat, xeTais);

        if (found) {
            System.out.println("BẠN CÓ CHẮC LÀ MUỐN XOÁ? (yes/no)");
            String confirm = scanner.next().trim().toLowerCase();
            if (confirm.equals("yes")) {
                System.out.println("ĐÃ XOÁ THÀNH CÔNG");
                writeOtosToFile();
                writeXeMaysToFile();
                writeXeTaisToFile();
            } else {
                System.out.println("HUỶ THAO TÁC XOÁ");
            }
        } else {
            System.out.println("KHÔNG TÌM THẤY PHƯƠNG TIỆN");
        }
    }

    private static boolean removePhuongTienFromList(String bienKiemSoat, List<? extends PhuongTien> list) {
        return list.removeIf(pt -> pt.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat));
    }

    public static void timKiemPhuongTien() {
        System.out.println("NHẬP BIỂN KIỂM SOÁT ĐỂ TÌM KIẾM");
        String bienKiemSoat = scanner.next();
        boolean found = false;
        System.out.println("DANH SÁCH PHƯƠNG TIỆN TÌM THẤY LÀ");

        found = searchInList(bienKiemSoat, otos) ||
                searchInList(bienKiemSoat, xeMays) ||
                searchInList(bienKiemSoat, xeTais);

        if (!found) {
            System.out.println("KHÔNG TÌM THẤY PHƯƠNG TIỆN NÀO");
        }
    }

    private static boolean searchInList(String bienKiemSoat, List<? extends PhuongTien> list) {
        boolean found = false;
        for (PhuongTien pt : list) {
            if (pt.getBienKiemSoat().toLowerCase().contains(bienKiemSoat.toLowerCase())) {
                System.out.println(pt);
                found = true;
            }
        }
        return found;
    }

    public static void writeOtosToFile() {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(OTOS_FILE)))) {
            for (Oto oto : otos) {
                writer.println(oto.toFileString());
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void writeXeMaysToFile() {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(XEMAYS_FILE)))) {
            for (XeMay xeMay : xeMays) {
                writer.println(xeMay.toFileString());
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void writeXeTaisToFile() {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(XETAIS_FILE)))) {
            for (XeTai xeTai : xeTais) {
                writer.println(xeTai.toFileString());
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void writeHangSanXuatsToFile() {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(HANGSANXUATS_FILE)))) {
            for (HangSanXuat hangSanXuat : hangSanXuats) {
                writer.println(hangSanXuat.toFileString());
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void readOtosFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(OTOS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Oto oto = Oto.fromFileString(line);
                otos.add(oto);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    public static void readXeMaysFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(XEMAYS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                XeMay xeMay = XeMay.fromFileString(line);
                xeMays.add(xeMay);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    public static void readXeTaisFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(XETAIS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                XeTai xeTai = XeTai.fromFileString(line);
                xeTais.add(xeTai);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    public static void readHangSanXuatsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(HANGSANXUATS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                HangSanXuat hangSanXuat = HangSanXuat.fromFileString(line);
                hangSanXuats.add(hangSanXuat);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
    public static void chinhSuaPhuongTien() {
        int choice;
        while (true) {
            System.out.println("CHỌN LOẠI PHƯƠNG TIỆN MUỐN SỬA");
            System.out.println("1. SỬA OTO");
            System.out.println("2. SỬA XE MÁY");
            System.out.println("3. SỬA XE TẢI");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 || choice > 3) {
                    System.out.println("LỰA CHỌN KHÔNG HỢP LỆ. VUI LÒNG CHỌN LẠI.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("LỰA CHỌN KHÔNG HỢP LỆ. VUI LÒNG NHẬP SỐ TỪ 1 ĐẾN 3.");
            }
        }

        System.out.println("NHẬP BIỂN KIỂM SOÁT CỦA PHƯƠNG TIỆN CẦN SỬA");
        String bienKiemSoat = scanner.nextLine();
        PhuongTien pt = findPhuongTienByBienKiemSoat(bienKiemSoat);

        if (pt == null) {
            System.out.println("KHÔNG TÌM THẤY PHƯƠNG TIỆN VỚI BIỂN KIỂM SOÁT NÀY.");
            return;
        }

        System.out.println("CHỌN LẠI HÃNG SẢN XUẤT");
        for (int i = 0; i < hangSanXuats.size(); i++) {
            System.out.println((i + 1) + ". " + hangSanXuats.get(i).getTenHangSanXuat() + " (" + hangSanXuats.get(i).getQuocGiaSanXuat() + ")");
        }
        int hangChoice;
        while (true) {
            try {
                hangChoice = Integer.parseInt(scanner.nextLine()) - 1;
                if (hangChoice < 0 || hangChoice >= hangSanXuats.size()) {
                    System.out.println("LỰA CHỌN KHÔNG HỢP LỆ. VUI LÒNG CHỌN LẠI.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("LỰA CHỌN KHÔNG HỢP LỆ. VUI LÒNG NHẬP MỘT SỐ HỢP LỆ.");
            }
        }
        HangSanXuat hangSanXuat = hangSanXuats.get(hangChoice);
        LocalDate namSanXuat = LocalDate.now();
        System.out.println("NHẬP TÊN CHỦ SỞ HỮU:");
        String chuSoHuu = scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("NHẬP KIỂU XE:");
                String kieuXe = scanner.nextLine();

                int choNgoi;
                while (true) {
                    try {
                        System.out.println("NHẬP SỐ CHỖ NGỒI:");
                        choNgoi = Integer.parseInt(scanner.nextLine());
                        if (choNgoi <= 0) {
                            System.out.println("SỐ CHỖ NGỒI PHẢI LỚN HƠN 0. VUI LÒNG NHẬP LẠI.");
                            continue;
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("SỐ CHỖ NGỒI KHÔNG HỢP LỆ. VUI LÒNG NHẬP MỘT SỐ HỢP LỆ.");
                    }
                }

                Oto updatedOto = new Oto(bienKiemSoat, hangSanXuat.getTenHangSanXuat(), namSanXuat, chuSoHuu, choNgoi, kieuXe);
                replacePhuongTienInList(updatedOto);
                writeOtosToFile();
                break;

            case 2:
                double congSuat;
                while (true) {
                    try {
                        System.out.println("NHẬP CÔNG SUẤT:");
                        congSuat = Double.parseDouble(scanner.nextLine());
                        if (congSuat <= 0) {
                            System.out.println("CÔNG SUẤT PHẢI LỚN HƠN 0. VUI LÒNG NHẬP LẠI.");
                            continue;
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("CÔNG SUẤT KHÔNG HỢP LỆ. VUI LÒNG NHẬP MỘT SỐ HỢP LỆ.");
                    }
                }

                XeMay updatedXeMay = new XeMay(bienKiemSoat, hangSanXuat.getTenHangSanXuat(), namSanXuat, chuSoHuu, congSuat);
                replacePhuongTienInList(updatedXeMay);
                writeXeMaysToFile();
                break;

            case 3:
                double taiTrong;
                while (true) {
                    try {
                        System.out.println("NHẬP TRỌNG TẢI:");
                        taiTrong = Double.parseDouble(scanner.nextLine());
                        if (taiTrong <= 0) {
                            System.out.println("TRỌNG TẢI PHẢI LỚN HƠN 0. VUI LÒNG NHẬP LẠI.");
                            continue;
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("TRỌNG TẢI KHÔNG HỢP LỆ. VUI LÒNG NHẬP MỘT SỐ HỢP LỆ.");
                    }
                }

                XeTai updatedXeTai = new XeTai(bienKiemSoat, hangSanXuat.getTenHangSanXuat(), namSanXuat, chuSoHuu, taiTrong);
                replacePhuongTienInList(updatedXeTai);
                writeXeTaisToFile();
                break;
        }

        System.out.println("ĐÃ CẬP NHẬT THÔNG TIN PHƯƠNG TIỆN THÀNH CÔNG.");
    }

    private static PhuongTien findPhuongTienByBienKiemSoat(String bienKiemSoat) {
        for (PhuongTien pt : otos) {
            if (pt.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat)) {
                return pt;
            }
        }
        for (PhuongTien pt : xeMays) {
            if (pt.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat)) {
                return pt;
            }
        }
        for (PhuongTien pt : xeTais) {
            if (pt.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat)) {
                return pt;
            }
        }
        return null;
    }

    private static void replacePhuongTienInList(PhuongTien updatedPt) {
        if (updatedPt instanceof Oto) {
            otos.removeIf(pt -> pt.getBienKiemSoat().equals(updatedPt.getBienKiemSoat()));
            otos.add((Oto) updatedPt);
        } else if (updatedPt instanceof XeMay) {
            xeMays.removeIf(pt -> pt.getBienKiemSoat().equals(updatedPt.getBienKiemSoat()));
            xeMays.add((XeMay) updatedPt);
        } else if (updatedPt instanceof XeTai) {
            xeTais.removeIf(pt -> pt.getBienKiemSoat().equals(updatedPt.getBienKiemSoat()));
            xeTais.add((XeTai) updatedPt);
        }
    }

}
