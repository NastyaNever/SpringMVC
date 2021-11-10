package web.model;

public class Car {
    private int id;
    private String model;
    private String year;

    public Car(int id, String model, String year) {
        this.id = id;
        this.model = model;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getyear() {
        return year;
    }

    public void setyear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car " +
                "id=" + id +
                ", model='" + model + '\'' +
                ", year='" + year;
    }
}
