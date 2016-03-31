package by.grodno.mz;

public abstract class OfficeUnit {
	private int id;
	private String name;
	private int price;

	public OfficeUnit(int id, String name, int cost) {
		this.id = id;
		this.name = name;
		this.price = cost;
	}	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "OfficeUnit [id=" + id + ", name=" + name + ", cost=" + price + "]";
	}

}
