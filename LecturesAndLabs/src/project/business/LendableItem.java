package project.business;

import java.io.Serializable;

public interface LendableItem extends Serializable {
	int getNumCopies();
	String getTitle();
	LendableCopy getNextAvailableCopy();
	int getMaxCheckoutLength();
	boolean isAvailable();
	void addCopy();
	
	
}
