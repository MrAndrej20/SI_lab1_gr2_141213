class Student {
	String index;
	String firstName;
	String lastName;

	double[] grades;

	Student(String index, String firstName, String lastName, double[] grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = new double[grades.length];
		for (int i = 0; i < grades.length; i++) {
			this.grades[i] = grades[i];
		}
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGrades(double[] grades) {
		this.grades = new double[grades.length];
		for (int i = 0; i < grades.length; i++) {
			this.grades[i] = grades[i];
		}
	}

	public String getIndex() {
		return this.index;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public double[] getGrades() {
		return this.grades;
	}

	public double getAverage() {
		double total = 0;
		for (int i = 0; i < this.grades.length; i++) {
			total += this.grades[i];
		}
		return total / this.grades.length;
	}

	public int ECTSCredits() {
		int credits = 0;
		for (int i = 0; i < this.grades.length; i++) {
			credits += this.grades[i] * 6;
		}
		return credits;
	}
}
