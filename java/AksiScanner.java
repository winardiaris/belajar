import java.util.Scanner;
public class AksiScanner{
	public static void main(String[]args){
		ClassScanner scan = new ClassScanner();

		scan.inputScanner();
		System.out.println("Nama anda: "+scan.getNama());
		System.out.println("Nilai: "+scan.rata()); 
	}
}
