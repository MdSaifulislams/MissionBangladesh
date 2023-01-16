package snakex.missionbangladesh.com;

public class Division {
    private String name;

    public Division(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Division{" +
                "name='" + name + '\'' +
                '}';
    }
}
