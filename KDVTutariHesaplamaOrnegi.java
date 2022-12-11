import java.util.Scanner;

public class KDVTutariHesaplamaOrnegi {

	public static void main(String[] args) {
		double tutar, kdvliFiyat;

		Scanner input = new Scanner(System.in);

		System.out.print("Fiyat giriniz :");

		tutar = input.nextDouble();

		if (tutar > 0 && tutar < 1000) {
			
			double kdvTutari = 0.18 * tutar;			
			kdvliFiyat = kdvTutari + tutar;
			
			System.out.println("KDV' siz Fiyat :" + tutar);
			System.out.println("KDV' li Fiyat  :" + kdvliFiyat);
			System.out.println("KDV' Tutari    :" + kdvTutari);
			
			
		}else if (tutar > 1000) {
			double kdvTutari = 0.08 * tutar;			
			kdvliFiyat = kdvTutari + tutar;
			
			System.out.println("KDV' siz Fiyat :" + tutar);
			System.out.println("KDV' li Fiyat  :" + kdvliFiyat);
			System.out.println("KDV' Tutari    :" + kdvTutari);
		}
			
			
		
		
		
		

	}

}
