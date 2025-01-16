public class Cook {
    IBuilder builder;

    Cook(IBuilder builder){
        this.builder = builder;
    }

    void createFishMenu(){
        this.builder.setColor();
        this.builder.setCooktime();
        this.builder.setSides();
        this.builder.setTaste();
        if(this.builder instanceof Halibut){
            (this.builder).setOcean();
        }
    }

    Fish getFish(){
        return this.builder.getFish();
    }
}
