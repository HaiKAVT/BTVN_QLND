import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManageGiaoDich {
    List<GiaoDich> giaoDich = new ArrayList<GiaoDich>();
    static Scanner scanner = new Scanner(System.in);


    static  SortGiaoDich sortGiaoDich = new SortGiaoDich();


    public  void  addGiaoDich(String loaiGiaoDich){
        GiaoDich giaoDichs = create(loaiGiaoDich);
        giaoDich.add(giaoDichs);
    }

    public  void thanhTien(String phanLoai){
        GiaoDich giaoDich1 = create(phanLoai);
        giaoDich.add(giaoDich1);
    }

   public GiaoDich create(String loaiGiaoDich) {
        System.out.println("nhập mã giao dịch");
        int maGiaoDich = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập ngày giao dịch");
        String ngayGiaoDich = scanner.nextLine();
        System.out.println("nhập đơn giá");
        int donGia = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập diện tích ");
        int dienTich = Integer.parseInt(scanner.nextLine());
        System.out.println("phân loại");
        String phanLoai = scanner.nextLine();

        if(loaiGiaoDich == "GiaoDichNha"){
            System.out.println(" nhập địa chỉ nhà ");
            String diaChi = scanner.nextLine();

            return new GiaoDichNha(maGiaoDich, ngayGiaoDich, donGia,dienTich,phanLoai,diaChi);
        }

        if(loaiGiaoDich == "GiaoDichDat"){
            return new GiaoDichDat(maGiaoDich,ngayGiaoDich,donGia,dienTich,phanLoai);
        }
        return null;
    }
    public  void  demSoLuong(String loaiGiaoDich){
        int count = 0;
        if (loaiGiaoDich == "GiaoDichNha") {
            for (GiaoDich gd: giaoDich) {
                count++;
                System.out.println("số lượng giao dịch nhà là : " + count);
            }
        }

        if(loaiGiaoDich == "GiaoDichDat"){
            for (GiaoDich gd: giaoDich) {
                count++;
                System.out.println("số lượng giao dịch đất là : " + count);
            }
        }
    }
    public  void  show(){
        for (GiaoDich gd: giaoDich) {
            System.out.println(gd);
        }
    }
    public  void  xoaTheoNgay(){
        String ngayGiaoDich = scanner.nextLine();
        giaoDich.removeIf(x -> x.getNgayGiaoDich().equals(ngayGiaoDich));
    }
    public  void tinhTienTheoNgay(String phanLoai){
        String ngayTinhTien = scanner.nextLine();


        if(phanLoai == "GiaoDichNha"){
            for (GiaoDich g: giaoDich) {
                if(g.getPhanLoai().equals(ngayTinhTien)){
                    if(g.getPhanLoai().equals("A")){
                        System.out.println("Thành Tiền : " +
                                (Integer.parseInt(String.valueOf(g.getDienTich()))*
                                Integer.parseInt(String.valueOf(g.getDonGia()))*1.5));
                    }
                    if(g.getPhanLoai().equals("B") || g.getPhanLoai().equals("C")){
                        System.out.println("Thành Tiền: " + (Integer.parseInt(String.valueOf(g.getDienTich()))*
                                Integer.parseInt(String.valueOf(g.getDonGia()))));
                    }
                }

            }
        }
        if(phanLoai == "GiaoDichDat"){
            for (GiaoDich g: giaoDich) {
                if(g.getPhanLoai().equals(ngayTinhTien)){
                    if(g.getPhanLoai().equals("CaoCap")){
                        System.out.println("Thành Tiền: " + (Integer.parseInt(String.valueOf(g.getDienTich()))*
                                Integer.parseInt(String.valueOf(g.getDonGia()))));
                    }
                    if(g.getPhanLoai().equals("Thuong")){
                        System.out.println("Thành Tiền: " + (Integer.parseInt(String.valueOf(g.getDienTich()))*
                                Integer.parseInt(String.valueOf(g.getDonGia()))) / 100*90);
                    }
                }
            }
        }
    }
    public  void search(){
        System.out.println("nhập ngày cần tìm kiếm : ");
        String index = scanner.nextLine();
        for (GiaoDich g: giaoDich) {
            if(g.getNgayGiaoDich().equals(index)){
                System.out.println(g);
            }
        }
    }
    public void  sort(){
        Collections.sort(giaoDich, sortGiaoDich);
    }
}
