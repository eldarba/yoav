package b.oop.animals;

public abstract class Animal {

	private int id;

	public abstract void speak();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
