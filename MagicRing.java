
/**
 * @author ysabir
 *Title: MagicRing class that extends parent Ring class
 */
public class MagicRing extends Ring {

	private boolean lucky;

	public MagicRing(int v) {
		super(v);
		lucky = Math.random() < 0.5;//half of the time this would return a true value and the other half a false value
	}

	public boolean isLucky() {
		return lucky;// getter method for the instance variable lucky
	}

	@Override
	public String toString() {

		if (isLucky() == true)
			return "lucky ring worth $" + super.getValue();// if it is lucky returns the value
		else
			return "unlucky ring worth $" + super.getValue();// if it is unlucky returns the value.
	}

}
