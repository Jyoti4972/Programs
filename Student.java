package Collex;

public class Student{
	int id;
	String name;
	phone p;

public Student (int id, String name,phone p) {
		super();
		this.id = id;
		this.name = name;
		this.p = p;
	}

	public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public phone getP() {
	return p;
}

public void setP(phone p) {
	this.p = p;
}

	@Override
	public String toString() {
		return "Student_123 [id=" + id + ", name=" + name + ", p=" + p + "]";
	}
}
                                                                                                                                                                                                                                                                                                                 