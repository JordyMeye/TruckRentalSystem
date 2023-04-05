package za.ac.cput.domain;

public class Truck {
        private int truckId;
        private String model;
        private int year;
        private boolean availability;
        private String licensePlate;
        private int currentMileage;
        private int brandId;

    public Truck() {

    }
    private Truck(Builder builder) {
        this.truckId = builder.truckId;
        this.model = builder.model;
        this.year = builder.year;
        this.availability = builder.availability;
        this.licensePlate = builder.licensePlate;
        this.currentMileage = builder.currentMileage;
        this.brandId = builder.brandId;
    }

    public int getTruckId() {
        return truckId;
    }

    public void setTruckId(int truckId) {
        this.truckId = truckId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getCurrentMileage() {
        return currentMileage;
    }

    public void setCurrentMileage(int currentMileage) {
        this.currentMileage = currentMileage;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "truckId=" + truckId +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", availability=" + availability +
                ", licensePlate='" + licensePlate + '\'' +
                ", currentMileage=" + currentMileage +
                ", brandId=" + brandId +
                '}';
    }

    public static class Builder {
            private int truckId;
            private String model;
            private int year;
            private boolean availability;
            private String licensePlate;
            private int currentMileage;
            private int brandId;

            public Builder(int truckId, String model, int year, boolean availability, String licensePlate,
                           int currentMileage, int brandId) {
                this.truckId = truckId;
                this.model = model;
                this.year = year;
                this.availability = availability;
                this.licensePlate = licensePlate;
                this.currentMileage = currentMileage;
                this.brandId = brandId;
            }

            public Builder setTruckId(int truckId) {
                this.truckId = truckId;
                return this;
            }

            public Builder setModel(String model) {
                this.model = model;
                return this;
            }

            public Builder setYear(int year) {
                this.year = year;
                return this;
            }

            public Builder setAvailability(boolean availability) {
                this.availability = availability;
                return this;
            }

            public Builder setLicensePlate(String licensePlate) {
                this.licensePlate = licensePlate;
                return this;
            }

            public Builder setCurrentMileage(int currentMileage) {
                this.currentMileage = currentMileage;
                return this;
            }

            public Builder setBrandId(int brandId) {
                this.brandId = brandId;
                return this;
            }
        public Builder copy (Truck truck){
            this.truckId = truck.truckId;
            this.model = truck.model;
            this.year = truck.year;
            this.availability = truck.availability;
            this.licensePlate = truck.licensePlate;
            this.currentMileage = truck.currentMileage;
            this.brandId = truck.brandId;
            return this;
        }

            public Truck build() {
                return new Truck(this);
            }
        }



    }


