package by.epam.lab;

public class Material {
    private String name;
    public double density;

    public Material(){

    }
    public Material(String name,double density){
        this.name=name;
        this.density=density;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDensity(double density){
        this.density=density;
    }
    public double getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return (name+";"+density);
    }
}
