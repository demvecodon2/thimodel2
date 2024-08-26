package quan_ly_don_vi.demol;

import java.time.LocalDate;

public class CongNhan extends CanBo {
    private String bac;
    public CongNhan( String hoTen,LocalDate namSinh,String gioiTinh,String diaChi,String bac) {
        super(hoTen,namSinh,gioiTinh,diaChi);
        this.bac=bac;
    }
    public String getBac() {
        return bac;
    }
    public void setBac(String bac) {
        this.bac = bac;
    }
    @Override
    public String toString() {
        return super.toString()+"CongNhan{" + "bac=" + bac + '}';
    }
}
