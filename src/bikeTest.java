
public class bikeTest {
	public static void main ( String args[] ){
		bike bike = new bike( "bicycle" , 15 , 2 ) ;
		
		System.out.printf("%s : %s\n%s : %d km/hr \n%s : %f", "名稱" , bike.getName() ,"速度" , bike.getSpeed() , "載重" , bike.getLoading() );
	}
	
	
}
