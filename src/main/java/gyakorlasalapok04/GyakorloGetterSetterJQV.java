package gyakorlasalapok04;

public class GyakorloGetterSetterJQV {
    private String name = "Béla";

    public void writeMyName(){
        System.out.println("Az én nevem " + this.name);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String incoming){
        this.name = incoming;
    }

}
