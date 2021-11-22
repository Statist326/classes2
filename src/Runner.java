import by.epam.lab.Material;
import by.epam.lab.Subject;
public class Runner {
    public static void main(String[] args){
        double mass=0;
        Subject [] subjects = new Subject[1];
        subjects[0]=new Subject("steel",0.03);
        Material [] materials = new Material[2];
        materials[0]=new Material("wire",7850);
        materials[1]=new Material("copper",8500);

                mass = (materials[1].getDensity() * subjects[0].getVolume());
        System.out.println("The wire mass is "+mass);
    }
}
