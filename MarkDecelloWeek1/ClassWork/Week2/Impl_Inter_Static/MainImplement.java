public class MainImplement{
	public static void main(String[] args){
		//Can also be IFace impl = new Implementation();
		//Doesn't have to be the same name
		Implementation impl = new Implementation();
		System.out.println(impl.whoAmI());
	}
}
