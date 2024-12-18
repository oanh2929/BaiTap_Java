package OnTap_1;

public class Nguoi implements Printable{
    protected String hoTen;
    protected String soDienThoai;
    protected String email;

    public Nguoi(String hoTen,String soDienThoai,String email){
        this.hoTen=hoTen;
        this.soDienThoai=soDienThoai;
        this.email=email;
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

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void print() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Số điện thoại: "+soDienThoai);
        System.out.println("Email: "+email);
    }


}
