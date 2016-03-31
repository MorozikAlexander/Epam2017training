package by.grodno.mz;

import java.util.Comparator;

public class SortedById implements Comparator<OfficeUnit> {
	public int compare(OfficeUnit unit1, OfficeUnit unit2) {
		int id1 = unit1.getId();
		int id2 = unit2.getId();
		if (id1 > id2) {
			return 1;
		} else if (id1 < id2) {
			return -1;
		} else {
			return 0;
		}
	}
}