public class RaceHorses {
    private String name;
    private int birthYear;
    private String gender;
    private String color;
    private boolean retired;
    private int earnings; // En euros (EUR)
    private int winCount;
    private int totalRaces;
    private RaceHorses sire; // Père
    private RaceHorses dam; // Mère

    // Constructeur
    public RaceHorses(String name, int birthYear, String gender, String color, boolean retired, 
                    int earnings, int winCount, int totalRaces, RaceHorses sire, RaceHorses dam) {

        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
        this.color = color;
        this.retired = retired;
        this.earnings = earnings;
        this.winCount = winCount;
        this.totalRaces = totalRaces;
        this.sire = sire;
        this.dam = dam;
    }


    // Taux de victoire
    public Double getWinRate() {
        if (totalRaces == 0) {
            return 0.0; // Évite la division par zéro
        }
        return (double) winCount / totalRaces;
    }

}
