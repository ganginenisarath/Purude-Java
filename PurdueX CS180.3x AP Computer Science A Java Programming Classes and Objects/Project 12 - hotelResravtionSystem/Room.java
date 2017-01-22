package hotelResravtionSystem;

import java.util.Arrays;

public class Room {
	private int roomNumber;
	private int daysRented;
	private String roomType;	
	private String occupantName;
	
	Room(int roomNumber, String roomType){
		 this.roomNumber = roomNumber;
		 daysRented =0;
		 occupantName = null;
		 this.roomType = roomType;
		 Arrays.asList();
	}
	
	public int  getRoomNumber(){
		return roomNumber;
	}
	public int  getDaysRented(){
		return daysRented;
	}
	public String  getRoomType(){
		return roomType;
	}
	public String  getOccupantName(){
		return occupantName;
	}
	
	public boolean setOccupant(String occupantName, int numberOfDays){
		
		if(this.occupantName == null){
			this.occupantName = occupantName;
			daysRented = numberOfDays;
			return true;
		}
		else{
			return false;
		}
	}
	
	public void advanceDay(){
		
		this.daysRented = this.daysRented -1;
		
		if(this.daysRented <= 0){
			this.occupantName = null;
			this.daysRented = 0;
		}
		System.out.println(this.occupantName+this.daysRented);
	}
	public String toString(){
		
		String occupancyStatus;
		if(this.occupantName == null){
			occupancyStatus = "free";
		}
		else{
			occupancyStatus = "rented";
		}
		return "Room "+roomNumber + ": "+ roomType + " - "+ occupancyStatus;
	}
}

