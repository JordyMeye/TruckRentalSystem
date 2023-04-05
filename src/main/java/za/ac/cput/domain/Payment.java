// Payment.Domain.java
// POJO for the Payment Class
// Author: Sobantu Malotana (220472122)
// Date: 04 April 2023

package za.ac.cput.domain;

public class Payment {
    private int paymentId;
    private double paymentAmount;
    private String paymentMethod;
    private String paymentDate;

    private Payment(){}

    public Payment(Builder builder) {
        this.paymentId = builder.paymentId;
        this.paymentAmount = builder.paymentAmount;
        this.paymentMethod = builder.paymentMethod;
        this.paymentDate = builder.paymentDate;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", paymentAmount=" + paymentAmount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentDate='" + paymentDate + '\'' +
                '}';
    }

    public static class Builder {

        private int paymentId;
        private double paymentAmount;
        private String paymentMethod;
        private String paymentDate;



        public Builder setpaymentId(int paymentId) {
            this.paymentId = paymentId;
            return this;
        }
        public Builder setpaymentAmount(double paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Builder setpaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }
        public Builder setpaymentDate(String paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }
        public Builder copy (Payment payment){
            this.paymentId = payment.paymentId;
            this.paymentAmount = payment.paymentAmount;
            this.paymentMethod = payment.paymentMethod;
            this.paymentDate = payment.paymentDate;
            return this;
        }

        public Payment build(){
            return new Payment(this);
        }
    }

}
