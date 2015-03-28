package services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import bean.UserItemData;

public class DataToCsv {
	
	FileWriter filewriter = null;
	 private static final String COMMA_DELIMITER = ",";
	 private static final String NEW_LINE_SEPARATOR = "\n";
	 private static final String FILE_HEADER = "userId,ItemId,Rating";
	
	public DataToCsv(String fileName){
		try {
			filewriter = new FileWriter(new File(fileName));
			//filewriter.append(FILE_HEADER.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public FileWriter writeDataToCsv(UserItemData data){
		try{
			filewriter.append(String.valueOf(data.getUserIdentifier()));
			filewriter.append(COMMA_DELIMITER.toString());
			filewriter.append(String.valueOf(data.getItemIdentifier()));
			filewriter.append(COMMA_DELIMITER.toString());
			filewriter.append(String.valueOf(data.getRating()));
			filewriter.append(NEW_LINE_SEPARATOR.toString());
			//filewriter.append(COMMA_DELIMITER.toLowerCase());
		}
		catch(Exception e){
			
		}
//		finally{
//			try{
//			filewriter.flush();
//			filewriter.close();
//			}
//			catch(Exception e){
//				
//			}
//		}
		return filewriter;
	}

}
