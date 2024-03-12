package BTcanbo;

public class CanBo {
    private  String hoten;
    private int tuoi;
    private String gioitinh;

    public CanBo(String hoten, int tuoi, String gioitinh) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "hoten='" + hoten + '\'' +
                ", tuoi=" + tuoi +
                ", gioitinh='" + gioitinh + '\'' +
                '}';
    }
}
