package project.business;

import java.io.Serializable;

public interface LendableCopy extends Serializable {
	
	public boolean isAvailable();
	public int getCopyNum();
	public LendableItem getLendableItem();
	//changes unavailable to available, and available to unavailable
	public LendableCopy changeAvailability();
	
}
