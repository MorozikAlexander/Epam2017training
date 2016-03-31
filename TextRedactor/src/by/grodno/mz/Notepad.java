package by.grodno.mz;
/**
 * General class Notepad for TextRedactor
 * @author MZ
 *
 */

import java.util.ArrayList;

public class Notepad {
	private ArrayList<TextRecord> buffer;

	public Notepad() {
		/**
		 * Notepad constructor for buffer autocreating;
		 */
		buffer = new ArrayList<TextRecord>();
	}

	public void addRecord(String add_line) {
		if (add_line.length() > 0) {
			buffer.add(new TextRecord(add_line));
		}
	}

	public void addRecord(TextRecord add_record) {
		if (add_record.get().length() > 0)
			buffer.add(add_record);
	}

	public ArrayList<TextRecord> getCopyOfAllRecords() {
		if (!buffer.isEmpty()) {
			ArrayList<TextRecord> result = new ArrayList<TextRecord>();
			for (TextRecord item : buffer) {
				result.add(new TextRecord(item));
			}
			return result;
		} else {
			return null;
		}
	}

	public void editSeachedRecords(TextRecord old_record, TextRecord new_record) {
		if (!buffer.isEmpty()) {
			for (TextRecord item : buffer) {
				if (item.equals(old_record)) {
					buffer.set(buffer.indexOf(item), new TextRecord(new_record));
					item = new_record;
				}
			}
		}
	}

	public void deleteSearchedRecords(TextRecord search_record) {
		if (!buffer.isEmpty()) {
			for (int i = 0; i < buffer.size(); i++) {
				if (buffer.get(i).equals(search_record)) {
					System.out.println("searched to delete " + search_record.toString());
					buffer.remove(i);
				}
			}

		}
	}
}
