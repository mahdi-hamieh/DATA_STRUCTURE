

public class movie {
    private String name;
    private int releaseyear;
    
    public movie(String name, int releaseyear) {
        this.name = name;
        this.releaseyear = releaseyear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(int releaseyear) {
        this.releaseyear = releaseyear;
    }

    @Override
    public String toString() {
        return "movie{" + "name=" + name + ", releaseyear=" + releaseyear + '}';
    }

}
