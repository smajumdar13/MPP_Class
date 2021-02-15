package Tries.ComputerFactoryTest;

public class ComputerFactory {
//	public static Computer getComputer(String type, String CPU, String HDD, String RAM) {
//		if(type.equalsIgnoreCase(ComputerType.PC)) {
//			return new PC(CPU, HDD, RAM);	
//		}
//		if(type.equalsIgnoreCase("Server")) {
//			return new Server(CPU, HDD, RAM);	
//		}
//		return null;
		
public static ComputerInt createComputer(ComputerType type, String CPU, String HDD, String RAM) {
		
	ComputerInt comp = null;
	
	switch (type) {
			case PC:
				comp = new PC(CPU, HDD, RAM);
				break;
			case Server:
				comp = new Server(CPU, HDD, RAM);
				break;
	}
	return comp;
	}
}
