package BAITAPTUAN7;

public class MAIN {
	public static void main(String[] args) {
		HINHTRON HT= new HINHTRON();
		HT.nhapBanKinh();
		HT.tinhChuVi();
		HT.tinhDienTich();
		HT.XuatTen();
		HT.inChuVi();
		HT.inDienTich();
		
		HINHTRU HTRU= new HINHTRU();
		HTRU.nhapBanKinh();
		HTRU.nhapChieuCao();
		HTRU.tinhTheTich();
		HTRU.XuatTen();
		HTRU.inTheTich();
		
		HINHCHUNHAT HCN= new HINHCHUNHAT();
		HCN.nhapChieuDai();
		HCN.nhapChieuRong();
		HCN.tinhChuVi();
		HCN.tinhDienTich();
		HCN.XuatTen();
		HCN.inChuVi();
		HCN.inDienTich();
		
		HINHVUONG HV= new HINHVUONG();
		HV.nhapCanh();
		HV.tinhChuVi();
		HV.tinhDienTich();
		HV.XuatTen();
		HV.inChuVi();
		HV.inDienTich();

	}

}
