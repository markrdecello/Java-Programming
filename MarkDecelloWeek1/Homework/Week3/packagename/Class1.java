package packagename;

public class Class1{
	
	public void WhatsMyFirstName(){
		String firstName = "Mark";
		System.out.println("FIRST NAME: " + firstName);
	}

	public void WhatsMyLastName(){
		String lastName = "Decello";
		System.out.println("LAST NAME: " + lastName);
	}

	public void HowOldAmI(){
		int myAge = 23;
		System.out.println("AGE: " + myAge);
	}

	public void WhatsMyGender(){
		String gender = "Male";
		System.out.println("GENDER: " + gender);
	}

	public void WhatsMySchool(){
		String schoolName = "NJCU";
		System.out.println("COLLEGE: " + schoolName);
	}

	private int[] myTestScores = new int[]{
		100,
		95,
		100,
		100,
		99,
		100,
		98	
	};

	public void displayScores(){
		System.out.println("Displaying scores... ");
		System.out.println("Here are your scores: ");
		for(int scores = 0; scores < 7; scores++){
			int test = myTestScores[scores];
			System.out.println("\t" + test + ", ");
		}
		System.out.println("Congratulations! Your test scores are amazing!");
	}

	public void WhatsMyTitle(){
		String title = "student";
		boolean answer = true;
		if(title.equals("student")){
			answer = true;
			System.out.println("TITLE: " + title);
		} else{
			answer = false;
			System.out.println("You are not a student");
		}
	}

	public void WhatsMyBirthMonth(){
		int birthMonth = 10;
		System.out.print("BIRTH MONTH: ");
		switch(birthMonth){
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5: 
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
			default:
				System.out.println("Please enter a number from 1 to 12");
		}
	}

	public void GuessMyNumber(int number){
		int myNumber = number;
		if(myNumber == 1){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 2){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 3){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 4){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 5){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 6){
			System.out.println("Not my number");
			System.out.println("Try Again");
		}else if(myNumber == 8){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 9){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 10){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 11){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 12){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 13){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 14){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 15){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 16){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 17){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 18){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 19){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 20){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 21){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 22){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 23){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 24){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 25){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 26){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 27){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 28){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 29){
			System.out.println("Congratulations!");
			System.out.println("You guessed my number correctly!");
		}else if(myNumber == 30){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 31){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 32){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 33){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 34){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 35){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 36){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 37){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 38){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 39){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 40){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 41){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 42){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 43){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 44){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 45){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 46){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 47){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 48){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 49){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 50){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 51){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 52){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 53){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 54){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 55){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 56){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 57){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 58){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 59){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 60){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 61){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 62){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 63){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 64){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 65){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 66){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 67){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 68){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 69){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 70){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 71){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 72){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 73){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 74){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 75){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 76){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 77){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 78){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 79){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 80){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 81){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 82){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 83){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 84){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 85){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 86){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 87){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 88){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 89){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 90){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 91){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 92){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 93){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 94){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 95){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 96){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 97){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 98){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else if(myNumber == 99){
			System.out.println("Not my number");
			System.out.println("Try again");
		}else{
			System.out.println("Not my number");
			System.out.println("Keep trying!");
		}
	}

	public void GuessMyLetter(char letter){
		char myLetter = letter;
		if(myLetter == 'a'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'b'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'c'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'd'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'e'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'f'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'g'){
			System.out.println("Congratulations");
			System.out.println("You guessed my letter correctly!");
		}else if(myLetter == 'h'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'i'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'j'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'k'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'l'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'm'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'n'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'o'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'p'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'q'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'r'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 's'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 't'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'u'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'v'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'w'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'x'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'y'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else if(myLetter == 'z'){
			System.out.println("Sorry, not my letter");
			System.out.println("Please, try once more");
		}else{
			System.out.println("Sorry, not my letter");
			System.out.println("Keep trying");
		}
	}

	public void EndOfClass1(){
		System.out.print("Hello");
		System.out.print(" This");
		System.out.print(" Is");
		System.out.print(" The");
		System.out.print(" Last");
		System.out.print(" Of");
		System.out.print(" Class1");
		System.out.println(" Let's move on to the next package!");
	}
}

