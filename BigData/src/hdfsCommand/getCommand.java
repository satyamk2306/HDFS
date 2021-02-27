package hdfsCommand;

import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class getCommand {

	public static void main(String[] args) throws IOException {
		//creating new configuration object 
		Configuration conf = new Configuration();
		
		//Declaring my URI path
		String uri = "hdfs://nameservice1";
		
		//creating new file path 
		FileSystem fs = FileSystem.get(URI.create(uri), conf);
		
		//declaring paths of file
		String srcpath = "satyambigdata";
		String despath = "abc/";
		
		//Fetching the data 
		fs.copyToLocalFile(new Path(srcpath), new Path(despath));

	}

}
