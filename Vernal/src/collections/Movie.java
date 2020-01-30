package collections;

public class Movie implements Comparable<Object>
{
	String name;
	double duration;
	int rating;
	public Movie(String name, double duration, int rating)
	{
		super();
		this.name = name;
		this.duration = duration;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", duration=" + duration + ","
				+ " rating=" + rating + "]";
	}
	//@Override
	//public int compareTo(Object ob) {
		//Movie mt=(Movie)ob;
		//System.out.println(this.rating+"-"+mt.rating);
		//return this.rating-mt.rating;
		
	//}
	@Override
	public int compareTo(Object ob) {
		Movie mt=(Movie)ob;
		System.out.println(this.duration+"-"+mt.duration);
		return  (int) ((this.duration-mt.duration)*100);

}
}
