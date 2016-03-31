package by.grodno.mz;

/**
 * Basic class TextRecord which contain 1 record of Notepad
 * 
 * @author MZ
 *
 */

public class TextRecord {
	private String text;

	public TextRecord() {
		text = "";
	}

	public TextRecord(String init) {
		this.set(init);
	}

	public TextRecord(TextRecord other) {
		this(other.get());
	}

	public String get() {
		return text;
	}

	public void set(String record) {
		text = record;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return text;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof TextRecord) {
			if (this.text == ((TextRecord) obj).text) {
				return true;
			} else
				return false;
		} else
			return false;
	}
}