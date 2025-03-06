package BAITAPTUAN7;
import java.util.Scanner;
class HINHCHUNHAT extends HINHHOC {
	public float Dai;
	public float Rong;
	
	public HINHCHUNHAT() {
		Ten="HINHCHUNHAT";
	}
	public void nhapChieuDai() {
		Scanner kb= new Scanner(System.in);
		System.out.print("Nhap chieu dai:");
		Dai= kb.nextFloat();
	}
	public void nhapChieuRong() {
		Scanner kb= new Scanner(System.in);
		System.out.print("Nhap chieu rong:");
		Rong= kb.nextFloat();
	}
	public void tinhChuVi() {
		ChuVi= (Dai+Rong)*2;
	}
	public void tinhDienTich() {
		DienTich=Dai*Rong;
	}

}
