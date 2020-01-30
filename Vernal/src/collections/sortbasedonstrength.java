package collections;

import java.util.Comparator;

public class sortbasedonstrength implements Comparator {

	@Override
	public int compare(Object ob1, Object ob2) {
		// TODO Auto-generated method stub
		College cg1=(College)ob1;
		College cg2=(College)ob2;
		return cg1.strength-cg2.strength;
	}

}
