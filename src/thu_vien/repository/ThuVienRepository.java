package thu_vien.repository;

import thu_vien.model.ThuVien;

import java.util.ArrayList;
import java.util.List;

public  abstract class ThuVienRepository<T extends ThuVien >implements ThuVienRepo<T> {
    protected List<T> thuViens;

    @Override
    public void add(T thuVien) {
        thuViens.add(thuVien);
    }

    @Override
    public List getAll() {
        return new ArrayList(thuViens);
    }

    @Override
    public T timKiemTrongThuVien(String maTaiLieu) {
        for (T thuVien : thuViens) {
            if (thuVien.getMaTaiLieu().equalsIgnoreCase(maTaiLieu)) {
                return thuVien;
            }
        }
        return null;
    }


}
