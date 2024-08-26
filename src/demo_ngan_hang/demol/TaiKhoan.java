package demo_ngan_hang.demol;

public class TaiKhoan {
    private static final double LAI_SUAT = 0.035;
    private long soTaiKhoan;
    private String tenTaiKhoan;
    private double soTienTrongTk;

    public TaiKhoan() {
        this.soTaiKhoan = 0;
        this.tenTaiKhoan = "";
        this.soTienTrongTk = 50; // Default balance
    }

    public TaiKhoan(long soTaiKhoan, String tenTaiKhoan, double soTienTrongTk) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTienTrongTk = soTienTrongTk > 0 ? soTienTrongTk : 50;
    }

    public TaiKhoan(long soTaiKhoan, String tenTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTienTrongTk = 50;
    }

    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public double getSoTienTrongTk() {
        return soTienTrongTk;
    }

    public void setSoTienTrongTk(double soTienTrongTk) {
        this.soTienTrongTk = soTienTrongTk > 0 ? soTienTrongTk : 50; // Ensure balance is not negative
    }

    public void guiTien(double soTien) {
        if (soTien > 0) {
            this.soTienTrongTk += soTien;
        } else {
            System.out.println("SỐ TIỀN NỘP VÀO PHẢI LỚN HƠN 0.");
        }
    }

    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= this.soTienTrongTk) {
            this.soTienTrongTk -= soTien;
        } else {
            System.out.println("SỐ TIỀN RÚT KHÔNG HỢP LỆ HOẶC KHÔNG ĐỦ SỐ DƯ.");
        }
    }

    public void laiSuatTichLuy() {
        this.soTienTrongTk += this.soTienTrongTk * LAI_SUAT;
    }

    public void chuyenKhoan(demo_ngan_hang.demol.TaiKhoan denTaiKhoan, double soTien) {
        if (denTaiKhoan != null && soTien > 0 && soTien <= this.soTienTrongTk) {
            this.rutTien(soTien);
            denTaiKhoan.guiTien(soTien);
        } else {
            System.out.println("SỐ TIỀN CHUYỂN KHOẢN KHÔNG HỢP LỆ HOẶC KHÔNG ĐỦ.");
        }
    }
    public void nopTien(double soTienNop) {
        if (soTienNop > 0) {
            this.soTienTrongTk += soTienNop;
        } else {
            System.out.println("SỐ TIỀN NẠP VÀO PHẢI LỚN HƠN 0.");
        }
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "soTaiKhoan=" + soTaiKhoan +
                ", tenTaiKhoan='" + tenTaiKhoan + '\'' +
                ", soTienTrongTk=" + soTienTrongTk +
                '}';
    }


}
