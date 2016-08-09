
public class carTest {
	public static void main ( String args[] ){
		car car = new car( "car" , 100 , 5 ) ;
		
		System.out.printf("%s : %s\n%s : %d km/hr \n%s : %f", "名稱" , car.getName() ,"速度" , car.getSpeed() , "載重" , car.getLoading() );
	}
}
