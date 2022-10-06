package intro;

public class Main {
	//main javada başlangıç noktasıdır, metodudur. 
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		//değişken isimlendirmeleri javada camelCase yazılır.
		String ortaMetin ="İlginizi çekebilir";
		String altMetin ="vade Süresi";
		
		System.out.println(ortaMetin + altMetin);
		
		//integer, tam sayı
		int vade = 12;
		
		//ondalıklı değer
		double dolarDun= 18.15;
		double dolarBugun = 18.25;
		
		//şartlı veriler, boolean, true-false
		boolean dolarDustuMu= true;
		
		String okYonu = "";
		
		if(dolarDun > dolarBugun) {
			okYonu ="down.svg";
			System.out.println(okYonu);
		}
		
		else if (dolarDun < dolarBugun) {
			okYonu ="up.svg";
			System.out.println(okYonu);
		}
	
		else {
			okYonu ="equal.svg";
			System.out.println(okYonu);
		}
		
		//array
		String[] krediler = {
			"Hızlı Kredi",
			"Maaşını Halkbanktan Alanlar",
			"Mutlu Emekli"
		};
		
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		for(int i = 0; i< krediler.length  ; i++){
			System.out.println(krediler[i]);
		}
	}

}
