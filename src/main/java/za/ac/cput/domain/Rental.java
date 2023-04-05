// Rental.Domain.java
// POJO for the Rental Class
// Author: Sobantu Malotana (220472122)
// Date: 04 April 2023

package za.ac.cput.domain;
public class Rental {
    private int rentalId;
    private int customerId;
    private int truckId;
    private String startDate;
    private String endDate;
    private int rentalCost;

    private Rental() {
    }
    public Rental (Builder builder) {
        this.rentalId = builder.rentalId;
        this.customerId = builder.customerId;
        this.truckId = builder.truckId;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.rentalCost = builder.rentalCost;
    }

    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getTruckId() {
        return truckId;
    }

    public void setTruckId(int truckId) {
        this.truckId = truckId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public int getRentalCost() {
        return rentalCost;
    }
    public void setRentalCost(int rentalCost) {
        this.rentalCost = rentalCost;
    }
    @Override
    public String toString() {
        return "Rental{" +
                "rentalId=" + rentalId +
                ", customerId=" + customerId +
                ", truckId=" + truckId +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", rentalCost=" + rentalCost +
                '}';
    }
    public static class Builder {
        private int rentalId;
        private int customerId;
        private int truckId;
        private String startDate;
        private String endDate;
        private int rentalCost;

        public Builder setrentalId(int rentalId) {
            this.rentalId = rentalId;
            return this;
        }
        public Builder setcustomerId(int customerId) {
            this.customerId = customerId;
            return this;
        }
        public Builder settruckId(int truckId) {
            this.truckId = truckId;
            return this;
        }
        public Builder setstartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public Builder setendDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder setrentalCost(int rentalCost) {
            this.rentalCost = rentalCost;
            return this;
        }
        public Builder copy(Rental rental) {
            this.rentalId = rental.rentalId;
            this.customerId = rental.customerId;
            this.truckId = rental.truckId;
            this.startDate = rental.startDate;
            this.endDate = rental.endDate;
            this.rentalCost = rental.rentalCost;
            return this;
        }
        public Rental build(){
            return  new Rental(this);}
    }
}

