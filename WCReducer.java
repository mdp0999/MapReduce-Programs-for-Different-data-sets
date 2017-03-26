package wordCount;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class WCReducer extends Reducer<TextPair, IntWritable, Text, IntWritable> {

	
	public void reduce(TextPair key, Iterable<IntWritable> values, Context context) throws IOException , InterruptedException
	{
		int sum = 0;
		while(values.iterator().hasNext())
		{
			sum = sum + values.iterator().next().get();
			
		}
		Text keynow = new Text(key.toString());
		context.write(keynow, new IntWritable(sum));
		
	}
}
