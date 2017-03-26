package wordCount;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;


@SuppressWarnings("rawtypes")
public class TextPair implements WritableComparable {

	Text first;
	Text second;
	
public TextPair() {
		
		this.first = new Text();
		this.second = new Text();
	}
	
	public TextPair(Text first, Text second) {
		
		this.first = first;
		this.second = second;
	}
	
public TextPair(String first, String second) {
		
		this.first = new Text(first);
		this.second = new Text(second);
	}



	public Text getFirst() {
	return first;
}

public void setFirst(Text first) {
	this.first = first;
}

public Text getSecond() {
	return second;
}

public void setSecond(Text second) {
	this.second = second;
}

	@Override
	public void readFields(DataInput arg0) throws IOException {
		// TODO Auto-generated method stub
		first.readFields(arg0);
		second.readFields(arg0);
	}

	@Override
	public void write(DataOutput arg0) throws IOException {
		// TODO Auto-generated method stub
		first.write(arg0);
		second.write(arg0);
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		TextPair tp = (TextPair)arg0;
		int cmp = first.compareTo(tp.first);
		if (cmp != 0)
			return cmp;
		return second.compareTo(tp.second);
	
		
	}

	@Override
	public String toString() {
		return  first + " " + second ;
	}

	
}
