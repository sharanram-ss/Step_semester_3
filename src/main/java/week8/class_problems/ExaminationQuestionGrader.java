package week8.class_problems;

import java.util.Scanner;

interface Question {
    double calculateScore(String studentAnswer);
}

class MCQ implements Question {
    private String correctAnswer;
    private int points;

    public MCQ(String correctAnswer, int points) {
        this.correctAnswer = correctAnswer;
        this.points = points;
    }

    public double calculateScore(String studentAnswer) {
        if (studentAnswer.equals(correctAnswer)) {
            return points;
        }
        return 0;
    }
}

class TrueFalse implements Question {
    private String correctAnswer;
    private int points;

    public TrueFalse(String correctAnswer, int points) {
        this.correctAnswer = correctAnswer;
        this.points = points;
    }

    public double calculateScore(String studentAnswer) {
        if (studentAnswer.equals(correctAnswer)) {
            return points;
        }
        return 0;
    }
}

class Essay implements Question {
    private String correctAnswer;
    private int points;

    public Essay(String correctAnswer, int points) {
        this.correctAnswer = correctAnswer;
        this.points = points;
    }

    public double calculateScore(String studentAnswer) {
        String[] keywords = correctAnswer.split(",");
        int count = 0;

        for (int i = 0; i < keywords.length; i++) {
            if (studentAnswer.toLowerCase().contains(keywords[i].trim().toLowerCase())) {
                count++;
            }
        }

        if (count >= 2) {
            return points * 0.75;
        } else if (count == 1) {
            return points * 0.50;
        } else {
            return 0;
        }
    }
}

public class ExaminationQuestionGrader {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        double total = 0;

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();

            String[] parts = line.split("\"");

            String type = parts[0].trim().split(" ")[0];
            String correctAnswer = parts[3];
            String studentAnswer = parts[5];
            int points = Integer.parseInt(parts[6].trim());

            Question question;

            if (type.equals("MCQ")) {
                question = new MCQ(correctAnswer, points);
            } else if (type.equals("TF")) {
                question = new TrueFalse(correctAnswer, points);
            } else {
                question = new Essay(correctAnswer, points);
            }

            double score = question.calculateScore(studentAnswer);

            System.out.printf("%s: %.2f%n", type, score);
            total = total + score;
        }

        System.out.printf("Total Score: %.2f%n", total);

        sc.close();
    }
}