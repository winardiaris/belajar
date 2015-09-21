import java.util.Scanner;
public class ClassScanner{
	public String nama;
	public int i1,i2,i3;
	Scanner input = new Scanner(System.in);

	public String getNama(){
		return nama;
	}

	public void inputScanner(){
		System.out.println("Masukan Nama anda: "); nama = input.nextLine();
		System.out.println("Masukan Nilai 1: "); i1 = input.nextInt();
		System.out.println("Masukan Nilai 2: "); i2 = input.nextInt();
	}
	public double rata(){
		return ((i1+i2)/2);
	}
}
