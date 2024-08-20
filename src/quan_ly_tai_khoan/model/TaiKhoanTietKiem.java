package quan_ly_tai_khoan.model;

import java.time.LocalDate;

public class TaiKhoanTietKiem extends TaiKhoan {
    private double soTien;
    private LocalDate ngayGuiTietKiem;
    private String laiSuat;
    private String kiHan;
    public TaiKhoanTietKiem(String idTaiKhoan,String maTaiKhoan,String tenTaiKhoan,LocalDate ngayTaoTaiKhoan,String soTien, LocalDate ngayGuiTietKiem, String laiSuat, String kiHan) {
        super(Integer.parseInt(idTaiKhoan),maTaiKhoan,tenTaiKhoan,ngayTaoTaiKhoan);
        this.soTien = Double.parseDouble(soTien);
        this.ngayGuiTietKiem = ngayGuiTietKiem;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;


    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public LocalDate getNgayGuiTietKiem() {
        return ngayGuiTietKiem;
    }

    public void setNgayGuiTietKiem(LocalDate ngayGuiTietKiem) {
        this.ngayGuiTietKiem = ngayGuiTietKiem;
    }

    public String getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(String laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getKiHan() {
        return kiHan;
    }

    public void setKiHan(String kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return "TaiKhoanTietKiem{" +
                "id=" + getIdTaiKhoan() +
                "maTaiKhoan=" + getMaTaiKhoan() +
                "tenTaiKhoan=" + getTenTaiKhoan() +
                "ngayTaoTaiKhoan+"+getNgayTaoTaiKhoan()+
                "soTien=" + soTien +
                ", ngayGuiTietKiem=" + ngayGuiTietKiem +
                ", laiSuat='" + laiSuat + '\'' +
                ", kiHan='" + kiHan + '\'' +
                '}';
    }
}
