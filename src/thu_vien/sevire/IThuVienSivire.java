package thu_vien.sevire;

import thu_vien.model.Sach;
import thu_vien.model.ThuVien;

import java.util.List;

public interface IThuVienSivire <T extends ThuVien >{
    void add(T thuVien);
    List<ThuVien> getAll();
    T timKiemTrongThuVien(String maTaiLieu);

}
