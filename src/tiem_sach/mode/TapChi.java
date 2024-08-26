package tiem_sach.mode;

import java.time.LocalDate;

public class TapChi extends TiemSach{
    private String chuDe;

    public TapChi(String maTaiLieu, String tieuDe, String nhaXuatBan, LocalDate namXuatBanDate, String chuDe) {
        super(maTaiLieu, tieuDe, nhaXuatBan, namXuatBanDate);
        this.chuDe = chuDe;
    }
    public String getChuDe() {
        return chuDe;
    }
    public void setChuDe(String chuDe) {
        this.chuDe = chuDe;
    }

    @Override
    public String toString() {
        return super.toString()+"TapChi{" +
                "chuDe='" + chuDe + '\'' +
                '}';
    }

    public String toCsvString() {
        return String.join(",",
                getMaTaiLieu(),
                getChuDe(),
                getNhaXuatBan(),
                getNamXuatBanDate().toString(),
                chuDe
        );
}}
