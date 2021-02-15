package Tries.ComputerFactoryTest;

public class Server implements ComputerInt {
	private String cpu;
	private String hdd;
	private String ram;
	
	Server(String c, String h, String r) {
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
		return "Server [CPU=" + cpu + ", HDD=" + hdd + ", RAM=" + ram + "]";
	}
	
	
}
