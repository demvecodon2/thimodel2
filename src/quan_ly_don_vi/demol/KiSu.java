package quan_ly_don_vi.demol;

import java.time.LocalDate;

public class KiSu extends CanBo{
    private String nganhDaoTao;

    public KiSu(String hoTen, LocalDate namSinh, String gioiTinh, String diaChi,String nganhDaoTao) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }
    public String getNganhDaoTao() {
        return nganhDaoTao;
    }
    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
    @Override
    public String toString() {
        return super.toString() + "nganhDaoTao=" + nganhDaoTao;
    }
}
