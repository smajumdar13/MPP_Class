package Tries.ComputerFactoryTest;

public abstract class Computer {
	public abstract String getCPU();
	public abstract String getHDD();
	public abstract String getRAM();
	
	
	@Override
	public String toString() {
		return "CPU" + getCPU() + ", HDD" + getHDD() + ", RAM" + getRAM();
	}
		
}
