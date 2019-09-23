import packagename.Class1;
import packagename.foobar.Class2;

public class Main{

	public enum Numbers{
		ONE,
		TWO,
		THREE,
		FOUR,
		FIVE,
		SIX,
		SEVEN,
		EIGHT,
		NINE,
		TEN	
	};

	public Numbers myNumber = Numbers.NINE;
	
	public static void main(String[] MarkDecello){

		int i = 1;
		byte b = (byte) 2;
		short s = 3;
		long l = 4;
		float f = 5.0f;
		double d = 6.00;
		boolean boo = false;
		char ch = 'M';

		System.out.println("\n\tHello Java Programming Class 2019! This is Homework 3 by Mark Decello!\n");

		System.out.println("Printing all primitive data types... ");
		System.out.println("\t" + i + ", " + b + ", " + s + ", " + l + ", " + f + ", " + d + ", " + boo + ", and " + ch);

		Main m = new Main();
		if (m.myNumber == Main.Numbers.ONE){
			System.out.println("Enum is 1");	
		}else if(m.myNumber == Main.Numbers.TWO){
			System.out.println("Enum is 2");
		}else if(m.myNumber == Main.Numbers.THREE){
			System.out.println("Enum is 3");
		}else if(m.myNumber == Main.Numbers.FOUR){
			System.out.println("Enum is 4");
		}else if(m.myNumber == Main.Numbers.FIVE){
			System.out.println("Enum is 5");
		}else if(m.myNumber == Main.Numbers.SIX){
			System.out.println("Enum is 6");
		}else if(m.myNumber == Main.Numbers.SEVEN){
			System.out.println("Enum is 7");
		}else if(m.myNumber == Main.Numbers.EIGHT){
			System.out.println("Enum is 8");
		}else if(m.myNumber == Main.Numbers.NINE){
			System.out.println("Enum is 9");
		}else if(m.myNumber == Main.Numbers.TEN){
			System.out.println("Enum is 10");
		}else{
			System.out.println("Other number");
		}

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
		c2.WhileLoop();
		int birthYear = c2.WhatYearAmIBorn();
		System.out.println("BIRTH YEAR: " + birthYear);
		c2.DisplayAlphabet();
		c2.GuessMyFavoriteAnime();
		c2.WhatsMyFavoriteAnimal();

		System.out.println("Which place would you like to visit?");
		String visit = "Japan";
		switch(visit){
			case "California":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Florida":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Chicago":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Mississippi":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Canada":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Texas":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "West Virginia":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "New York":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "New Jersey":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Pennsylvania":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Delaware":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Morocco":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Alaska":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Arizona":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Denmark":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Korea":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "China":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Taiwan":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Thailand":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Vietnam":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "India":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Philippines":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Germany":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Italy":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Russia":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Nigeria":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Antartica":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "North Pole":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "London":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Turkey":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Kentucky":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Ukraine":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Greenland":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Iceland":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Mexico":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Bahamas":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Disney World":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Disney Land":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Columbia":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Puerto Rico":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Dominican Republic":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Jamaica":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Washington DC":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Philadelphia":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Alabama":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Arkansas":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Colorado":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Connecticut":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Georgia":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Illinois":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Indiana":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Iowa":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Kansas":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Louisiana":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Maryland":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Maine":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Minnesota":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Missouri":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Montana":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Nebraska":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Nevada":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "New Hampshire":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "North Dakota":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "North Carolina":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Ohio":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Oklahoma":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Oregon":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Rhode Island":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "South Carolina":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Utah":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Vermont":
				System.out.println("Thats a nice place to visit,");
				System.out.println("But that's not the correct location.");
				System.out.println("Please Try Again");
				System.out.println("You'll never know if the next one is correct!");
				break;
			case "Japan":
				System.out.println("You got the location right!");
				break;
			default:
				System.out.println("Try again");
		}
	}
}
