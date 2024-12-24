package ThuVienVKU;

public class nguoi {
    protected String hoten;
    protected String sodienthoai;
    protected String email;

    public nguoi(String hoten,String sodienthoai,String email){
        this.hoten=hoten;
        this.sodienthoai=sodienthoai;
        this.email=email;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void print(){
        System.out.println("Họ tên: "+hoten);
        System.out.println("Số điện thoại: "+sodienthoai);
        System.out.println("Email: "+email);
    }
}


