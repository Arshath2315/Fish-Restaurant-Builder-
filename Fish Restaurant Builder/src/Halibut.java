public class Halibut implements IBuilder{
    Fish fish;

    Halibut(){
        this.fish = new Fish();
    }

    public void setColor(){
        this.fish.setColor("White");
    }
    public void setCooktime(){
        this.fish.setCooktime(40);
    }
    public void setSides(){
        this.fish.setSides(new String[]{"Asparagus","Wine"});
    }

    public void setTaste(){
        this.fish.setTaste("Delicate");
    }
    public void setOcean(){
        this.fish.setOcean("Pacific");
    }

    public Fish getFish(){
        return this.fish;
    }
}
