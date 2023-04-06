package za.ac.cput.domain;

public class Location {

    private int LocationId;
    private String name;
    private String address;


    private Location() {
    }

    public Location(Builder builder) {
        this.LocationId = builder.LocationId;
        this.name = builder.name;
        this.address = builder.address;
    }

        public int getLocationId() {
            return LocationId;
        }

        public void setLocationId ( int locationId){
            LocationId = locationId;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getAddress () {
            return address;
        }

        public void setAddress (String address){
            this.address = address;
        }

    @Override
    public String toString() {
            return "Location{" +
                    "LocationId=" + LocationId +
                    ", name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }

    public static class Builder{

        private int LocationId;

        private String name;

        private String address;

        public Builder(){}


        public Location.Builder setLocationId(int LocationId) {
            this.LocationId = LocationId;
            return this;
        }
        public Location.Builder setname(String name) {
            this.name = name;
            return this;
        }

        public Location.Builder setaddress(String address) {
            this.address = address;
            return this;
        }

        public Builder copy (Location location){
            this.LocationId = location.LocationId;
            this.name = location.name;
            this.address = location.address;
            return this;
        }

        public Location build(){

                return new Location(this);}
            }
        }
















