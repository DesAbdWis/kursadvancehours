package advanceHours.day02;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		/*
		 Bir say�n�n m�kemmel olup olmad���n� bulan bir program yaz�n�z.
M�kemmel say� : bir say�n�n kendisi hari� b�lenlerinin toplam�, kendisine e�itse o say� m�kemmeldir.
ORNEK:
  INPUT     : 6
  OUTPUT : 1,2,3
                     1+2+3 = 6 = 6 (M�kemmel)
		 */
		/*1.yol
		Scanner scan = new Scanner(System.in);
       System.out.print("Lutfen pozitif bir sayi giriniz: ");
       int sayi = scan.nextInt();
       
       System.out.println(checkPerfectNumber(sayi) ? "Girilen sayi PERFECT sayidir." : "Girilen sayi Perfect sayi DEGILDIR.");
       
       
       scan.close();
       
   }
   
   public static boolean checkPerfectNumber(int sayi) {
       int b�lenToplam� = 0;
       for(int i=1; i<sayi; i++){
           if(sayi%i == 0) b�lenToplam� += i;
       }
       return b�lenToplam�==sayi;
		*/
		

			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen bir sayi giriniz");
			int sayi = scan.nextInt();
			
			System.out.println(checkPerfectNumber(sayi));
			boolean flag;
			flag = checkPerfectNumber(sayi);
			System.out.println(flag);
			
			String result = checkPerfectNumber(sayi)? "Sayi mukemmel sayidir" 
					: "Sayi mukemmel sayi degildir";
			System.out.println(result);
			scan.close();
	}
	
	public static boolean checkPerfectNumber(int sayi){
		int toplam = 0;
		boolean flag = false; // durum kontrol� (a��k kapal� gibi) "flag ismi bir onem arzetmiyor"
		for(int i = 1; i<sayi; i++){
			if(sayi%i==0){
				toplam = toplam + i; // toplam += i;
			}
		}
		if(toplam == sayi){
			flag=true;
		}
		
		return flag;

	}


	}

