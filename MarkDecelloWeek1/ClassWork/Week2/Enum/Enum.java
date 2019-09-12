public class Enum{
	//Enums = container for integers
	public enum Colors{
		GREEN,
		BLUE,
		RED,
		ORANGE
	};

	public Colors myColor = Colors.RED;

	public static void main(String[] args){
		Enum e = new Enum();
		
		//Maybe type Enum.Colors.RED?
		if(e.myColor == Enum.Colors.RED){
			System.out.println("Red");
		}else{
			System.out.println("Other Color");
		}
	}
}
