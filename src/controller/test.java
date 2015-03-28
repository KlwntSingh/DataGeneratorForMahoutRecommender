package controller;

import java.io.FileWriter;
import java.util.List;

import bean.UserItemData;
import services.DataToCsv;
import services.UserItemDataGenerator;

public class test {
	
	public static void main(String s[]){
		
		UserItemDataGenerator uidg = new UserItemDataGenerator();
		List<UserItemData> list ;
		list = uidg.generateUserItemDataList(900);
		DataToCsv dtc = new DataToCsv("data.csv");
		int count = 0 ;
		FileWriter filewriter= null;
		for(UserItemData single : list){
			System.out.println(count++);
			filewriter = dtc.writeDataToCsv(single);
		}
		try{
			filewriter.flush();
			filewriter.close();
			}
			catch(Exception e){
				
			}
		System.out.print("done");
	}

}
