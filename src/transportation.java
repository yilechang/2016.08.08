
public class transportation {
	protected String name ;
	protected int  speed  , loading ;
	
	public transportation( String n , int s , int l ){
		name = n ;
		speed = s ;
		loading = l ;
	}
	public void setName( String n ){
		name = n ;
	}
	public String getName(){
		return name ;
	}
	public void setSpeed( int s ){
		
		speed = s ;
	}
	public int getSpeed(){
		return speed ;
	}
	public void setLoading( int l ){
		loading = l ;
	}
	public double getLoading(){
		return loading ;
	}
	public String toString(){
		return String.format("%s : %s\n%s : %d km/hr \n%s : %d人", "名稱" , name ,"速度" , speed , "載重" , loading ) ; 
	}
}
