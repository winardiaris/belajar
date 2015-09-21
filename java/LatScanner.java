//PERINTAH MASUKAN DAN KELUARAN PEMROGRAMAN JAVA
import java.util.Scanner;

public class LatScanner{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		//variable
		String nama;
		int i1;
		double i2,i3;

		System.out.println("Masukan nama anda: "); nama = input.nextLine();
		System.out.println("Masukan Nilai 1: "); i1 = input.nextInt();
		System.out.println("Masukan Nilai 2: "); i2 = input.nextInt();

		i3 = i1+i2;
		System.out.println("--------------------------------");
		System.out.println("Nama anda: "+nama);
		System.out.println("Nilai yang keluar:"+i3);
		System.out.println("");
	}
}
