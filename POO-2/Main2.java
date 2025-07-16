import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Quizz[] quizzList = {
            new Quizz("\nQuelle est la capitale de la France ?", new String[]{"Paris", "Londres", "Berlin",}, 0),
            new Quizz("\nQuel est le plus grand océan du monde ?", new String[]{"Atlantique", "Indien", "Pacifique",}, 2),
            new Quizz("\nQui a écrit 'Les Misérables' ?", new String[]{"Victor Hugo", "Émile Zola", "Gustave Flaubert",}, 0),
            new Quizz("\nQuel est le symbole chimique de l'eau ?", new String[]{"CO2", "H2O", "O2",}, 1)
        };

        int totalScore = 0;

        System.out.println("\nBienvenue dans le Quizz.");
        System.out.println("Vous avez 1 minute (60 secondes) pour répondre à toutes les questions.");
        System.out.println("--------------------------------------------------");

        // Début du chronomètre
        LocalDateTime startTime = LocalDateTime.now();
        Duration timeLimit = Duration.ofMinutes(1);

        for (int i = 0; i < quizzList.length; i++) {

            Duration elapsed = Duration.between(startTime, LocalDateTime.now());

            if (elapsed.compareTo(timeLimit) > 0) {
                System.out.println("\nTemps écoulé ! Le quizz est terminé.");
                break;
            }
            
            Quizz question = quizzList[i];
            question.displayQuestion();
            System.out.print("\nVotre réponse : ");
            
            try {
                int userAnswer = scanner.nextInt() - 1; // Convertir en index (0-based)
                if (userAnswer < 0 || userAnswer >= 3) {
                    System.out.println("Réponse invalide. Veuillez entrer un nombre entre 1 et 3.");
                    i--; // Refaire la question
                    continue;
                }
                question.answerQuestion(userAnswer);
                totalScore += question.incrementScore();
            } catch (Exception e) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre.");
                scanner.next(); // Nettoyer l'entrée incorrecte
                i--; // Refaire la question
            }
        }

        System.out.println("\nVotre score final est : " + totalScore + " sur " + quizzList.length);
        scanner.close();
    }



}
