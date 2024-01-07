package Inheritance;

public class Manager extends Employee {

    private int teamSize;

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public Manager(String name, String department, double salary, int teamSize) {
        super(name, department, salary);

    }

    @Override
    public String toString() {
        return super.toString() + "Team Size: " + teamSize;
    }

}
