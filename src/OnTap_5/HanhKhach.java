package OnTap_5;

public class HanhKhach {
    private String id;
    private String tenHanhKhach;
    private int namSinh;
    private String soHoChieu;
    private String idhangBay;
    private String maTheThanhVien;
    private double soDamBayTichLuy;
    private char hangTheThanhVien;
    private String diaChi;
    private  static int soVeToiDa=5;

    public HanhKhach(String id, String ten, int namSinh, String soHoChieu){
        this.id=id;
        this.tenHanhKhach=ten;
        this.namSinh=namSinh;
        this.soHoChieu=soHoChieu;
        this.soDamBayTichLuy=0;
        this.hangTheThanhVien='B';

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
}
