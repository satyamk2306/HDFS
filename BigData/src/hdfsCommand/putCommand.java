package hdfsCommand;
import java.io.IOException; 
import java.net.URI;   
import org.apache.hadoop.fs.Path; 
import org.apache.hadoop.conf.Configuration; 
import org.apache.hadoop.fs.FileSystem;


public class putCommand {
	  	 		 		 		 		 	  

	public static void main(String[] args) throws IOException {  		
		Configuration conf = new Configuration(); 		
		String uri = "hdfs://nameservice1/"; 		 		
		FileSystem fs = FileSystem.get(URI.create(uri),conf); 		 		
		String localpath = "Satyam.pdf"; 		
		String hdfspath = "satyambigdata/"; 		 		
		fs.copyFromLocalFile(new Path(localpath), new Path(hdfspath)); 	
	}

}
