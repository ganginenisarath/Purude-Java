package hotelResravtionSystem;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel h = new Hotel("The Purdue Memorial Union Hotel",8,1);
		//h.printRoomDetails();
				//System.out.println(h.rentRoom("double queen","Sarath", 1));
				System.out.println(h.rentRoom("sui","Sarathg ", 4));
				//System.out.println(h.rentRoom("double queen","Sarath", 1));
						//System.out.println(h.rentRoom("single king","Sarath2", 10));
				//h.printRoomDetails();
				System.out.println(h.getOccupancyRate());
				System.out.println(h); //String Occupancy rate
						//System.out.println(h.getNumberOccupied());
						//h.advanceDay();
						//h.advanceDay();
				System.out.println(h.getNumberOccupied());
	}

}
