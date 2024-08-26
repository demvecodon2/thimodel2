package quan_ly_ngan_hang.demo;

import java.time.LocalDate;

public class KhachHang extends TaiKhoanNH{
    private String diaChi;
    private String soDienThoai;
    private String emailKhachHang;
    private LocalDate ngaySinhKhachHang;
    public KhachHang(long soTaiKhoan, String tenTaiKhoan, double soTienTrongTk,String diaChi, String soDienThoai, String emailKhachHang) {
        super(soTaiKhoan, tenTaiKhoan, soTienTrongTk);
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.emailKhachHang = emailKhachHang;
        this.ngaySinhKhachHang = LocalDate.now();
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getSoDienThoai() {
        return soDienThoai;
    }
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public String getEmailKhachHang() {
        return emailKhachHang;
    }
    public void setEmailKhachHang(String emailKhachHang) {
        this.emailKhachHang = emailKhachHang;
    }
    public LocalDate getNgaySinhKhachHang() {
        return ngaySinhKhachHang;
    }
    @Override
    public String toString() {
        return super.toString()+"địa chỉ khách hàng:"+diaChi+"số điện thoại khách hàng"+"email của khách "+ soDienThoai+
                "ngày sinh của khách"+ emailKhachHang;
    }

}
