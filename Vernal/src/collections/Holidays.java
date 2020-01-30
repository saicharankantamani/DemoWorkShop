package collections;

public class Holidays {
	String festival;
	int days;
	public Holidays(String festival, int days) {
		super();
		this.festival = festival;
		this.days = days;
	}
	@Override
	public String toString() {
		return "Holidays [festival=" + festival + ", days=" + days + "]";
	}
}
