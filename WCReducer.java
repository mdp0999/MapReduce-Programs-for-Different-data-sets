import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class WCReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
public void reduce(Text key , Iterable<IntWritable> values, Context context) throws IOException ,InterruptedException
{
int cnt = 0;
while (values.iterator().hasNext())
{
cnt = cnt + values.iterator().next().get();	
}

	context.write(key , new IntWritable(cnt));

}
}

