package fifteenpuzzle;

import java.io.File;
import java.lang.invoke.MethodHandles;

public class Solver {// the solver will input a board and result in movements
	// piorityQueue;
	public int hashCode(){
		return 0;
	}
	public static int[][] goal;

	public static

	public static void main(String[] args) {
		System.out.println("number of arguments: " + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		if (args.length < 2) {
			System.out.println("File names are not specified");
			System.out.println("usage: java " + MethodHandles.lookup().lookupClass().getName() + " input_file output_file");
			return;
		}
		
		
		// TODO
		//File input = new File(args[0]);
		// solve...
		//File output = new File(args[1]);

	}
}
