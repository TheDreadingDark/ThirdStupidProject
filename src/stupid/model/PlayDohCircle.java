package stupid.model;

public class PlayDohCircle
{
	//Declaration Section
	//Data member section
	private int size;

	public PlayDohCircle()
	{
		this.size = 5;
		
	}
	
	public PlayDohCircle(int big)
	{
		this.size = big;
	}
	
	public void setSize(int newSize)
	{
		this.size = newSize;
	}
	
	public String toString()
	{
		String description = "I am a circle, my size is " + size;
		return description;
	}
}
