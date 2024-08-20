package thu_vien.repository;

import thu_vien.model.Sach;
import thu_vien.model.ThuVien;

import java.util.ArrayList;
import java.util.List;

public class SachRepo implements ThuVienRepo<Sach>{
    private final List<Sach> sachList;

    public SachRepo(List<Sach> sachList) {
        this.sachList = sachList;
    }

    @Override
    public void add(Sach thuVien) {
        sachList.add(thuVien);

    }

    @Override
    public List<ThuVien> getAll() {
        return new ArrayList<ThuVien>(sachList);
    }

    @Override
    public Sach timKiemTrongThuVien(String maTaiLieu) {
        return sachList.get(sachList.indexOf(maTaiLieu));
    }
}
