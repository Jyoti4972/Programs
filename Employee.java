package Collex;

public final class Employee {
int id;
String name;
public Employee(int id, String name) {
	this.name=name;
	this.id=id;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}


}	



