package quan_ly_phuong_tien.model;

import java.time.LocalDate;

public class HangSanXuat {
    private String maHangSanXuat;
    private String tenHangSanXuat;
    private String quocGiaSanXuat;
    public HangSanXuat(String maHangSanXuat,String tenHangSanXuat,String quocGiaSanXuat) {
        this.maHangSanXuat = maHangSanXuat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.quocGiaSanXuat=quocGiaSanXuat;
    }
    public static HangSanXuat fromFileString(String line) {
        String[] split = line.split(",");
        return new HangSanXuat(split[0], split[1], split[2]);
    }


    public String getMaHangSanXuat() {
        return maHangSanXuat;
    }

    public void setMaHangSanXuat(String maHangSanXuat) {
        this.maHangSanXuat = maHangSanXuat;
    }

    public String getQuocGiaSanXuat() {
        return quocGiaSanXuat;
    }

    public void setQuocGiaSanXuat(String quocGiaSanXuat) {
        this.quocGiaSanXuat = quocGiaSanXuat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    @Override
    public String toString() {
        return "HangSanXuat{" +
                "maHangSanXuat='" + maHangSanXuat + '\'' +
                ", tenHangSanXuat='" + tenHangSanXuat + '\'' +
                ", quocGiaSanXuat='" + quocGiaSanXuat + '\'' +
                '}';
    }

    public String toFileString() {
        return maHangSanXuat+","+tenHangSanXuat+","+quocGiaSanXuat;
    }

}
