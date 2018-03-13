import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<EventRoom> eventRooms;


    public Hotel(String name) {
        this.name = name;
        bedrooms = new ArrayList<>();
        eventRooms = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }


    public ArrayList<EventRoom> getEventRooms() {
        return eventRooms;
    }

    public void setBedrooms(ArrayList<Bedroom> newBedrooms) {
        this.bedrooms = newBedrooms;
    }

    public void setEventRooms(ArrayList<EventRoom> newEventRooms) {
        this.eventRooms = newEventRooms;
    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addEventRoom(EventRoom eventRoom) {
        this.eventRooms.add(eventRoom);
    }

    public void checkInGuestsToEventRoom(ArrayList<Guest> guests, EventRoom eventRoom) {
        eventRoom.checkInGuests(guests);
    }

    public ArrayList<Guest> getGuestsCheckedIntoBedroom(int number) {
        Bedroom room = this.findBedRoomByNumber(number);
            if (room != null) {
                return room.getGuests();
        }
        return new ArrayList<>();
    }

    public void checkGuestsIntoBedroom(int number, ArrayList<Guest> guestList) {
        Bedroom room = this.findBedRoomByNumber(number);
        room.checkInGuests(guestList);
    }

    public void checkGuestsIntoBedroomForNumberOfNights(int number, ArrayList<Guest> guestList, int numberOfNights) {
        Bedroom room = this.findBedRoomByNumber(number);
        room.checkInGuestsForNumberOfNights(guestList,numberOfNights);
    }

    public void checkGuestsOutOfBedroom(int number) {
        Bedroom room = this.findBedRoomByNumber(number);
        room.checkOut();
    }

    public ArrayList<Bedroom> getAvailableBedrooms() {
        ArrayList<Bedroom> availableRooms = new ArrayList<Bedroom>();
        for (Bedroom room : bedrooms) {
            if (room.isVacant()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public Bedroom findBedRoomByNumber(int number) {
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.getNumber() == number) {
                return bedroom;
            }
        }
        return null;
    }
}