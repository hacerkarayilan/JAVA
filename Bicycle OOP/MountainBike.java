package greeks;

public class MountainBike extends Bicycle {
	public int seatHeight;
	 
   
    public MountainBike(int gear, int speed,
                        int startHeight)
    {
       
        super(gear, speed);
        seatHeight = startHeight;
    }
 
   
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
 
     public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}
