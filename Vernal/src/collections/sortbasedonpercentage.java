package collections;

import java.util.Comparator;

public class sortbasedonpercentage implements Comparator {

	@Override
	public int compare(Object ob1, Object ob2) {
		// TODO Auto-generated method stub
		Examination et1=(Examination)ob1;
		Examination et2=(Examination)ob2;
		return (int)((et1.percentage-et2.percentage)*1000);
	}

}
