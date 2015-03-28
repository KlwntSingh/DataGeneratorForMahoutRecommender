package bean;

public class UserItemData {
	
	String UserIdentifier;
	public String getUserIdentifier() {
		return UserIdentifier;
	}
	public void setUserIdentifier(String userIdentifier) {
		UserIdentifier = userIdentifier;
	}
	public String getItemIdentifier() {
		return ItemIdentifier;
	}
	public void setItemIdentifier(String itemIdentifier) {
		ItemIdentifier = itemIdentifier;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	String ItemIdentifier;
	float rating;

}
