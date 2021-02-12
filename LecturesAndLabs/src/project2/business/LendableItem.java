package project2.business;

import java.io.Serializable;
import java.util.List;

public interface LendableItem extends Serializable {
	int getNumCopies();
	String getTitle();
	LendableCopy getNextAvailableCopy();
	int getMaxCheckoutLength();
	boolean isAvailable();
	void addCopy();
	LendableCopy getCopy(int copyNum);
	//returns the copy numbers of the copies of this item
	List<Integer> getCopyNums();
	
	
}
