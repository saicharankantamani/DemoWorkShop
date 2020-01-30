package tocheck;

public class Light {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lightspeed;
		long days;
		long seconds;
		long distance;
		lightspeed = 186000;
		days = 1000; // specify number of days here
		seconds = days * 24 * 60 * 60; // convert to seconds
		distance = lightspeed * seconds; // compute distance
		System.out.print("In " + days+ " days light will travel about " +distance + " miles.");
	}

}
