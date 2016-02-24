package de.fhms.bl.bde_Uebung6;



import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


/**
 * This class is the Mapper Class. Maps input key/value pairs to a set of intermediate key/value pairs. 
 * @author Ben Lohrengel
 * 
 */
class WordMapper extends Mapper <Text, Text, Text, Text>{

	private Text word = new Text(); //Initiate new Word

	/**
	 *  Called once for each key/value pair in the input split. Receives row from input file and creates a Map of it
	 *  where each key will have one value. 
	 *  Mapper receives KeyValueTextInputFormat.class, as seen in Main.java class. 
	 *  The key is the beginning of each line of the input file till the first space.
	 *  The value is the rest of the line.
	 *  
	 *  For each input in the mapper, the key value pairs are seperated by a ",". 
	 */
	public void map(Text key, Text value,  Context context) throws IOException, InterruptedException{

		String [] values = value.toString().split("\t");//receivces row from input file

		for (int i=0; i<values.length; i++){
			word.set(values[i]);
			context.write(key, word);
		}
	}


}
