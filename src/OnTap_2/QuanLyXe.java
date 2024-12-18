package OnTap_2;

import OnTap_1.Sach;

import  java.util.*;
import  java.time.LocalDate;
import  java.util.ArrayList;
import  java.util.Comparator;
import  java.util.List;


public class QuanLyXe {
        private List<NguoiMuaXe> danhSachNguoiMua = new ArrayList<>();
        private List<Xe> danhSachXe = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin người mua xe
        public void nhapThongTinNguoiMua(){
            System.out.println("Họ tên: ");
            String hoTen = sc.nextLine();
            System.out.println("Số điện thoại: ");
            String soDienThoai = sc.nextLine();
            System.out.println("Số căn cước công dân: ");
            String soCanCuoc = sc.nextLine();
            System.out.println("Số tích điểm: ");
            double soTichDiem = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập ngày mua: ");
            String ngayMua = sc.nextLine();
            System.out.println("Tên xe mua: ");
            String tenXe = sc.nextLine();
            System.out.println("Giá xe: ");
            double giaXe = Double.parseDouble(sc.nextLine());

            double tienPhaiTra = giaXe-((soTichDiem*10)*giaXe/100);
            double tongTien = tienPhaiTra+tienPhaiTra*0.1;
            double diemMoi = soTichDiem+1;

            danhSachNguoiMua.add(new NguoiMuaXe(hoTen,soDienThoai,soCanCuoc,soTichDiem,ngayMua,tenXe));
            System.out.println("Đã thêm người mua thành công!");
            System.out.println("Tổng tiền phải trả: "+tongTien+"VND");
            System.out.println("Số tích điểm mới: "+diemMoi);
        }

        public void inDanhSachXe(){
        for( Xe xe : danhSachXe){
            xe.print();
        }
    }

        public void menu(){
        danhSachXe.add(new Xe("Honda","B02","T00","20000000","19",false));
        danhSachXe.add(new Xe("SH","B04","X00","100000000","20",false));

            while(true){
                System.out.println("\n--QUẢN LÝ XE---");
                System.out.println("1.Nhập thông tin người mua xe");
                System.out.println("2.Tìm người mua xe");
                System.out.println("3.In danh sách");
                System.out.println("4.Thoát");
                System.out.println("Chọn chức năng");
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice){
                    case 1:
                        nhapThongTinNguoiMua();
                        break;
                    case 2:
                        timNguoiMuaXe();
                        break;
                    case 3:
                        inDanhSachXe();
                        break;
                    case 4:
                        System.out.println("Thoát chương trình");
                        return;
                    default:
                        System.out.println("Chọn lại");
                }
            }

        }

    public void timNguoiMuaXe(){
        System.out.println("Chức năng tìm người mua xe chưa được triển khai.");
    }

}







