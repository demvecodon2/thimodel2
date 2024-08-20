package quan_ly_phuong_tien.repository;

import quan_ly_phuong_tien.model.PhuongTien;

import java.util.List;

public interface IPhuongTienRepository  <T extends PhuongTien> {
    void add(T phuongTien);
    void remove(String bienKiemSoat);
    T timKiemPhuongTien(String bienKiemSoat);
    List<T> getAll();



}
