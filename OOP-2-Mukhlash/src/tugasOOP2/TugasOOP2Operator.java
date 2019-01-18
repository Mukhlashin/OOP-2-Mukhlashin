package tugasOOP2;

public class TugasOOP2Operator {
	// --- Case 1 Adalah Tentang Sisa Baterai Laptop  ---
	
	// Variable Global
	static int baterai = 45;
	public static void main (String[] args) {
	// Membuat Attribut Bertipe Data Integer
	
	// Membuat Suatu Condition Jika Baterai <= 25 Maka Outputnya Adalah "Your Battery At Least 1/4 Power"
	if (baterai <= 25) {
		System.out.println("Your Battery At Least 1/4 Power");
	// Jika Baterai <= 50 Maka Outputnya Adalah "Your Battery Is In Half Power"
	} else if (baterai <= 50) {
		System.out.println("Your Battery Is in Half Power");
	// Jika Baterai <= 75 Maka Outputnya Adalah "Your Battery Is 3/4 Power"
	} else if (baterai <= 75) {
		System.out.println("Your Battery is 3/4 Power");
	// Jika Baterai <= 25 Maka Outputnya Adalah "Your Battery At Full Power"
	} else if (baterai <= 100) {
		System.out.println("Your Battery is At Full Power");
	// Dan Jika Condition battery Diluar Dari 4 Pernyataan Diatas, maka Outputnya Adalah Jika Baterai <= 25 Maka Outputnya Adalah "This Message Should not Appeared"
	} else {
		System.out.println("This Message Should not Appeared");
	}
	// --- Case 2 Adalah Tentang Suhu Air Panas ---
	
	// Variable Local
	int suhu = 50;
	
	// Do Pemanas Air Jika Suhu Masih Dibawah 100 Derajat Celsius
	do {
		System.out.println(suhu);  // Mengeluarkan Hasil Ke Console Output
		suhu++;                    // Suhu Air Panas Akan Selalu Meningkat 
	    } while (suhu <= 100);     // Sampai 100 derajat Celsius
	
	// --- Case 3 Adalah Tentang Device Charger ---
	
	// Device Akan Selalu Mencharge Sampai battery nya 100 %
	for (int battery = 57; battery < 100; battery = 1 + battery ) {
		System.out.println(battery + "%");
	   }
	
	// --- Case 4 Adalah Tentang Identitas Orang ---
	
	String Habib = "Habib";
	String Fatih = "Fatih";
	
	// System Mendeteksi Jika Habib Tidak Sama Dengan Fatih
	System.out.println(!(Habib == Fatih));
	
	// --- Case 5 Adalah Tentang Perkalian ---
	
	int x = 10;
	int y = 23;
	
	// Menambah variable x dan y
	x += y;
	System.out.println(x);
	// Mengurangi varible x dan y
	x -= y;
	System.out.println(x);
	// Mengalikan varible x dan y
	x *= y;
	System.out.println(x);
	// Membagi varible x dan y
	x /= y;
	System.out.println(x);
	// Sisa Bagi Dari varible x dan y
	x %= y;
	System.out.println(x);
    
	// --- Case 6 Adalah Tentang Harga Laptop ---
	
	int hargaMacbook = 8000000;
	int hargaWindows = 6000000;
	
	System.out.println("Operator Rasional Perbandingan Harga Laptop : ");
	System.out.println((hargaMacbook == hargaWindows) + "        : Operasi x == y");
	System.out.println((hargaMacbook < hargaWindows) +  "        : Operasi x < y");
	System.out.println((hargaMacbook > hargaWindows) +  "        : Operasi x > y");
	System.out.println((hargaMacbook <= hargaWindows) + "        : Operasi x <= y");
	System.out.println((hargaMacbook >= hargaWindows) + "        : Operasi x >= y");
	System.out.println((hargaMacbook != hargaWindows) + "        : Operasi x != y");
	
	// --- Case 6 Adalah Tentang Voltase TV ---
	
	int voltaseTV = 220;
	int voltase = 220;
	
	System.out.println((voltase < voltaseTV)? "Anda kekurangan Voltase" : "Voltase Anda Mencukupi");
	
	}
}
	
	
