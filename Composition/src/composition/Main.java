package composition;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Resolution resolution = new Resolution(1920, 1080);
		Monitor monitor = new Monitor("VSKASK", "ASUS", "18,5", resolution);
		Kasa kasa = new Kasa("Shadow Blade", "Shadow", "Temperli Cam");
		Anakart anakart = new Anakart("B250-pro", "ASUS", 10, "Windows");
		Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);
		pc.getKasa().bilgisayarýAc();
		pc.getMonitor().monitoruKapat();
		pc.getAnakart().isletim_sistemi_yukle("Kali");

	}

}
