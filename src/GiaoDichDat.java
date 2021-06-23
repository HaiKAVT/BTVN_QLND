public class GiaoDichDat extends  GiaoDich{
    public GiaoDichDat() {
    }

    public GiaoDichDat(int maGiaoDich, String ngayGiaoDich, int donGia, int dienTich, String phanLoai) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich, phanLoai);
    }

    @Override
    public String toString() {
        return "GiaoDichDat{" +
                "maGiaoDich=" + maGiaoDich +
                ", ngayGiaoDich='" + ngayGiaoDich + '\'' +
                ", donGia=" + donGia +
                ", dienTich=" + dienTich +
                ", phanLoai='" + phanLoai + '\'' +
                '}';
    }
}
