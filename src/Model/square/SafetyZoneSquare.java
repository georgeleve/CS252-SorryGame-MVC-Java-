package Model.square;
/**
 * This class represents one of the Safety zone squares, that belong to a specific player 
 * and the enemy has no access to them.
 * @author George Leventopoulos
 */
public class SafetyZoneSquare extends Square {
	/**
	 * @param position the position of the square
	 * @param color the color of the square
	 */
	public SafetyZoneSquare(int position,String name) {
		super(position,name);
	}
}
