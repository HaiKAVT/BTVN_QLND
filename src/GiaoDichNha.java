public class GiaoDichNha extends  GiaoDich{
    String diaChi;

    public GiaoDichNha() {
    }

    public GiaoDichNha(String diaChi) {
        this.diaChi = diaChi;
    }
    public GiaoDichNha(String loaiNha, String diaChi) {
        this.diaChi = diaChi;
    }

    public GiaoDichNha(int maGiaoDich, String ngayGiaoDich, int donGia, int dienTich, String phanLoai, String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich, phanLoai);
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "GiaoDichNha{" +
                "maGiaoDich=" + maGiaoDich +
                ", ngayGiaoDich='" + ngayGiaoDich + '\'' +
                ", donGia=" + donGia +
                ", dienTich=" + dienTich +
                ", phanLoai='" + phanLoai + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
