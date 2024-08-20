package thu_vien.repository;

import thu_vien.model.ThuVien;

import java.util.List;

public interface ThuVienRepo<T extends ThuVien> {
    void add(T thuVien);
    List<ThuVien> getAll();

    T timKiemTrongThuVien(String maTaiLieu);
}
