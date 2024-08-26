package quan_ly_don_vi.demol;

import java.time.LocalDate;

public abstract class CanBo {
    private String hoTen;
    private LocalDate namSinh;
    private String gioiTinh;
    private String diaChi;
    public CanBo(String hoTen, LocalDate namSinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(LocalDate namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return STR."CanBo{hoTen='\{hoTen}\{'\''}, namSinh=\{namSinh}, gioiTinh='\{gioiTinh}\{'\''}, diaChi='\{diaChi}\{'\''}\{'}'}";
    }
}
