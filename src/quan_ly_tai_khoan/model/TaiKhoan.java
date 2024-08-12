package quan_ly_tai_khoan.model;

import java.time.LocalDate;

public class TaiKhoan {
    private int idTaiKhoan;
    private String maTaiKhoan;
    private String tenTaiKhoan;
    private LocalDate ngayTaoTaiKhoan;

    public TaiKhoan(int idTaiKhoan, String maTaiKhoan, String tenTaiKhoan, LocalDate ngayTaoTaiKhoan) {
        this.idTaiKhoan = idTaiKhoan;
        this.maTaiKhoan = maTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }


    public int getIdTaiKhoan() {
        return idTaiKhoan;
    }

    public void setIdTaiKhoan(int idTaiKhoan) {
        this.idTaiKhoan = idTaiKhoan;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public LocalDate getNgayTaoTaiKhoan() {
        return ngayTaoTaiKhoan;
    }

    public void setNgayTaoTaiKhoan(LocalDate ngayTaoTaiKhoan) {
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "idTaiKhoan=" + idTaiKhoan +
                ", maTaiKhoan='" + maTaiKhoan + '\'' +
                ", tenTaiKhoan='" + tenTaiKhoan + '\'' +
                ", ngayTaoTaiKhoan=" + ngayTaoTaiKhoan +
                '}';
    }

    public String toCsvString() {
        return idTaiKhoan + "," +
                maTaiKhoan + "," +
                tenTaiKhoan + "," +
                ngayTaoTaiKhoan;
    }

}
