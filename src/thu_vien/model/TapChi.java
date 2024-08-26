package thu_vien.model;

import java.time.LocalDate;

public class TapChi extends ThuVien{
    private String soPhatHanh;
    private LocalDate thangPhatHanh;

    public TapChi(String maTaiLieu, String name, int soBanPhatHanh, String soPhatHanh, LocalDate thangPhatHanh) {
        super(maTaiLieu, name, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }
    public String getSoPhatHanh() {
        return soPhatHanh;
    }
    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }
    public LocalDate getThangPhatHanh() {
        return thangPhatHanh;
    }
    public void setThangPhatHanh(LocalDate thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
    @Override
    public String toString() {
        return super.toString()+"tạp chí(số phát hành:"+soPhatHanh+")"+"(tháng phát hành:"+thangPhatHanh+")";
    }
}
