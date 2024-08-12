package quan_ly_tai_khoan.controller;

import quan_ly_tai_khoan.model.TaiKhoan;
import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class TheQuanLy {
    private static final String FILE_PATH = "src/quan_ly_tai_khoan/the/csv/data_accounts.csv";
    private final List<TaiKhoan> taiKhoanList;
    private final Scanner scanner;

    public TheQuanLy() {
        taiKhoanList = new ArrayList<>();
        scanner = new Scanner(System.in);
        loadTaiKhoan();
    }

    public void add() {
        try {
            int id = idLast() + 1;

            System.out.print("Nhập mã tài khoản: ");
            String maTaiKhoan = scanner.nextLine();

            System.out.print("Nhập tên chủ tài khoản: ");
            String tenTaiKhoan = scanner.nextLine();

            System.out.print("ngày mở tài khoản đã tự điền: ");
            LocalDate ngayMo = LocalDate.now();

            TaiKhoan taiKhoan = new TaiKhoan(id, maTaiKhoan, tenTaiKhoan, ngayMo);
            taiKhoanList.add(taiKhoan);
            saveTaiKhoan();
            System.out.println("Thêm tài khoản thành công.");
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    private int idLast() {
        if (taiKhoanList.isEmpty()) {
            return 0;
        }
        return taiKhoanList.getLast().getIdTaiKhoan();
    }

    public void delete() {
        try {
            System.out.print("Nhập mã tài khoản cần xóa: ");
            String maTaiKhoan = scanner.nextLine();

            TaiKhoan taiKhoanToDelete = taiKhoanList.stream()
                    .filter(tk -> tk.getMaTaiKhoan().equals(maTaiKhoan))
                    .findFirst()
                    .orElse(null);

            if (taiKhoanToDelete != null) {
                taiKhoanList.remove(taiKhoanToDelete);
                saveTaiKhoan();
                System.out.println("Xóa tài khoản thành công.");
            } else {
                System.out.println("Không tìm thấy tài khoản với mã: " + maTaiKhoan);
            }
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public void hienThiThe() {
        if (taiKhoanList.isEmpty()) {
            System.out.println("Danh sách tài khoản trống.");
        } else {
            taiKhoanList.forEach(System.out::println);
        }
    }

    public void searchById() {
        try {
            System.out.print("Nhập ID tài khoản cần tìm: ");
            int idTaiKhoan = Integer.parseInt(scanner.nextLine());

            TaiKhoan taiKhoanFound = taiKhoanList.stream()
                    .filter(tk -> tk.getIdTaiKhoan() == idTaiKhoan)
                    .findFirst()
                    .orElse(null);

            if (taiKhoanFound != null) {
                System.out.println(taiKhoanFound);
            } else {
                System.out.println("Không tìm thấy tài khoản với ID: " + idTaiKhoan);
            }
        } catch (NumberFormatException e) {
            System.out.println("ID không hợp lệ: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    private void loadTaiKhoan() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String maTaiKhoan = data[1];
                String tenTaiKhoan = data[2];
                LocalDate ngayTaoTaiKhoan = LocalDate.parse(data[3]);

                TaiKhoan taiKhoan = new TaiKhoan(id, maTaiKhoan, tenTaiKhoan, ngayTaoTaiKhoan);
                taiKhoanList.add(taiKhoan);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }

    private void saveTaiKhoan() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (TaiKhoan taiKhoan : taiKhoanList) {
                bw.write(taiKhoan.toCsvString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }
}
