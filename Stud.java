package Collex;

public class Stud {
int id;
String name;
 
public Stud(int id, String name) {
	this.id=id;
	this.name=name;
}

@Override
public String toString() {
	return "Stud [id=" + id + ", name=" + name + "]";
}

}
