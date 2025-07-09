public class Main {
    public static void main(String[] args) {
        // Création de chevaux de course
        RaceHorses stayGold = new RaceHorses("Stay Gold", 1994, "Etalon", "Bai-brun", true, 
                                              6_035_000, 7, 50, null, null);
        RaceHorses goldShip = new RaceHorses("Gold Ship", 2009, "Etalon", "Gris", false, 
                                              8_135_000, 13, 28, stayGold, null);

    }

    
}
