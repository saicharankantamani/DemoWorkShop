package collections;

public class Movie1 {
	String name;
	double duration;
	float rating;
	public Movie1(String name, double duration, float rating) {
		super();
		this.name = name;
		this.duration = duration;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie1 [name=" + name + ", duration=" + duration + ", rating=" + rating + "]";
	}

}

