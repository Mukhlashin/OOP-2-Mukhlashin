package tugasOOP2;

public class TugasOOP2Aritmatika {
	
	// --- SWITCH CASE ---
	
	// Membuat Atribut Nilai Yang Ingin Dikeluarkan
	static int pilih = 1;
	static int pesawat = 5000;
	static int kapal = 3000;
	static int hasil;
	
	static int Penambahan(int bil1, int bil2) {
		return (pesawat + kapal);
	}
	static int Pengurangan(int bil1, int bil2) {
		return (pesawat - kapal);
	}
	static int Perkalian(int bil1,int bil2) {
		return (pesawat * kapal);
	}
	static int pembagian(int bil1, int bil2) {
		return (pesawat / kapal);
	}
	
	static void chooseMethod() {
		switch (pilih) {
		case 1:
			hasil = Penambahan(pesawat,kapal);
			break;
		case 2:
			hasil = Pengurangan(pesawat,kapal);
			break;
		case 3:
			hasil = Perkalian(pesawat,kapal);
			break;
		case 4:
			hasil = pembagian(pesawat,kapal);
			break;
	      }
	}
	
	public static void main(String[] args) {
		chooseMethod();
		System.out.println(hasil);
    }
}
