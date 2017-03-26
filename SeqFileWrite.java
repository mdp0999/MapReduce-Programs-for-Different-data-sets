import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.SequenceFile;
import org.apache.hadoop.io.Text;


public class SeqFileWrite {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Configuration config = new Configuration();
Path path = new Path("/usr/local/hadoop/outputsw25/sample");
		SequenceFile.Writer writer = SequenceFile.createWriter(config, SequenceFile.Writer.file(path), SequenceFile.Writer.keyClass(IntWritable.class), SequenceFile.Writer.valueClass(Text.class));
		IntWritable key = new IntWritable(1);
		Text val = new Text("Have a Good Day");
		writer.append(key, val);
		System.out.println("Finished Writing...");
	}

}
