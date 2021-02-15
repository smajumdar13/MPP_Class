package Tries.ComputerFactoryTest;

public class PC implements ComputerInt {
	private String cpu;
	private String hdd;
	private String ram;
	
	PC(String c, String h, String r) {
		this.cpu = c;
		this.hdd = h;
		this.ram = r;
	}

	public String getCPU() {
		return cpu;
	}

	public String getHDD() {
		return hdd;
	}

	public String getRAM() {
		return ram;
	}

	@Override
	public String toString() {
		return "PC [CPU=" + cpu + ", HDD=" + hdd + ", RAM=" + ram + "]";
	}
	
	
}
