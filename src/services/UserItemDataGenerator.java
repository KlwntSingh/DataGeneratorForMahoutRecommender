package services;

import java.util.ArrayList;
import java.util.List;

import bean.UserItemData;

public class UserItemDataGenerator {
	
	int MAX_USERS = 100;
	int MAX_ITEMS = 33;
	int MAX_RATING = 5;
	
	public List<UserItemData> generateUserItemDataList(int number){
		
		ArrayList<UserItemData> listOfObject = new ArrayList<UserItemData>();
		for(int i=0;i<number;i++){
			UserItemData data = new UserItemData();
			data.setUserIdentifier(("userid"+i%MAX_USERS+1+"@gmail.com"));
			data.setItemIdentifier("GL5BKLE8ST1CDYDJ"+(i%MAX_ITEMS+1));
			data.setRating(i%MAX_RATING+1);
			listOfObject.add(data);
		}
		return listOfObject;
	}

}
