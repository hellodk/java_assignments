/** Class to plot the life expectancy of people around the globe
**/

public class LifeExpectancy extends PApplet
{
	public void setup()
	{
		size(800, 600, OPENGL);
		map = new UnfoldingMap(this, 50, 50, 700, 500, new Google.GoogleMapProvider());
		MapUtils.createDefaultEventDispatcher(this, map);
	}
public void draw()
{
map.draw();
}
}