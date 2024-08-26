package tiem_sach.mode;

import java.time.LocalDate;

public class Sach extends TiemSach {
    private String tacGia;
    private double soTrang;
    private String theLoai;

    public Sach(String maTaiLieu, String tieuDe, String nhaXuatBan, LocalDate namXuatBanDate,String tacGia, double soTrang, String theLoai) {
        super(maTaiLieu, tieuDe, nhaXuatBan, namXuatBanDate);
        this.tacGia = tacGia;
        this.soTrang = soTrang;
        this.theLoai = theLoai;
    }


    public static boolean remove(String maTaiLieu) {
        return false;
    }


    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    public double isSoTrang() {
        return soTrang;
    }
    public void setSoTrang(double soTrang) {
        this.soTrang = soTrang;
    }
    public String getTheLoai() {
        return theLoai;
    }
    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    @Override
    public String toString() {
        return super.toString()+"Sach{" +
                "tacGia='" + tacGia + '\'' +
                ", soTrang=" + soTrang +
                ", theLoai='" + theLoai + '\'' +
                '}';

    }


    public String toCsvString() {
        return String.join(",",
                getMaTaiLieu(),
                getTieuDe(),
                getNhaXuatBan(),
                getNamXuatBanDate().toString(),
                tacGia,
                String.valueOf(soTrang),
                theLoai
        );
    }
}
