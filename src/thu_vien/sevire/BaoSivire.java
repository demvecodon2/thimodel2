package thu_vien.sevire;

import thu_vien.model.Bao;
import thu_vien.model.Sach;
import thu_vien.model.ThuVien;

import java.util.ArrayList;
import java.util.List;

public class BaoSivire implements IThuVienSivire<Bao> {
   private final List<Bao> baos = new ArrayList<Bao>();

    @Override
    public void add(Bao thuVien) {
        baos.add(thuVien);


    }

    @Override
    public List<ThuVien> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Bao timKiemTrongThuVien(String maTaiLieu) {
        return baos.get(baos.indexOf(maTaiLieu));
    }


}
