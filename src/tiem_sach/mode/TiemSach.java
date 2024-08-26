package tiem_sach.mode;

import java.time.LocalDate;

public abstract class TiemSach {
    private String maTaiLieu;
    private String tieuDe;
    private String nhaXuatBan;
    private LocalDate namXuatBanDate;
    public TiemSach(String maTaiLieu, String tieuDe, String nhaXuatBan, LocalDate namXuatBanDate) {
        this.maTaiLieu = maTaiLieu;
        this.tieuDe = tieuDe;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBanDate = namXuatBanDate;

    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public LocalDate getNamXuatBanDate() {
        return namXuatBanDate;
    }

    public void setNamXuatBanDate(LocalDate namXuatBanDate) {
        this.namXuatBanDate = namXuatBanDate;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    @Override
    public String toString() {
        return "TiemSach{" +
                "maTaiLieu='" + maTaiLieu + '\'' +
                ", tieuDe='" + tieuDe + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", namXuatBanDate=" + namXuatBanDate +
                '}';
    }

    public String convertToLine() {
        return "";
    }


}
