package by.grodno.mz;

import java.util.Comparator;

public class SortedByPrice implements Comparator<OfficeUnit> {
	public int compare(OfficeUnit unit1, OfficeUnit unit2) {
		int price1 = unit1.getPrice();
		int price2 = unit2.getPrice();
		if (price1 > price2) {
			return 1;
		} else if (price1 < price2) {
			return -1;
		} else {
			return 0;
		}
	}
}