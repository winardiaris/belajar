/*anonymous inner class, yaitu inner class yang tidak mempunyai
nama, loh kok bisa? feature ini sering digunakan kalau kita ingin mengimplementasikan
interface di satu tempat dan implementasi itu tidak pernah digunakan di tempat lain.
Contohnya sebagai berikut ini : */

public class Person4{
	private Runnable thread = new Runnable(){
		public void run(){
			System.out.println("Hello world from thread");
		}
	};
}
