public class Bus {

    // Important parameters
    private String wheels;
    private String carcass;

    // Secondary parameters
    private boolean PassengerSeats;
    private int PassengerNumber;

    public String getWheels() {
        return wheels;
    }

    public String getCarcass() {
        return carcass;
    }

    public boolean getPassengerNumber() {
        return PassengerSeats;
    }

    public int getPassengerSeats() {
        return PassengerNumber;
    }

    private Bus(BusBuilder builder) {
        this.wheels = builder.wheels;
        this.carcass = builder.carcass;
        this.PassengerSeats = builder.passengerSeats;
        this.PassengerNumber = builder.passengerNumber;
    }

    @Override
    public String toString() {
        return "\n Wheels: " + wheels
                + "\n Carcass: " + carcass
                + "\n Are there passenger seats: " + PassengerSeats
                + "\n Number of passenger seats: " + PassengerNumber;
    }

    // Builder
    public static class BusBuilder {
        // Important parameters
        private String wheels;
        private String carcass;

        // Secondary parameters
        private boolean passengerSeats;
        private int passengerNumber;

        public BusBuilder(String wheels, String carcass) {
            this.wheels = wheels;
            this.carcass = carcass;
        }

        public BusBuilder setIsPassengerSeats(boolean passengerSeats) {
            this.passengerSeats = passengerSeats;
            return this;
        }

        public BusBuilder setPassengerNumber(int passengerNumber) {
            if(passengerSeats == false)
                this.passengerNumber = 0;
            else
                this.passengerNumber = passengerNumber;
            return this;
        }
        public Bus build(){
            return new Bus(this);
        }
    }
}