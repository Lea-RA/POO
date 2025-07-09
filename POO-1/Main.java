import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nBienvenue dans le simulateur de bouteille.");
        
        System.out.print("\nEntrez le type de liquide (e.g., Eau, Jus, Soda): ");
        String liquid = scanner.nextLine();

        int volume = 0;
        while (true) {
            System.out.print("Entrez le volume de la bouteille en centilitres (cl): ");
            try {
                volume = scanner.nextInt();
                if (volume <= 0) {
                    System.out.println("\nLe volume doit être supérieur à 0. Veuillez réessayer.");
                } else {
                    break; // Sortir de la boucle si le volume est valide
                }
            } catch (Exception e) {
                System.out.println("\nErreur: Veuillez entrer un nombre valide.");
                scanner.next(); // Vider le scanner pour éviter une boucle infinie
            }        }
        
        Bouteille bouteille = new Bouteille(liquid, volume);
        
        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Ouvrir la bouteille");
            System.out.println("2. Fermer la bouteille");
            System.out.println("3. Boire un certain volume");
            System.out.println("4. Afficher l'état de la bouteille");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    bouteille.open(); break;
                case 2:
                    bouteille.close(); break;
                case 3:
                    if (bouteille.isOpen()) {
                        try {
                        System.out.print("\nEntrez le volume à boire en centilitres (cl): ");
                        int amount = scanner.nextInt();
                        bouteille.drink(amount);
                        } catch (Exception e) {
                            System.out.println("\nErreur: Veuillez entrer un nombre valide.");
                            scanner.next(); // Vider le scanner pour éviter une boucle infinie
                        }
                    } else {
                        System.out.println("\nLa bouteille doit être ouverte pour boire.");
                    } break;
                case 4:
                    bouteille.displayStatus(); break;
                case 5:
                    System.out.println("\nMerci d'avoir utilisé le simulateur de bouteille !");
                    scanner.close();
                    return;
                default:
                    System.out.println("\nOption invalide, veuillez réessayer.");
            }
        }
    }
}
