import java.util.Random;

public class Bouteille {
    private String liquid;
    private int volume; // Volume en centilitres (cl)
    private boolean isOpen;
    private boolean isEmpty;

    // Constructeur
    public Bouteille(String liquid, int volume) {
        this.liquid = liquid;
        this.volume = volume;
        this.isOpen = false;
        this.isEmpty = (volume <= 0);
    }

    // Méthode pour ouvrir la bouteille
    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("\nLa bouteille est maintenant ouverte.");
        } else {
            System.out.println("\nLa bouteille est déjà ouverte.");
        }
        riskOfSpillage();
    }

    // Méthode pour fermer la bouteille
    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("\nLa bouteille est maintenant fermée.");
        } else {
            System.out.println("\nLa bouteille est déjà fermée.");
        }
    }

    // Méthode pour boire un certain volume de liquide
    public void drink(int amount) {
        if (!isOpen) {
            System.out.println("\nLa bouteille doit être ouverte pour boire.");
            return;
        }
        if (isEmpty) {
            System.out.println("\nLa bouteille est vide.");
            return;
        }

        if (amount >= volume) {
            System.out.println("\nVous avez bu " + volume + "cl de la bouteille. La bouteille est maintenant vide.");
            volume = 0;
            isEmpty = true;
        } else {
            volume -= amount;
            System.out.println("\nVous avez bu " + amount + " cl de la bouteille. Il reste " + volume + " cl.");
        }
        riskOfSpillage();
    }

    // Méthode pour afficher l'état de la bouteille
    public void displayStatus() {
        System.out.println("\nÉtat de la bouteille :");
        System.out.println("Liquide : " + liquid);
        System.out.println("Volume : " + volume + " cl");
        System.out.println("Ouverte : " + (isOpen ? "Oui" : "Non"));
        System.out.println("Vide : " + (isEmpty ? "Oui" : "Non"));
    }

    // Méthode pour le risque de renversement de la bouteille
    public void riskOfSpillage() {
        if (isOpen && !isEmpty) {
            Random random = new Random();
            int chance = random.nextInt(100); // Génère un nombre aléatoire entre 0 et 99

            if (chance < 10) { // 10% de chance de renverser la bouteille
                System.out.println("\nOh non ! La bouteille s'est renversée...");
                volume = 0; // La bouteille est maintenant vide
                isEmpty = true;
            }
        }
    }

    // Méthode pour vérifier si la bouteille est ouverte
    public boolean isOpen() {
        return isOpen;
    }
}


