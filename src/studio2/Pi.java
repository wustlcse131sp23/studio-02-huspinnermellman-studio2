package studio2;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dartThrowsInCircle;
		int miss;
		int totalThrows;
		int targetThrows=1;
		double length;
		double width;
		double distance;
		
		for(totalThrows=0; totalThrows<targetThrows; totalThrows++)
		{
			length = Math.random()-0.5;
			width = Math.random()-0.5;
			distance = Math.sqrt((Math.pow(length, 2))+(Math.pow(width, 2)));
			System.out.print(" " + length + " " + width + " " + distance);
			
		}
		
		

	}

}
