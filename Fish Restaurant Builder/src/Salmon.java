public class Salmon implements IBuilder{

    Fish fish;

    Salmon(){
        this.fish = new Fish();
    }

    public void setColor(){
        this.fish.setColor("Pink");
    }
    public void setCooktime(){
        this.fish.setCooktime(30);
    }
    public void setSides(){
        this.fish.setSides(new String[]{"Asparagus","Mash Potatoes"});
    }

    public void setTaste(){
        this.fish.setTaste("Soft");
    }
    public void setOcean(){
        this.fish.setOcean("N/a");
    }

    public Fish getFish(){
        return this.fish;
    }

}
