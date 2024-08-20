package quan_ly_phuong_tien.model;

import java.time.LocalDate;

public class Oto extends PhuongTien {
    private int choNgoi;
    private String kieuXe;

    public Oto(String bienKiemSoat, String hangSanXuat, LocalDate namSanSuat, String chuSoHuu, int choNgoi, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, namSanSuat, chuSoHuu);
        this.choNgoi = choNgoi;
        this.kieuXe = kieuXe;
    }

    public int getChoNgoi() {
        return choNgoi;
    }

    public void setChoNgoi(int choNgoi) {
        this.choNgoi = choNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toFileString() {
        return getBienKiemSoat() + "," + getHangSanXuat() + "," + getNamSanSuat() + "," + getTenChuSoHuu() + "," + choNgoi + "," + kieuXe;
    }

    public static Oto fromFileString(String line) {
        String[] parts = line.split(",");
        return new Oto(parts[0], parts[1], LocalDate.parse(parts[2]), parts[3], Integer.parseInt(parts[4]), parts[5]);
    }

    @Override
    public String toString() {
        return "Oto{" +
                "bienKiemSoat='" + getBienKiemSoat() + '\'' +
                ", hangSanXuat='" + getHangSanXuat() + '\'' +
                ", namSanSuat=" + getNamSanSuat() +
                ", chuSoHuu='" + getTenChuSoHuu() + '\'' +
                ", choNgoi=" + choNgoi +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
