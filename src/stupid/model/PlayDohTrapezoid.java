package stupid.model;

public class PlayDohTrapezoid
{
	private int size;
	
	public PlayDohTrapezoid()
	{
		this.size = 9;
		
	}
	
	public PlayDohTrapezoid(int size)
	{
		this.size = size;
	}
	
	public String toString()
	{
		String description = "I am a trapezoid, my size is " + size;
		return description;
	}

}
