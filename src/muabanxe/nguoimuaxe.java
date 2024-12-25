package muabanxe;

public class nguoimuaxe extends nguoi {
    private double sotichdiem;
    private String ngaymua;
    private String tenxemua;

    public nguoimuaxe(String hoten, String sodienthoai, String socancuoc,double sotichdiem, String ngaymua, String tenxemua){
        super(hoten,sodienthoai,socancuoc);
        this.sotichdiem=sotichdiem;
        this.ngaymua=ngaymua;
        this.tenxemua=tenxemua;
    }

    public double getSotichdiem() {
        return sotichdiem;
    }

    public void setSotichdiem(double sotichdiem) {
        this.sotichdiem = sotichdiem;
    }

    public String getNgaymua() {
        return ngaymua;
    }

    public void setNgaymua(String ngaymua) {
        this.ngaymua = ngaymua;
    }

    public String getTenxemua() {
        return tenxemua;
    }

    public void setTenxemua(String tenxemua) {
        this.tenxemua = tenxemua;
    }

    @Override
    public void print() {
        System.out.println("Họ tên:"+hoten);
        System.out.println("Số tích điểm:"+sotichdiem);
        System.out.println("Ngày mua xe:"+ngaymua);
        System.out.println("Tên xe mua:"+tenxemua);
    }
}
