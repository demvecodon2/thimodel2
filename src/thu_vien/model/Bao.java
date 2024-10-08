package thu_vien.model;

import java.time.LocalDate;

public class Bao extends ThuVien{
    LocalDate ngayPhatHanh;

    public Bao(String maTaiLieu, String name, int soBanPhatHanh, LocalDate ngayPhatHanh) {
        super(maTaiLieu, name, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }


    public LocalDate getNgayPhatHanh() {
        return ngayPhatHanh;
    }
    public void setNgayPhatHanh(LocalDate ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
    @Override
    public String toString() {
        return super.toString()+"báo(ngày phát hành:"+ngayPhatHanh+")";
    }
}
