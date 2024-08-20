package quan_ly_tai_khoan.model;

import java.time.LocalDate;

public abstract class TaiKhoan {
    private int id;
    private String maTaiKhoan;
    private String tenTaiKhoan;
    private LocalDate ngayTaoTaiKhoan;

    public TaiKhoan(int idTaiKhoan, String maTaiKhoan, String tenTaiKhoan, LocalDate ngayTaoTaiKhoan) {
        this.id = idTaiKhoan;
        this.maTaiKhoan = maTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }



    public int getIdTaiKhoan() {
        return id;
    }

    public void setIdTaiKhoan(int idTaiKhoan) {
        this.id = idTaiKhoan;
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
                "idTaiKhoan=" + id +
                ", maTaiKhoan='" + maTaiKhoan + '\'' +
                ", tenTaiKhoan='" + tenTaiKhoan + '\'' +
                ", ngayTaoTaiKhoan=" + ngayTaoTaiKhoan +
                '}';
    }

    public String toCsvString() {
        return id + "," +
                maTaiKhoan + "," +
                tenTaiKhoan + "," +
                ngayTaoTaiKhoan;
    }


}
