package quan_ly_phuong_tien.model;

import java.time.LocalDate;

public class XeMay extends PhuongTien{

    private double congSuat;
    public XeMay(String bienKiemSoat, String tenHangSanSuat , LocalDate namSanSuat, String tenChuSoHuu, double congSuat) {
        super(bienKiemSoat, tenHangSanSuat, namSanSuat, tenChuSoHuu);
        this.congSuat = congSuat;
    }

    public static XeMay fromFileString(String line) {
        String[] parts = line.split(",");
       return new XeMay(parts[0],parts[1],LocalDate.parse(parts[2]),parts[3],Double.parseDouble(parts[4]));
    }


    public double getCongSuat() {
        return congSuat;
    }
    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toFileString() {
        return getBienKiemSoat()+","+getHangSanXuat()+","+getNamSanSuat()+","+getTenChuSoHuu()+","+getCongSuat();

    }

    @Override
    public String toString() {
        return super.toString()+"XeMay [congSuat=" + congSuat + "]";
    }
}
