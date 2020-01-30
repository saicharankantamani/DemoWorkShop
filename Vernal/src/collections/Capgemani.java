package collections;

public class Capgemani {
int noofrounds;
int rating;
int attendence;
public Capgemani(int noofrounds, int rating, int attendence) {
	super();
	this.noofrounds = noofrounds;
	this.rating = rating;
	this.attendence = attendence;
}
@Override
public String toString() {
	return "Capgemani [noofrounds=" + noofrounds + ", rating=" + rating + ", attendence=" + attendence + "]";
}

}
