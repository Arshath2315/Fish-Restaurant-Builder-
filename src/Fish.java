public class Fish {
    String Color;
    int Cooktime;
    String [] Sides;
    String Taste;
    String Ocean;

    public String getColor(){
        return this.Color;
    }

    public void setColor(String Color){
        this.Color = Color;
    }
    public int getCooktime() {
        return Cooktime;
    }

    public void setCooktime(int cooktime) {
        this.Cooktime = cooktime;
    }
    public String[] getSides() {
        return Sides;
    }

    public void setSides(String[] sides) {
        this.Sides = sides;
    }

    public String getTaste() {
        return Taste;
    }

    public void setTaste(String taste) {
        this.Taste = taste;
    }
    public String getOcean(){
        return this.Ocean;
    }
    public void setOcean(String Ocean){
        this.Ocean = Ocean;
    }

    void Display(){
        System.out.println(getColor());
        System.out.println(getCooktime());
        System.out.println("Sides: ");
        for(String sides : getSides()){
            System.out.println(sides +", ");
        }
        System.out.println();
        System.out.println(getTaste());
        System.out.println(getOcean());
        System.out.println("\n");
    }

}
