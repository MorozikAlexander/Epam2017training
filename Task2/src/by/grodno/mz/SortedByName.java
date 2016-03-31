package by.grodno.mz;

import java.util.Comparator;

public class SortedByName implements Comparator<OfficeUnit> {
	public int compare(OfficeUnit unit1, OfficeUnit unit2) {
		String name1 = unit1.getName();
		String name2 = unit2.getName();
		return name1.compareTo(name2);
	}

}
