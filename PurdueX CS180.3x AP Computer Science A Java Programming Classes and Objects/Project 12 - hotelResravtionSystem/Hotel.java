package hotelResravtionSystem;
import java.util.Arrays;

public class Hotel {

	String hotelName;
	int totalRooms;
	Room[] rooms;
	
	Hotel(String hotelName,int totalRooms, int floors){
		this.hotelName = hotelName;
		this.totalRooms = totalRooms;
		rooms = new Room[totalRooms];
		int roomCount =0;
		for(int i=0; i<floors; i++){
			int roomNumber = (100*(i+1))+((totalRooms/floors)-1);
			for(int j=((totalRooms/floors)-1); j>=0; j--){
				if(j == ((totalRooms/floors)-1)){
					rooms[roomCount] = new Room(roomNumber, "suite");
				}
				else if(j < ((totalRooms/floors)-1) && j >= (((totalRooms/floors)-1)-4)){
					rooms[roomCount] = new Room(roomNumber, "single king");
				}
				else{
					rooms[roomCount] = new Room(roomNumber, "double queen");
				}
				roomCount++;
				roomNumber--;
			}
		}
		
	} //End of Constructor
	
	public int getTotalRooms(){
		return totalRooms;
	}
	
	public int getNumberOccupied(){
		int occupiedRooms=0;
		
		for(Room r : rooms){
			
			if (r.getOccupantName() != null){
				occupiedRooms = occupiedRooms+1;
			}
		}
		return occupiedRooms;
	}
	
	public double getOccupancyRate(){
	return Math.round((getNumberOccupied()/(double)totalRooms)*100.0)/100.0;
	}
	
	public boolean rentRoom(String roomType, String customerName, int days){
		
		boolean result = false;
		String[] typeofRooms= {"suite","single king","double queen"};
		for(Room r : rooms){
			if(Arrays.asList(typeofRooms).contains(roomType)){
				if (r.getOccupantName() == null && r.getRoomType().equals(roomType)){
					 result = r.setOccupant(customerName, days);
					 break;
				}
			}
			else{
				if (r.getOccupantName() == null && r.getRoomType().equals("double queen")){
					 result = r.setOccupant(customerName, days);
					 break;
				}
			}
			
		}
		return result;
		
	}
	
	public void advanceDay(){
		for(Room r : rooms){
			if (r.getOccupantName() != null){
				r.advanceDay();
			}
		}
	}
	
	/*public void printRoomDetails(){
		for(Room r : rooms){
			System.out.println(r);
		}
	}*/
	
	public String toString(){
		
		double occupancyPercent = getOccupancyRate()*100;
			
		return hotelName + ": "+ (int)occupancyPercent +"% occupied";
		}
	
	
}
