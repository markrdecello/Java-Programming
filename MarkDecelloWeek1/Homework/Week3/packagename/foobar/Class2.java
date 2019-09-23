package packagename.foobar;

public class Class2{
	
	public void StartClass2(){
		System.out.println("------------------------------------------------------------------");
		System.out.println("Let's Start Class 2!");
	}

	public void Equals(){
		Float f1 = new Float(29.00);
		Byte b1 = new Byte((byte) 29);

		boolean f1Eqb1 = f1.equals(b1);
		System.out.println("f1 = b1? " + f1Eqb1);
	}

	public void Integer(){
		Integer i = new Integer(10);
		byte b2 = i.byteValue();
	       	System.out.println("Byte value of i is " + String.valueOf(b2));
		float f2 = i.floatValue();
		System.out.println("Float value of i is " + String.valueOf(f2));	
	}

	public void WhileLoop(){
		int i = 10;
		while(i > 1){
			i--;
			System.out.print(i + ", ");
		}
		System.out.print("\n");
	}

	public int WhatYearAmIBorn(){
		return 1995;
	}

	private char[] Alphabet = new char[]{
		'a',
		'b',
		'c',
		'd',
		'e',
		'f',
		'g',
		'h',
		'i',
		'j',
		'k',
		'l',
		'm',
		'n',
		'o',
		'p',
		'q',
		'r',
		's',
		't',
		'u',
		'v',
		'w',
		'x',
		'y',
		'z'
	};

	public void DisplayAlphabet(){
		System.out.println("Displaying Alphabet... ");
		for(int a = 0; a < 26; a++){
			char b = Alphabet[a];
			System.out.print(b + ", ");
		}
		System.out.print("\n");
	}

	public void GuessMyFavoriteAnime(){
		String anime = "MHA";
		switch(anime){
			case "Naruto":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Naruto Shippuden":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Dragon Ball":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Dragon Ball Z":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Dragon Ball GT":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Dragon Ball Super":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Boruto":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Death Note":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Akame Ga Kill":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Kill La Kill":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "The Seven Deadly Sins":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Tokyo Ghoul":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Attack On Titan":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Sword Art Online":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Infinite Stratos":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "JoJo's Bizarre Adventure":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Samurai Champloo":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Inuyasha":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "KissXSis":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Danmachi":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Pokemon":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Mobile Suit Gundam":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "HunterXHunter":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Yu-Gi-Oh":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Zatch Bell":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Beyblade":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Inizuma Eleven":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Tsuritama":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Bobobobobobo":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "One Piece":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Rurouni Kenshin":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "One Punch Man":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Parasyte":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Blue Exorcist":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Deadman Wonderland":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Gurren Lagann":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Prince of Tennis":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "MAR":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Duel Masters":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Angel Beats":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Blood Lad":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "No Game No Life":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Chobits":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Golden Boy":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Shokugeki no Soma":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Naruto SD":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Another":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Mob Psycho 100":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "My Love Story!!":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Haikyuu":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Digimon":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Your Name":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "A Silent Voice":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Black Butler":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "5 Centimeters Per Second":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Spirited Away":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Hi Score Girl":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "My Neighbor Totoro":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Summer Wars":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Flavors of Youth":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "Dr. Stone":
				System.out.println("I like it, but not my number 1 Anime");
				break;	
			case "Black Clover":
				System.out.println("I like it, but not my number 1 Anime");
				break;
			case "MHA":
				System.out.println("You got it right!");
				break;
			default:
				System.out.println("Keep trying!");
		}
	}

	public void WhatsMyFavoriteAnimal(){
		String myAnimal = "tiger";
		if(myAnimal.equals("shark")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again!");
		}else if(myAnimal.equals("zebra")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("horse")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("pony")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("lion")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("gorilla")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("godzilla")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("monkey")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("bunny")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("rabbit")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("dog")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("cat")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("snake")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("spider")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("ant")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("bee")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("bat")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("wasp")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("liger")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("viper")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("cobra")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("mouse")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("fox")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("wolf")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("falcon")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("bird")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("eagle")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("hawk")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("chicken")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("turkey")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("flamingo")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("alpaca")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("llama")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("robin")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("fish")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("whale")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("seal")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("salmon")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("dolphin")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("penguin")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("turtle")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("dragon")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("walrus")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("scorpion")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("roach")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("octopus")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("squid")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("clown fish")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("mackarel")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("swordfish")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("bison")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("cow")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("sheep")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("lamb")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("cricket")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("panda")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("bear")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("polar bear")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("black bear")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("crab")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("squid")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("sea urchin")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("cheetah")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("jaguar")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("husky")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("hyeena")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("grasshopper")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("hamster")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("giraffe")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("tarantula")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("black widow")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("panther")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("owl")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else if(myAnimal.equals("tiger")){
			System.out.println("You are correct!");
			System.out.println("That's my favorite animal!");
		}else if(myAnimal.equals("elephant")){
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Try again");
		}else{
			System.out.println("Sorry, not my favorite animal");
			System.out.println("Keep trying!");
		}
	}

}
