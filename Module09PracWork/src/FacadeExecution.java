public class FacadeExecution {
    public static void main(String[] args) {
        HotelFacade hotel = new HotelFacade(new RoomBookingSystem(), new RestrauntSystem(), new EventManagementSystem(), new CleaningServiceSystem());
        hotel.BookRoomWithService(1017, "user", "06.11.2025", null);
        System.out.println("");
        hotel.BookRoomWithCleaning(1024, "user2", "07.11.2025");
        System.out.println("");
        hotel.BookRoomWithImmediateCleaning(1011, "user3", "08.11.2025");
        System.out.println("");
        hotel.EventInRestraunt(1028, 4, "09.11.2025", "Birthday Party", null);
    }
}
