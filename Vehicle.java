public class Vehicle {
    private int mileage;
    private String make;
    private String model;
    private int price;
    private int year;
    private int vin;



    public Vehicle()
    {
        this.mileage = 0;
        this.make = "";
        this.model = "";
        this.year = 0;
        this.price = 0;
        this.vin = 0;
    }

    public Vehicle(int mileage_, String make_, String model_, int price_, int year_, int vin_)
    {
        this.mileage = mileage_;
        this.make = make_;
        this.model = model_;
        this.price = price_;
        this.year = year_;
        this.vin = vin_;
    }

    public int getMileage()
    {
        return mileage;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getYear()
    {
        return year;
    }

    public void setMileage(int mileage_)
    {
        this.mileage = mileage_;
    }
    public void setMake(String make_)
    {
        this.make = make_;
    }
    public void setModel(String model_)
    {
        this.model = model_;
    }
    public void setPrice(int price_)
    {
        this.price = price_;
    }
    public void setYear(int year_)
    {
        this.year = year_;
    }

    public int getVin()
    {
        return this.vin;
    }

    public void setVin(int vin_)
    {
        this.vin = vin_;
    }


    public void showVic()
    {
        System.out.println("New Vehicle: " + this.getYear() + " " + this.getMake() + " " + this.getModel());
        System.out.println("Vehicle VIN: " + this.getVin());
        System.out.println("Vehicle Mileage: " + this.getMileage());
        System.out.println("Current Price: $" + this.getPrice());
    }

}
