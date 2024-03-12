package BTcanbo;

public class KySu extends CanBo{
    private String nganhdaotao;

    public KySu(String hoten, int tuoi, String gioitinh, String nganhdaotao) {
        super(hoten, tuoi, gioitinh);
        this.nganhdaotao = nganhdaotao;
    }

    public String getNganhdaotao() {
        return nganhdaotao;
    }

    public void setNganhdaotao(String nganhdaotao) {
        this.nganhdaotao = nganhdaotao;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "nganhdaotao='" + nganhdaotao + '\'' +
                '}';
    }
}
