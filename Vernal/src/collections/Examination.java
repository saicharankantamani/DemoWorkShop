package collections;

public class Examination implements Comparable
{
String subjet;
int marks;
float percentage;
public Examination(String subjet, int marks, float percentage) {
	super();
	this.subjet = subjet;
	this.marks = marks;
	this.percentage = percentage;
}
@Override
public String toString() {
	return "Examination [subjet=" + subjet + ", marks=" + marks + ", percentage=" + percentage + "]";
}
public int compareTo(Object ob)
{
	Examination et=(Examination)ob;
	return this.marks-et.marks;
}

}
