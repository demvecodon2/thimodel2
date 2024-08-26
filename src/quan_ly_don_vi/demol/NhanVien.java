package quan_ly_don_vi.demol;

import java.time.LocalDate;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String hoTen, LocalDate namSinh, String gioiTinh, String diaChi,String congViec) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }
    public String getCongViec() {
        return congViec;
    }
    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    @Override
    public String toString() {
        return STR."\{super.toString()}NhanVien [congViec=\{congViec}]";
    }
}

