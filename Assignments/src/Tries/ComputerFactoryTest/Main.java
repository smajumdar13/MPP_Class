package Tries.ComputerFactoryTest;

import java.util.List;

public class Main {

	public static void main(String[] args) {
//		var computers = List.of(ComputerFactory.getComputer("pc", "2.4GHz", "1TB", "16GB"),
//				ComputerFactory.getComputer("pc", "3.77GHz", "4TB", "64GB"),
//				ComputerFactory.getComputer("server", "3.3GHz", "2TB", "16GB"),
//				ComputerFactory.getComputer("SERVER", "4.8GHz", "8TB", "32GB"));

		var computers = List.of(ComputerFactory.createComputer(ComputerType.PC, "2.4GHz", "1TB", "16GB"),
				ComputerFactory.createComputer(ComputerType.Server, "3.77GHz", "4TB", "64GB"),
				ComputerFactory.createComputer(ComputerType.PC, "3.3GHz", "2TB", "16GB"),
				ComputerFactory.createComputer(ComputerType.Server, "4.8GHz", "8TB", "32GB"));

		
		for(ComputerInt c: computers) {
			System.out.println(c);
		}
	}

}
