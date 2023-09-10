class Footballer {
    private String name;
    private int age;
    private int starts;
    private int goals;
    private int assists;

    public Footballer(String name, int age, int starts, int goals, int assists) {
        this.name = name;
        this.age = age;
        this.starts = starts;
        this.goals = goals;
        this.assists = assists;
    }
    public String getName() {return name;}
    public double getGoalsPerGame() {
        double goalsPerGame = (double) goals / starts;
        return goalsPerGame;
    }
    public double getAssistsPerGame() {
        double assistsPerGame = (double) assists / starts;
        return assistsPerGame;
    }
}

class Midfielder extends Footballer {
    public Midfielder(String name, int age, int starts, int goals, int assists) {
        super(name,age,starts,goals,assists);
    }
    public void mfData() {
        System.out.println(getName() + " is a midfielder (MF) and he scores " + getGoalsPerGame() + " goal per game and he takes " + getAssistsPerGame() + " assist per game");
    }
}

class Forward extends Footballer {
    public Forward(String name, int age, int starts, int goals, int assists) {
        super(name,age,starts,goals,assists);
    }
    public void fwData() {
        System.out.println(getName() + " is a forward (FW) and he scores " + getGoalsPerGame() + " goal per game and he takes " + getAssistsPerGame() + " assist per game");
    }
}
public class Main {
    public static void main(String[] args) {
        Midfielder number7 = new Midfielder("Raheem Sterling", 27, 4, 2, 1);
        Forward number15 = new Forward("Nicolas Jackson", 23, 4, 1, 3);
        Forward number9 = new Forward("Erling Haaland", 24, 4, 5, 2);

        number7.mfData();
        number9.fwData();
        number15.fwData();
    }
}