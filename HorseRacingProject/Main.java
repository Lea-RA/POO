public class Main {
    public static void main(String[] args) {
        // Création de chevaux de course
        RaceHorses stayGold = new RaceHorses("Stay Gold", 1994, "Etalon", "Bai-brun", true, 
                                              6_035_000, 7, 50, null, null);
        RaceHorses goldShip = new RaceHorses("Gold Ship", 2009, "Etalon", "Gris", false, 
                                              8_135_000, 13, 28, stayGold, null);
        RaceHorses mejiroMcqueen = new RaceHorses("Mejiro McQueen", 1987, "Etalon", "Gris", true,
                                                   5_900_000, 12, 21, null, null);
        RaceHorses tokaiTeio = new RaceHorses("Tokai Teio", 1988, "Etalon", "Bai-brun", true, 
                                              3_640_000, 9, 12, symboliRudolf, null);
        RaceHorses symboliRudolf = new RaceHorses("Symboli Rudolf", 1984, "Etalon", "Bai-brun", true, 
                                                  6_000_000, 10, 20, null, null);                                      
    }

    
}
