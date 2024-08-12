package Punto1.DTO;

public class MutableComputer {
    private String brand;
    private String model;
    private int ramSize;
    private int storageSize;
    private String processor;
    private String operatingSystem;

    public MutableComputer() {
    }

    public MutableComputer(String model, String brand,int ramSize, int storageSize,String processor, String operatingSystem) {
        this.model = model;
        this.brand = brand;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "ComputerMutable{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ramSize=" + ramSize +
                ", storageSize=" + storageSize +
                ", processor='" + processor + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }


}
