package BAITAPTUAN7;
import java.util.Scanner;
 class HINHTRON extends HINHHOC {
	 public float BanKinh;
	 
	 public HINHTRON() {
		 Ten="HINHTRON";
	 }
	 public void nhapBanKinh() {
		 System.out.println("Ban kinh:"+BanKinh);
		 Scanner kb= new Scanner(System.in);
		 BanKinh= kb.nextFloat();
	 }
	 public void tinhChuVi() {
		 ChuVi = 2*Pi*BanKinh;
	 }
	 public void tinhDienTich() {
		 DienTich = Pi*BanKinh*BanKinh;
	 }

}
