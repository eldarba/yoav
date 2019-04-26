package b;

public class State {

	private String name;
	private int population;

	public State(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	// inner class
	public class Citizen {
		private String name;

		public Citizen(String name) {
			super();
			this.name = name;
		}

		public String getName() {
			return Citizen.this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStateName() {
			return State.this.name;
		}

	}

}
