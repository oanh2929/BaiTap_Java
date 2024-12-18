package OnTap_2;

public class Nguoi implements Printable {
    protected String hoTen;
    protected String soDienThoai;
    protected String soCanCuoc;

    public Nguoi(String hoTen, String soDienThoai, String soCanCuoc){
        this.hoTen=hoTen;
        this.soDienThoai=soDienThoai;
        this.soCanCuoc=soCanCuoc;
    }

    public String getHoTen(){
        return hoTen;
    }

    public void setHoTen(String hoTen){
        this.hoTen=hoTen;
    }

    public String getSoDienThoai(){
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai){
        this.soDienThoai=soDienThoai;
    }

    public String getSoCanCuoc(){
        return soCanCuoc;
    }

    public void setSoCanCuoc(String soCanCuoc){
        this.soCanCuoc=soCanCuoc;
    }

    public void print(){
        System.out.println("Họ tên: "+hoTen);
        System.out.println("Số điện thoại: "+soDienThoai);
        System.out.println("Số căn cước: "+ soCanCuoc);
    }
}
