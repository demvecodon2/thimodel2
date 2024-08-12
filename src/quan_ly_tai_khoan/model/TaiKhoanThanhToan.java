package quan_ly_tai_khoan.model;

import java.time.LocalDate;

public class TaiKhoanThanhToan extends TaiKhoan {
    private String soThe;
    private String soTienTrongTaiKhoan;
    public TaiKhoanThanhToan(String idTaiKhoan, String maTaiKhoan, String tenTaiKhoan, LocalDate ngayTaoTaiKhoan ,String soThe, String soTienTrongTaiKhoan) {
        super(Integer.parseInt(idTaiKhoan),maTaiKhoan,tenTaiKhoan,ngayTaoTaiKhoan);
        this.soThe = soThe;
        this.soTienTrongTaiKhoan=soTienTrongTaiKhoan;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public String getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(String soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    @Override
    public String toString() {
        return "TaiKhoanThanhToan{" +
                "soThe='" + soThe + '\'' +
                ", soTienTrongTaiKhoan='" + soTienTrongTaiKhoan + '\'' +
                '}';
    }
}
