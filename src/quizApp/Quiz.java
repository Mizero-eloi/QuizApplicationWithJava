package quizApp;

import java.util.Scanner;

public class Quiz {

    void begin(){
        Question q1 = new Question("Which is a valid keyword in java?", "interface", "inherit", "unsigned", "derive", new Answer("interface"));
        Question q2 = new Question("Where does an object get created in memory?", "Stack", "Queue", "Heap", "NOne of the above", new Answer("Heap"));
        Question q3 = new Question("Which keyword is used to prevent method from getting overriden?", "extends", "final", "static", "implements", new Answer("final"));
        Question q4 = new Question("Which is a valid keyword in java?", "interface", "inherit", "unsigned", "derive", new Answer("interface"));
        Question q5 = new Question("Which is a valid keyword in java?", "interface", "inherit", "unsigned", "derive", new Answer("interface"));
        Question q6 = new Question("Which is a valid keyword in java?", "interface", "inherit", "unsigned", "derive", new Answer("interface"));

        Question questionsArr[] = {q1, q2, q3, q4, q5, q6};

        int countTotal = 0;
        int countCorrect = 0;
        int countWrong = 0;

        for (Question question : questionsArr) {
            System.out.println(question.getQuestion());
            System.out.println("A. " + question.getOption1());
            System.out.println("B. " + question.getOption2());
            System.out.println("C. " + question.getOption3());
            System.out.println("D. " + question.getOption4());
            System.out.println("\n Enter an option");

            Scanner scanner = new Scanner(System.in);
            char option = scanner.next().charAt(0);
            String answer = "";

            switch (option){
                case 'A':
                    answer = question.getOption1();
                    break;
                case 'B':
                    answer = question.getOption2();
                    break;
                case 'C':
                    answer = question.getOption3();
                    break;
                case 'D':
                    answer = question.getOption4();
                    break;
                default: break;
            }

            if (answer.equals(question.answer.getAnswer())){
                System.out.println("----------------------------------------------------");
                System.out.println("Correct answer");
                System.out.println("----------------------------------------------------");
                countCorrect++;
            } else {
                System.out.println("----------------------------------------------------");
                System.out.println("Wrong answer");
                System.out.println("----------------------------------------------------");
                countWrong++;

            }

            System.out.println("\n====================================================\n");
             countTotal++;

        }

        IResult result = new Result(countTotal, countCorrect, countWrong);
        result.showResult();

    }

}
