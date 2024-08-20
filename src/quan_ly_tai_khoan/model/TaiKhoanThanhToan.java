package quan_ly_tai_khoan.model;

import java.time.LocalDate;

public class TaiKhoanThanhToan extends TaiKhoan {
    private String soThe;
    private double soTienTrongTaiKhoan;

    public TaiKhoanThanhToan(int idTaiKhoan, String maTaiKhoan, String tenTaiKhoan, LocalDate ngayTaoTaiKhoan) {
        super(idTaiKhoan, maTaiKhoan, tenTaiKhoan, ngayTaoTaiKhoan);
    }

    public TaiKhoanThanhToan(int id, String maTaiKhoan, String tenTaiKhoan, LocalDate ngayMo, String soThe, double soTienTrongTaiKhoan) {
        super(id,maTaiKhoan,tenTaiKhoan,ngayMo);
        this.soThe = soThe;
        this.soTienTrongTaiKhoan=soTienTrongTaiKhoan;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public double getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(String soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = Double.parseDouble(soTienTrongTaiKhoan);
    }

    @Override
    public String toString() {
        return "TaiKhoanThanhToan{" +
                "id=" + getIdTaiKhoan() +
                "maTaiKhoan=" + getMaTaiKhoan() +
                "tenTaiKhoan=" + getTenTaiKhoan() +
                "ngayTaoTaiKhoan+"+getNgayTaoTaiKhoan()+
                "soThe='" + soThe + '\'' +
                ", soTienTrongTaiKhoan='" + soTienTrongTaiKhoan + '\'' +
                '}';
    }
}
