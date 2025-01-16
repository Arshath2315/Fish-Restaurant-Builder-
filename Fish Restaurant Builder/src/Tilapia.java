public class Tilapia implements IBuilder{
    Fish fish;

    Tilapia(){
        this.fish = new Fish();
    }

    public void setColor(){
        this.fish.setColor("Blue");
    }
    public void setCooktime(){
        this.fish.setCooktime(20);
    }
    public void setSides(){
        this.fish.setSides(new String[]{"Asparagus","Cauliflower"});
    }

    public void setTaste(){
        this.fish.setTaste("Moist");
    }
    public void setOcean(){
        this.fish.setOcean("N/a");
    }

    public Fish getFish(){
        return this.fish;
    }
}
