import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Class that aggregates (stores in a list) and sorts shapes.
 *
 * Sorting is done either through the natural ordering of shapes
 * or through a given comparator.
 *
 * @author Stephen
 * @version 2019-02-17
 */
public class ShapeSorter
{
	/**
	 * List of shapes to be sorted.
	 */
	protected ArrayList<Shape> shapes;

	/**
	 * Constructor. Initializes member fields.
	 */
	public ShapeSorter()
	{
<<<<<<< HEAD
		shapes = new ArrayList<Shape>();
		//sortShapes();
		
=======
		sortShapes();
		sortShapes(comparator);
>>>>>>> 16196480229a911509b44404cb6e03cbfa544968
		// TODO: complete this...
	}

	/**
	 * Adds a shape to the list of shapes to be sorted.
	 *
	 * @param s Shape to be added.
	 */
	public void addShape(Shape s)
	{
		shapes.add(s);
		
		// TODO: complete this...
	}

	/**
	 * Sort the list of shapes by the default ordering (Shapes' compareTo method).
	 *
	 * It is recommended that you use Collections.sort().
	 */
	public void sortShapes()
	{
		Collections.sort(shapes);
		// TODO: complete this...
	}

	/**
	 * Sort the list of shapes by some custom ordering (a class implementing Comparator<Shape>).
	 *
	 * It is recommended that you use Collections.sort().
	 *
	 * @param comparator The shape comparing object that defines the ordering of the shapes (how to
	 * sort them).
	 */
	public void sortShapes(Comparator<Shape> comparator)
	{
		// TODO: complete this...
		Collections.sort(shapes, comparator);
	}

	/**
	 * toString override.
	 *
	 * @return The toString of all shared shapes, concatenated. toStrings are added
	 * in the order that they appear in the list.
	 */
	@Override
	public String toString()
	{
<<<<<<< HEAD
		String shapeInfo = "";
		for (int i = 0; i < shapes.size(); ++i) {
			shapeInfo += shapes.get(i).toString();
		}
		return (shapeInfo);
=======
>>>>>>> 16196480229a911509b44404cb6e03cbfa544968
		// TODO: complete this...
	}

}
