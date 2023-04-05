package za.ac.cput.domain;

public class Brand {

    private int brandId;

    private String brandName;

    private String model;

    private String color;

    public Brand(){}

    public Brand(Builder builder){
        this.brandId = builder.brandId;
        this.brandName = builder.brandName;
        this.model = builder.model;
        this.color = builder.color;

    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static class Builder{

        private int brandId;

        private String brandName;

        private String model;

        private String color;

        public Builder(){}

        public Brand.Builder setbrandId(int brandId) {
            this.brandId = brandId;
            return this;
        }
        public Brand.Builder setbrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        public Brand.Builder setmodel(String model) {
            this.model = model;
            return this;
        }
        public Brand.Builder setcolor(String color) {
            this.color = color;
            return this;
        }


        public Builder copy (Brand brand){
            this.brandId = brand.brandId;
            this.brandName =brand.brandName;
            this.model = brand.model;
            this.color = brand.color;
            return this;
        }

        public Brand build(){

            return new Brand(this);}
    }

}


