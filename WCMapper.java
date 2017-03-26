package wordCount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.StringTokenizer;

public class WCMapper extends Mapper<LongWritable, Text, TextPair, IntWritable> {
public void map(LongWritable key, Text value, Context context) throws IOException , InterruptedException
{
	String line =  value.toString();
	String words[] =line.split(" ");
	
	for(int i = 0 ; i<= words.length -2; i++)
	{
		//String word = words[i] + " " +  words[i+1];
		
		TextPair tp = new TextPair(words[i], words[i+1]);
		context.write(tp, new IntWritable(1));
	}

	
}
}
