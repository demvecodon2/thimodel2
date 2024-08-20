package quan_ly_phuong_tien.sevire.oto;

import quan_ly_phuong_tien.model.Oto;

import java.util.List;

public interface IOto {
    void themOto(Oto oto);
    void xoaOto(String bienKiemSoat);
    List<Oto> hienThiOto();
    Oto timKiemOto(String bienKiemSoat);
    void chinhSuaPhuongTien(String bienKiemSoat);

}
