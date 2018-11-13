import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class fileWriter2D {
	private File output;
	public fileWriter2D(String [][] input) {	
		try {
			output = new File("output.txt");
			StringBuilder builder = new StringBuilder();
			int[] columnWidth = getColumnWidth(input);
			for(int i = 0; i < 5; i++)//for each row
			{
				for(int j = 0; j < input[0].length; j++)//for each column
				{
					String output = String.format("%" + columnWidth[j] +"s",input[i][j]);
					builder.append(output +" ");//append to the output string
				}
				builder.append("\n");//append new line at the end of the row
			}	
			BufferedWriter writer = new BufferedWriter(new FileWriter(output));
			writer.write(builder.toString());//save the string representation of the board
			writer.close();
		}
		catch(Exception e ) {
		
		}
	}
	
	private int[] getColumnWidth(String[][] input){
		int[] columnWidth = new int [input[0].length];
		for(int i = 0; i <input.length;i++){
			for (int j = 0; j < input[0].length; j++){
				if (input[i][j].length > columnWidth[j]){
					columnWidth[j] = input[i][j].length;
				}
			}
		}
	}
	
	public File getFile() {
		return output;
	}	
}
