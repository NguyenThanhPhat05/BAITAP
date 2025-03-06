package BAITAPTUAN7;
import java.util.Scanner;
class HINHTRU extends HINHTRON {
	public float ChieuCao;
	
	public HINHTRU() {
		Ten="HINHTRU";
	}
	public void nhapChieuCao() {
		Scanner kb= new Scanner(System.in);
		System.out.print("Nhap chieu cao:");
		ChieuCao= kb.nextFloat();
	}
	public void tinhTheTich() {
		tinhDienTich();
		TheTich= DienTich*ChieuCao;
	}
}
