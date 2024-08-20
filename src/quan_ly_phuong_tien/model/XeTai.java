package quan_ly_phuong_tien.model;

import java.time.LocalDate;

public class XeTai extends PhuongTien{
    private  double taiTrong;
    public XeTai(String bienKiemSoat, String tenHangSanSuat, LocalDate namSanSuat, String tenChuSoHuu, double taiTrong) {
        super(bienKiemSoat, tenHangSanSuat, LocalDate.now(), tenChuSoHuu);
        this.taiTrong = taiTrong;
    }



    public double getTaiTrong() {
        return taiTrong;
    }
    public void setTaiTrong(double taiTrong) {
        this.taiTrong = taiTrong;
    }
    public static XeTai fromFileString(String line) {
        String[] parts = line.split(",");
        return new XeTai(parts[0],parts[1],LocalDate.parse(parts[2]),parts[3],Double.parseDouble(parts[4]) );
    }


    @Override
    public String toFileString() {
        return getBienKiemSoat()+","+getHangSanXuat()+","+getNamSanSuat()+","+getTenChuSoHuu()+","+getTaiTrong();
    }

    @Override
    public String toString() {
        return super.toString()+"XeTai" +
                "taiTrong='" + taiTrong + '\''
                ;
    }
}
