package by.epam.lab;
public class Subject {
    private String name;
    private double volume;
    private Material material;
    public Subject(){

    }
    public Subject(String name,double volume){
        this.name=name;
        this.material= new Material();
        this.volume=volume;
    }


    public String getName(){
        return name;
    }
    public double getVolume(){
        return volume;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setVolume(double volume){
        this.volume=volume;
    }
    public double getMass(){
    return volume* material.getDensity();
    }

    @Override
    public String toString() {
        return this.name+";"+material.toString()+";"+this.volume+";"+getMass();
    }
}
