package BAITAPTUAN7;
import java.util.Scanner;
class HINHVUONG extends HINHCHUNHAT {
	public HINHVUONG() {
		Ten="HINHVUONG";
	}
	public void nhapCanh() {
		Scanner kb= new Scanner(System.in);
		System.out.print("Nhap canh");
		Dai=Rong= kb.nextFloat();
	}
}
