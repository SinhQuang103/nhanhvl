package BTcanbo;

public class CongNhan extends CanBo{
    private int capbac;

    public CongNhan(String hoten, int tuoi, String gioitinh, int capbac) {
        super(hoten, tuoi, gioitinh);
        this.capbac = capbac;
    }

    public int getCapbac() {
        return capbac;
    }

    public void setCapbac(int capbac) {
        this.capbac = capbac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "capbac=" + capbac +
                '}';
    }
}
