package quan_ly_phuong_tien.model;

import java.time.LocalDate;

public abstract class PhuongTien {
    private  String bienKiemSoat;
    private String hangSanXuat;
    private LocalDate namSanSuat;
    private String tenChuSoHuu;
    public PhuongTien(String bienKiemSoat, String hangSanXuat,LocalDate namSanSuat, String tenChuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.namSanSuat = namSanSuat;
        this.tenChuSoHuu = tenChuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public LocalDate getNamSanSuat() {
        return namSanSuat;
    }

    public void setNamSanSuat(LocalDate namSanSuat) {
        this.namSanSuat = namSanSuat;
    }

    public String getTenChuSoHuu() {
        return tenChuSoHuu;
    }

    public void setTenChuSoHuu(String tenChuSoHuu) {
        this.tenChuSoHuu = tenChuSoHuu;
    }

    public abstract String toFileString();

    @Override
    public String toString() {
        return "PhuongTien{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHang='" + hangSanXuat + '\'' +
                ", namSanSuat=" + namSanSuat +
                ", tenChuSoHuu='" + tenChuSoHuu + '\'' +
                '}';
    }
}
