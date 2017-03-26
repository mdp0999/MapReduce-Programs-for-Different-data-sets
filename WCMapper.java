import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WCMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
public void map(LongWritable key, Text value, Context context) throws IOException , InterruptedException
{
	String line = value.toString();
	StringTokenizer sentence = new StringTokenizer(line);
	while(sentence.hasMoreTokens())
	{
		String word = sentence.nextToken();
		context.write(new Text(word), new IntWritable(1));
	}
	
}
}

