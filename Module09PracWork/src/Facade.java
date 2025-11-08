class RoomBookingSystem {
    boolean IsRoomAvailable(int roomNumber, String date) {
        return true;
    };
    public void BookRoom(int roomNumber, String customName, String date){
        System.out.println("Room under number " + roomNumber + " taken by customer " + customName + " on date " + date + ".");
    };
}
class RestrauntSystem {
    public void ReservTables(int number, int numberofperson, String date){
        System.out.println("Table under number " + number + " were reserved for " + numberofperson + " people, on " + date + ".");
    };
    public void OrderFood(String[] dishes){
        if (dishes != null) {
            System.out.println("Ordered food: " + dishes);
        }
        else {
            System.out.println("No food have been ordered.");
        }
    };
}
class EventManagementSystem {
    public void ConferenceHall(int number, String date) {
        System.out.println("Conference hall under number '" + number + "' were ordered on date " + date + ".");
    }
    public void EquipmentRent(String name, String date) {
        System.out.println("Equipment set '" + name + "' were ordered on date " + date + ".");
    }
}
class CleaningServiceSystem {
    public void CleaningTime(String date) {
        System.out.println("Cleaning were set on date " + date);
    }
    public void CleaningProcess(int number) {
        System.out.println("Proceeding to clean room under number " + number);
    }
}


class HotelFacade {
    private RoomBookingSystem _roomBooking;
    private RestrauntSystem _restraunt;
    private EventManagementSystem _eventManagement;
    private CleaningServiceSystem _cleaningService;
    public HotelFacade(RoomBookingSystem _roomBooking, RestrauntSystem _restraunt, EventManagementSystem _eventManagement, CleaningServiceSystem _cleaningService) {
        this._roomBooking = _roomBooking;
        this._restraunt = _restraunt;
        this._eventManagement = _eventManagement;
        this._cleaningService = _cleaningService;
    }

    public void BookRoomWithService(int room, String name, String date, String[] dishes) {
        if (_roomBooking.IsRoomAvailable(room, date)) {
            _roomBooking.BookRoom(room, name, date);
            _restraunt.OrderFood(dishes);
        }
    }
    public void BookRoomWithCleaning(int room, String name, String date) {
        if (_roomBooking.IsRoomAvailable(room, date)) {
            _roomBooking.BookRoom(room, name, date);
            _cleaningService.CleaningTime(date);
        }
    }
    public void BookRoomWithImmediateCleaning(int room, String name, String date) {
        if (_roomBooking.IsRoomAvailable(room, date)) {
            _roomBooking.BookRoom(room, name, date);
            _cleaningService.CleaningProcess(room);
        }
    }
    public void EventInRestraunt(int number, int numberofperson, String date, String equip, String[] dishes) {
        _restraunt.ReservTables(number, numberofperson, date);
        _restraunt.OrderFood(dishes);
        _eventManagement.EquipmentRent(equip, date);
    }
}