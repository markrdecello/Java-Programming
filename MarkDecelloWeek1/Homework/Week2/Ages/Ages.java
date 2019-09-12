//Mark Decello
//Homework 2
//Week 2
//Problem 1

public class Ages{

	//An array of ages and cannot be changed due to 'private'
	private int[] mAges = {
		34, 60, 50, 17, 26, 30, 40, 14, 13, 39
	};

	//An array of names 
	private String[] mNames = {
		"Madison", "Stephanie", "Allyson", "Maria", "Michael",
		"Joseph", "Stephen", "Ryan", "Margaret", "Candace"
	};

	//Identifies the oldest person using mNames and mAges
	public void reportOldestPerson(){
		//Declaring empty variables
		int oAges = 0;
		String oNames = "";
		for(int x = 0; x < mAges.length; x++){
			if(mAges[x] > oAges){
				oAges = mAges[x];
				oNames = mNames[x];
			}
		}
		System.out.println("The oldest person is " + oNames + " who is " + oAges + " year(s) old.");
	}

	//Identifies the youngest person using mNames and mAges
	public void reportYoungestPerson(){
		int yAges = 9999;
		String yNames = "";
		for(int y = 0; y < mAges.length; y++){
			if(mAges[y] < yAges){
				yAges = mAges[y];
				yNames = mNames[y];
			}
		}
		System.out.println("The youngest person is " + yNames + " who is " + yAges + " year(s) old.");
	}

	//Identifies the nth oldest person using mNames and mAges
	public void reportNthOldestPerson(int index){
		int nAges;
		String nNames = "";

		//Using for loops to sort mNames and mAges in descending order from oldest to youngest
		for(int z = 1; z < mAges.length; z++){
			for(int i = z; i > 0; i--){
				//if current person is older than previous person, then previous person will be 1st in array
				//1st person in array = mNames[0] && mAge[0]
				//Arrays always start with 0
				if(mAges[i] > mAges[i - 1]){
					//This will now sort the 2 arrays
					nAges = mAges[i];
					nNames = mNames[i];
					mAges[i] = mAges[i - 1];
					mNames[i] = mNames[i - 1];
					mAges[i - 1] = nAges;
					mNames[i - 1] = nNames;
				}
			}
		}
		if(index > 10 || index <= 0){
			System.out.println("[ERROR] You can't choose the " + index + "th oldest. Choose a number between 1-10.");
		}else{
			System.out.println("The number " + (index) + " oldest person is " + mNames[index - 1] + " who is " + mAges[index - 1] + " year(s) old.");
		}
	}

	public static void main(String[] args){
		Ages ages = new Ages();

		ages.reportOldestPerson();
		ages.reportYoungestPerson();
		ages.reportNthOldestPerson(2);
		ages.reportNthOldestPerson(20);
		ages.reportNthOldestPerson(-1);
		ages.reportNthOldestPerson(1);

		System.out.println("\n");

		//Just to double check if sorting is successful
		for(int q = 1; q <= 10; q++){
			ages.reportNthOldestPerson(q);
		}
	}
}
