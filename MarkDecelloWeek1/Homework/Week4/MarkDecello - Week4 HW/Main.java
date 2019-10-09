import guitar.Guitar;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class Main{

	public static void main(String[] args){
		Guitar gc = Guitar.getInstance();

		for(int z = 0; z < Guitar.newGuitar.length; z++){
			gc.CMajShape(z);
		}

		System.out.println("Fret;\t Notes;\t\tChord");
		for(int y = 0; y < Guitar.newGuitar.length; y++){
			System.out.print(gc.CMajShape(y));
			System.out.println("\t" + Guitar.chordIdentifier(Guitar.newGuitar, y));
		}
	
		try {
			FileWriter writer = new FileWriter("CMajShapeChords.txt", true);
			writer.write("Fret;\t Notes;\t\tChord\n");
			for(int a = 0; a < Guitar.newGuitar.length; a++){
				writer.write(gc.CMajShape(a));
				writer.write("\t" + Guitar.chordIdentifier(Guitar.newGuitar, a) + "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("\nNOTE: Output has also been printed into CMajShapeChords.txt");
	}
}
