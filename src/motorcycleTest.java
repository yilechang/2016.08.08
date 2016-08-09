
public class motorcycleTest {
	public static void main ( String args[] ){
		motorcycle motorcycle = new motorcycle( "motorcycle" , 50 , 2 ) ;
		
		System.out.printf("%s : %s\n%s : %d km/hr \n%s : %f", "名稱" , motorcycle.getName() ,"速度" , motorcycle.getSpeed() , "載重" , motorcycle.getLoading() );
	}

}
