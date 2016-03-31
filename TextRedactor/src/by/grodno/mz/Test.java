package by.grodno.mz;

import java.util.ArrayList;

/**
 * Text Redactor Project Text Redactor Package
 * 
 * @author MZ - Morozik Alexander
 *
 */

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notepad MyNotepad = new Notepad();

		MyNotepad.addRecord("1 ������");
		MyNotepad.addRecord("2 ������");
		MyNotepad.addRecord("3 ������");
		MyNotepad.addRecord("4 ������");
		MyNotepad.addRecord("5 ������");

		ArrayList<TextRecord> result = new ArrayList<TextRecord>();
		result = MyNotepad.getCopyOfAllRecords();

		for (TextRecord item : MyNotepad.getCopyOfAllRecords()) {
			System.out.println(item.toString());
		}

		result.get(3).set("4test");
		result.get(1).set("2test");

		result.add(new TextRecord("777"));

		for (TextRecord item : result) {
			System.out.println(item.toString());
		}

		for (TextRecord item : MyNotepad.getCopyOfAllRecords()) {
			System.out.println(item.toString());
		}

		result = MyNotepad.getCopyOfAllRecords();
		MyNotepad.addRecord("6 ������");

		for (TextRecord item : result) {
			System.out.println(item.toString());
		}

		MyNotepad.editSeachedRecords(new TextRecord("5 ������"), new TextRecord("-------"));

		MyNotepad.deleteSearchedRecords(new TextRecord("4 ������"));

		for (TextRecord item : MyNotepad.getCopyOfAllRecords()) {
			System.out.println(item.toString());
		}
	}
}
