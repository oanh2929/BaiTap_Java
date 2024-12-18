package OnTap_4;

public class Sach {
    private int id;
    private String tenSach;
    private String tacGia;
    private int soLuongSach;
    private int soLuongDaMuon;

    public Sach(int id,String tenSach, String tacGia,int soLuongSach) {
        this.id = id;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.soLuongSach = soLuongSach;
        this.soLuongDaMuon = 0; //mặc định
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getSoLuongSach() {
        return soLuongSach;
    }

    public void setSoLuongSach(int soLuongSach) {
        this.soLuongSach = soLuongSach;
    }


    public int getSoLuongDaMuon() {
        return soLuongDaMuon;
    }

    public void setSoLuongDaMuon(int soLuongDaMuon) {
        this.soLuongDaMuon = soLuongDaMuon;
    }


    public void capNhatSoLuongMuon(int soLuongConLai) {
        if (soLuongDaMuon + soLuongConLai <= soLuongSach) {
            soLuongDaMuon += soLuongConLai;
        } else {
            System.out.println("Không đủ sách để mượn.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Sach{"+"id="+id+",Tên sách: "+tenSach+", Tác giả:"+tacGia+",soLuongConLai="+(soLuongSach-soLuongDaMuon)+",Tổng số lượng: "+soLuongSach+'}';
    }
}
