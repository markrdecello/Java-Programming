import java.util.*;

public class Guitar{
	private ArrayList<GuitarString> guitar = null;

	//Construct a guitar
	Guitar(){
		guitar = new ArrayList<GuitarString>();
		guitar.add(new GuitarString("E"));
		guitar.add(new GuitarString("A"));
		guitar.add(new GuitarString("D"));
		guitar.add(new GuitarString("G"));
		guitar.add(new GuitarString("B"));
		guitar.add(new GuitarString("E"));
	}

	public void CMajShape(int barreLocation){
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println(" At fret " + barreLocation + " the Cmaj shape plays : ");
		System.out.println("A string : " + guitar.get(1).getFrettedNote(barreLocation + 3));
		System.out.println("D string : " + guitar.get(2).getFrettedNote(barreLocation + 2));
		System.out.println("G string : " + guitar.get(3).getFrettedNote(barreLocation + 0));
		System.out.println("B string : " + guitar.get(4).getFrettedNote(barreLocation + 1));
		System.out.println("E string : " + guitar.get(5).getFrettedNote(barreLocation + 0));
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}

	public static void main(String[] args){
		Guitar g = new Guitar();
		g.CMajShape(0);
		g.CMajShape(2);
		g.CMajShape(5);
		g.CMajShape(7);
		g.CMajShape(9);
	}
}

class GuitarString{
	public static String[] Notes = {
		"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#",
		"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"		
	};

	public String stringName;

	GuitarString(String _stringname){
		stringName = _stringname;
	}

	public String getFrettedNote(int fret){ 
		return Notes[ArrayIndexOf(Notes, stringName) + fret];
	}

	private static int ArrayIndexOf(String[] notes, String value){
		for(int i = 0; i < notes.length; ++i){
			if(notes[i] == value){
				return i;
			}
		}
		//return an error message
		return -1;
	}
}
