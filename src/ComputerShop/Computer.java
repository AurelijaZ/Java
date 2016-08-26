package ComputerShop;

/**
 * Created by student on 26-Aug-16.
 */
public class Computer {
    private String brandModel;
    private String cpuType;
    private String cpuSpeed;
    private String hardDrive;
    private String graphics;
    private String battery;
    private short ram;
    private double price;

    Computer() {}

    public Computer (String brandModel, String cpuType, String cpuSpeed, String hardDrive, String graphics,
                     String battery, short ram, double price)

    {
        this.brandModel = brandModel;
        this.cpuType = cpuType;
        this.cpuSpeed = cpuSpeed;
        this.hardDrive = hardDrive;
        this.graphics = graphics;
        this.battery = battery;
        this.ram = ram;
        this.price = price;

    }

    public String getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public String getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(String cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public short getRam() {
        return ram;
    }

    public void setRam(short ram) {
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Computer Model: %s  CPU Type:%s CPU Speed: %s Hard Drive: %s  Graphics: %s " +
                "Battery Life: %s  RAM: %s  Price: %s", this.brandModel,  this.cpuType,  this.cpuSpeed,
                this.hardDrive,  this.graphics, this.battery, this.ram,  this.price);
}
}
