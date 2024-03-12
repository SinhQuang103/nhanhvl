package BTcanbo;

public class NhanVien extends CanBo{
    private String congviec;

    public NhanVien(String hoten, int tuoi, String gioitinh, String congviec) {
        super(hoten, tuoi, gioitinh);
        this.congviec = congviec;
    }

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "congviec='" + congviec + '\'' +
                '}';
    }
}
