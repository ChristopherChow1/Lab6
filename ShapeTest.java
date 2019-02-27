import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for shapes and their comparators.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeTest
{
	//==================================================================================================================
	// Basic Shape Testing:
	//==================================================================================================================
    /**
     * Tests for the square class.
     */
	@Test
	public void SquareTest()
	{
		Shape sqr = new Square("Square1", 3.0);
		Assert.assertEquals("Square area incorrect.", 9.0, sqr.getArea(), 0.0001);
		Assert.assertEquals("Square perimeter incorrect.", 12.0, sqr.getPerimeter(), 0.0001);
		Assert.assertEquals("Square type incorrect.", "Square", sqr.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Square1", sqr.getId());
	}

	/**
     * Tests for the rectangle class.
     */
	@Test
	public void RectangleTest()
	{
		Shape rect = new Rectangle("Rectangle1", 1, 2);
		Assert.assertEquals("Rectangle area Incorrect.", 2.0, rect.getArea(), 0.0001);
		Assert.assertEquals("Rectangle perimeter Incorrect.", 6.0, rect.getPerimeter(), 0.0001);
		Assert.assertEquals("Rectangle type Incorrect.", "Rectangle", rect.getShapeType());
		Assert.assertEquals("Shape ID Incorrect.", "Rectangle1", rect.getId());

		// TODO: complete this...
	}

	/**
     * Tests for the EquilateralTriangle class.
     */
	@Test
	public void TriangleTest()
	{
		Shape tri = new EquilateralTriangle("Triangle1", 0);
		Assert.assertEquals("Triangle area Incorrect.", 0, tri.getArea(), 0.0001);
		Assert.assertEquals("Triangle Perimeter Incorrect.", 0, tri.getPerimeter(), 0.0001);
		Assert.assertEquals("Triangle type Incorrect.", "EquilateralTriangle", tri.getShapeType());
		Assert.assertEquals("Shape ID Incorrect.", "Triangle1", tri.getId());

		// TODO: complete this...
	}

	/**
     * Tests for the trapezoid class. Also test that IDs are done correctly.
     */
	@Test
	public void TrapezoidTest()
	{
		Shape trap = new Trapezoid("Trapezoid1", 1.0,2.0,3.0,4.0);
		Assert.assertEquals("Trapezoid area Incorrect.", 0, trap.getArea(), 0.0001);
		Assert.assertEquals("Trapezoid Perimeter Incorrect.", 0.0, trap.getPerimeter(), 0.0001);
		Assert.assertEquals("Trapezoid type Incorrect.", "Trapezoid", trap.getShapeType());
		Assert.assertEquals("Shape ID Incorrect.", "Trapezoid1", trap.getId());
		// TODO: complete this...
	}

	/**
     * Tests for the ellipse class. Also test that IDs are done correctly.
     */
	@Test
	public void EllipseTest()
	{
		Shape circ = new Ellipse("Ellipse1", 3.0, 3.0);
		Assert.assertEquals("Ellipse area incorrect.", Math.PI*3.0*3.0, circ.getArea(),0.0001);
		Assert.assertEquals("Ellipse perimeter incorrect.",
				2 * Math.PI * Math.sqrt((Math.pow(3, 2) + Math.pow(3, 2)) / 2),
				circ.getPerimeter(),0.0001);
		Assert.assertEquals("Ellipse type incorrect.", "Ellipse",circ.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Ellipse1", circ.getId());

		Shape circs = new Ellipse("Ellipse2", 5.0, 3.0);
		Assert.assertEquals("Ellipse area incorrect.", Math.PI*3*5, circs.getArea(),0.0001);
		Assert.assertEquals("Ellipse perimeter incorrect.",
				2 * Math.PI * Math.sqrt((Math.pow(5.0, 2) + Math.pow(3.0, 2)) / 2),
				circs.getPerimeter(),0.0001);
		Assert.assertEquals("Ellipse type incorrect.", "Ellipse",circs.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Ellipse2", circs.getId());
	}

	/**
     * Tests for the circle class. Also test that IDs are done correctly.
     */
	@Test
	public void CircleTest()
	{
		Shape circ = new Circle("Circle1", 3.0);
		Assert.assertEquals("Circle area incorrect.", Math.PI*3.0*3.0, circ.getArea(),0.0001);
		Assert.assertEquals("Circle perimeter incorrect.", Math.PI*2*3.0, circ.getPerimeter(),0.0001);
		Assert.assertEquals("Circle type incorrect.", "Circle",circ.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Circle1", circ.getId());
		
		Shape circ2 = new Circle("Circle2", 2.0);
		Assert.assertEquals("Circle area incorrect.", Math.PI*Math.pow(2.0, 2), circ2.getArea(),0.0001);
		Assert.assertEquals("Circle perimeter incorrect.", Math.PI*2*2.0, circ2.getPerimeter(),0.0001);
		Assert.assertEquals("Circle type incorrect.", "Circle",circ2.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Circle2", circ2.getId());
		// TODO: complete this...
	}

	/**
	 * Tests for Shape's toString().
	 */
	@Test
	public void ShapeToStringTest()
	{
		Shape s1 = new Square("A", 4.0);
		Assert.assertEquals("toString incorrect", "Square:	 ID = A	 area = 16.000 	 perimeter = 16.000 ", s1.toString());
		// TODO: complete this...
	}

	//==================================================================================================================
	// Comparisons:
	//==================================================================================================================
	/**
     * Tests for the Shape Area Comparator class.
     */
	@Test
	public void CompareAreaTest()
	{
	    // Test equals:
		Shape rect = new Rectangle("R1", 3.0,3.0);
		Shape sqr = new Square("S1", 3.0);
		ShapeAreaComparator sc = new ShapeAreaComparator();
		Assert.assertEquals("ShapeAreaComparator should find shapes equal.", 0, sc.compare(rect, sqr));
		Assert.assertTrue("ShapeAreaComparator should find shapes equal.", sc.equals(rect, sqr));

		// Test equal perimeter, different area:
        Shape rect2 = new Rectangle("R2", 1.0, 9.0);
        Shape sqr2 = new Square("S2", 5.0);
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", -1, sc.compare(rect2, sqr2));
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", 1, sc.compare(sqr2, rect2));
        Assert.assertFalse("ShapeAreaComparator incorrectly finds shapes equal.", sc.equals(rect2, sqr2));

        // Test unequal perimeter and area:
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", 1, sc.compare(sqr2, rect));
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", -1, sc.compare(rect, sqr2));
        Assert.assertFalse("ShapeAreaComparator incorrectly finds shapes equal.", sc.equals(sqr2, rect));
	}

	/**
     * Tests for the Shape Perimeter Comparator class.
     */
	@Test
	public void ComparePerimeterTest()
	{
		Shape rect = new Rectangle("R1", 3.0,3.0);
		Shape sqr = new Square("S1", 3.0);
		ShapePerimeterComparator sc = new ShapePerimeterComparator();
		Assert.assertEquals("ShapePerimeterComparator should find shapes equal.", 0, sc.compare(rect, sqr));
		Assert.assertTrue("ShapePerimeterComparator should find shapes equal.", sc.equals(rect, sqr));
		/*
		// Test equal area, different perimeter:
        Shape rect2 = new Rectangle("R2", 1.0, 9.0);
        Shape sqr2 = new Square("S2", 5.0);
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", 0, sc.compare(rect2, sqr2));
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", 0, sc.compare(sqr2, rect2));
        Assert.assertFalse("ShapePerimeterComparator incorrectly finds shapes equal.", sc.equals(rect2, sqr2));

        // Test unequal perimeter and area:
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", 1, sc.compare(sqr2, rect));
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", -1, sc.compare(rect, sqr2));
        Assert.assertFalse("ShapePerimeterComparator incorrectly finds shapes equal.", sc.equals(sqr2, rect));
		// TODO: complete this...
		 */
		 
	}

	/**
	 * Tests the natural ordering of shapes (compareTo in shape)
	 */
	@Test
    public void NaturalCompareTest()
    {
		Shape rect = new Rectangle("R1", 3.0,3.0);
		Shape sqr = new Square("S1", 4.0);
		sqr.compareTo(rect);
		Assert.assertEquals("compareTo is not working",1,sqr.compareTo(rect));
		Assert.assertEquals("compareTo is not working",-1,rect.compareTo(sqr));

		// TODO: complete this...
    }
}
