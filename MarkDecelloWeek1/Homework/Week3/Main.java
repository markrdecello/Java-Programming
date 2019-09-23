import packagename.Class1;
import packagename.foobar.Class2;

public class Main{
	
	public static void main(String[] MarkDecello){

		System.out.println("\n\tHello Java Programming Class 2019! This is Homework 3 by Mark Decello!\n");
		Class1 c1 = new Class1();
		c1.WhatsMyFirstName();
		c1.WhatsMyLastName();
		c1.HowOldAmI();
		c1.WhatsMyGender();
		c1.WhatsMySchool();
		
		System.out.println("--------------------------------------------------------------------");
		c1.displayScores();
		c1.WhatsMyTitle();
		c1.WhatsMyBirthMonth();
		c1.GuessMyNumber(29);
		c1.GuessMyLetter('g');
		c1.EndOfClass1();

		Class2 c2 = new Class2();
		c2.StartClass2();
		c2.Equals();
		c2.Integer();
	}
}
