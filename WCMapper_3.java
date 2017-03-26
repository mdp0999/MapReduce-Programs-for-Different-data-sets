package wordCount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.StringTokenizer;

public class WCMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
public void map(LongWritable key, Text value, Context context) throws IOException , InterruptedException
{
	String line =  value.toString();
	StringTokenizer tokenizer = new StringTokenizer(line);
	
	
	String word = tokenizer.nextToken();
	
	
	
		
	context.write(new Text(word), new IntWritable(1));
	

	
}
}

