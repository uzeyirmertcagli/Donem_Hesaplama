import java.util.Scanner;

public class ders_ortalama_patika {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int mat, fizik, kimya, turkce, tarih, muzik;

		System.out.println("Matematik Notunuzu Giriniz : ");
		mat = scanner.nextInt();

		System.out.println("Fizik Notunuzu Giriniz : ");
		fizik = scanner.nextInt();

		System.out.println("Kimya Notunuzu Giriniz : ");
		kimya = scanner.nextInt();

		System.out.println("Türkçe Notunuzu Giriniz : ");
		turkce = scanner.nextInt();

		System.out.println("Tarih Notunuzu Giriniz : ");
		tarih = scanner.nextInt();

		System.out.println("Müzik Notunuzu Giriniz : ");
		muzik = scanner.nextInt();

		int toplam = (mat + fizik + kimya + muzik + turkce + tarih);

		double ortalama = toplam / 6;

		System.out.println("Not Ortalamanýz : " + ortalama);

		String b = (ortalama >= 60) ? "Sýnýfý Geçtiniz." : "Sýnýfta Kaldýnýz.";
		System.out.println(b);

	}

}
