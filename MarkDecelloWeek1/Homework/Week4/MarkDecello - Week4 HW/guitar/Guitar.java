package guitar;
import java.util.*;

public class Guitar{
	private static Guitar singletonPattern;
	private ArrayList<GuitarString> guitar = null;
   
  	public static Guitar getInstance(){
      		if(singletonPattern == null){
         	singletonPattern = new Guitar();
      		}
      		return singletonPattern;
   	}

	private Guitar(){
		guitar = new ArrayList<GuitarString>();
		guitar.add(new GuitarString("E"));
		guitar.add(new GuitarString("A"));
		guitar.add(new GuitarString("D"));
		guitar.add(new GuitarString("G"));
		guitar.add(new GuitarString("B"));
		guitar.add(new GuitarString("E"));
	}

	public static String[] newGuitar = new String[13];

	public String CMajShape(int barreLocation){
      		if(barreLocation == 0){
         		newGuitar[0] = "0;\t" + guitar.get(1).getFrettedNote(barreLocation + 3) + ", " + guitar.get(2).getFrettedNote(barreLocation + 2) + ", " + guitar.get(3).getFrettedNote(barreLocation) + " ;";
      		}else if(barreLocation == 1){
         		newGuitar[1] = "1;\t" + guitar.get(1).getFrettedNote(barreLocation + 3) + "," + guitar.get(2).getFrettedNote(barreLocation + 2) + ", " + guitar.get(3).getFrettedNote(barreLocation) + ";";
      		}else if(barreLocation == 2){
         		newGuitar[2] = "2;\t" + guitar.get(1).getFrettedNote(barreLocation + 3) + ", " + guitar.get(2).getFrettedNote(barreLocation + 2) + "," + guitar.get(3).getFrettedNote(barreLocation) + " ;";
      		}else if(barreLocation == 3){
         		newGuitar[3] = "3;\t" + guitar.get(1).getFrettedNote(barreLocation + 3) + "," + guitar.get(2).getFrettedNote(barreLocation + 2) + ", " + guitar.get(3).getFrettedNote(barreLocation) + ";";
      		}else if(barreLocation == 4){
         		newGuitar[4] = "4;\t" + guitar.get(1).getFrettedNote(barreLocation + 3) + ", " + guitar.get(2).getFrettedNote(barreLocation + 2) + "," + guitar.get(3).getFrettedNote(barreLocation) + " ;";
      		}else if(barreLocation == 5){
         		newGuitar[5] = "5;\t" + guitar.get(1).getFrettedNote(barreLocation + 3) + ", " + guitar.get(2).getFrettedNote(barreLocation + 2) + ", " + guitar.get(3).getFrettedNote(barreLocation) + " ;";
      		}else if(barreLocation == 6){
         		newGuitar[6] = "6;\t" + guitar.get(1).getFrettedNote(barreLocation + 3) + "," + guitar.get(2).getFrettedNote(barreLocation + 2) + "," + guitar.get(3).getFrettedNote(barreLocation) + ";";
      		}else if(barreLocation == 7){
         		newGuitar[7] = "7;\t" + guitar.get(1).getFrettedNote(barreLocation + 3) + ", " + guitar.get(2).getFrettedNote(barreLocation + 2) + ", " + guitar.get(3).getFrettedNote(barreLocation) + " ;";
      		}else if(barreLocation == 8){
         		newGuitar[8] = "8;\t" + guitar.get(1).getFrettedNote(barreLocation + 3) + "," + guitar.get(2).getFrettedNote(barreLocation + 2) + ", " + guitar.get(3).getFrettedNote(barreLocation) + ";";
      		}else if(barreLocation == 9){
         		newGuitar[9] = "9;\t" + guitar.get(1).getFrettedNote(barreLocation + 3) + ", " + guitar.get(2).getFrettedNote(barreLocation + 2) + "," + guitar.get(3).getFrettedNote(barreLocation) + " ;";
      		}else if(barreLocation == 10){
         		newGuitar[10] = "10;\t" + guitar.get(1).getFrettedNote(barreLocation + 3) + "," + guitar.get(2).getFrettedNote(barreLocation + 2) + ", " + guitar.get(3).getFrettedNote(barreLocation) + " ;";
      		}else if(barreLocation == 11){
         		newGuitar[11] = "11;\t" + guitar.get(1).getFrettedNote(barreLocation + 3) + ", " + guitar.get(2).getFrettedNote(barreLocation + 2) + "," + guitar.get(3).getFrettedNote(barreLocation) + ";";
      		}else if(barreLocation == 12){
         		newGuitar[12] = "12;\t" + guitar.get(1).getFrettedNote(barreLocation + 3) + ", " + guitar.get(2).getFrettedNote(barreLocation + 2) + ", " + guitar.get(3).getFrettedNote(barreLocation) + " ;";
      		}
      		return newGuitar[barreLocation];
	}
   
   	public static String chordIdentifier(String[] notes, int fret){
      		for(int i = 0; i < 13; i++){
         		notes[i] = newGuitar[i];
      		}
      		if ( notes[0].equals(newGuitar[fret])){
			return "C";
      		}else if(notes[1].equals(newGuitar[fret])){
         		return "C#";
      		}else if(notes[2] == newGuitar[fret]){
         		return "D";
      		}else if(notes[3] == newGuitar[fret]){
         		return "D#";
      		}else if(notes[4] == newGuitar[fret]){
         		return "E";
      		}else if(notes[5] == newGuitar[fret]){
         		return "F";
      		}else if(notes[6] == newGuitar[fret]){
         		return "F#";
      		}else if(notes[7] == newGuitar[fret]){
         		return "G";
      		}else if(notes[8] == newGuitar[fret]){
         		return "G#";
      		}else if(notes[9] == newGuitar[fret]){
         		return "A";
      		}else if(notes[10] == newGuitar[fret]){
         		return "A#";
      		}else if(notes[11] == newGuitar[fret]){
         		return "B";
      		}else if(notes[12] == newGuitar[fret]){
         		return "C";
      		}
		return "A"; // or whatever the chord is played with the notes in `notes`.
	}
}

class GuitarString{
	public static String[] Notes = { 
		"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#",
		"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"
	};

	public String stringName;

	GuitarString(String _stringName ){
		stringName = _stringName;
	}

	public String getFrettedNote(int fret){
		return Notes[ArrayIndexOf(Notes, stringName) + fret];
	}

	private static int ArrayIndexOf(String[] notes, String value){
		for(int i = 0; i < notes.length; ++i){
			if ( notes[i] == value){
				return i;
			}
		}
		return -2 * Notes.length; // to ensure an error in the notes array if you try to access an element there.
	}
}
