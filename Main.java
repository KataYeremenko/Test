public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus.BusBuilder("right", "MercedesBenzO405").
                setIsPassengerSeats(true).setPassengerNumber(100).build();
        System.out.println(bus);
    }
}