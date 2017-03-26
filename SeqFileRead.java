import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.SequenceFile;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.util.ReflectionUtils;


public class SeqFileRead {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Configuration config = new Configuration();
Path path = new Path("/usr/local/hadoop/outputsw25/sample");
SequenceFile.Reader reader = new SequenceFile.Reader(config, SequenceFile.Reader.file(path));
//Class key = reader.getKeyClass();
Writable key  = (Writable)ReflectionUtils.newInstance(reader.getKeyClass(), config);
Writable val  = (Writable)ReflectionUtils.newInstance(reader.getValueClass(), config);

reader.next(key, val);

System.out.println("Key " + key + " Value " + val);


}
}