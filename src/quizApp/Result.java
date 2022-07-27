package quizApp;

public class Result implements  IResult{
    int totalQuestions;
    int correctAnswers;
    int wrongAnswers;

    public Result(int totalQuestions, int correctAnswers, int wrongAnswers) {
        this.totalQuestions = totalQuestions;
        this.correctAnswers = correctAnswers;
        this.wrongAnswers = wrongAnswers;
    }

    @Override
    public void showResult() {
        System.out.println("Your Result: ");
        System.out.println("Total Questions:   " + totalQuestions);
        System.out.println("Correct Answers:  " + correctAnswers);
        System.out.println("Wrong Answers:  " + wrongAnswers);
        System.out.println("Percentage " + showPercentage(correctAnswers, totalQuestions));
        System.out.println("Overall Performance " + showPerformance(showPercentage(correctAnswers, totalQuestions)));


    }

    @Override
    public double showPercentage(int correctAnswers, int totalQuestions) {
        return ((double)correctAnswers / totalQuestions) * 100;
    }

    @Override
    public String showPerformance(double percentage) {
        String performance = "";


        if(percentage > 60){
            performance = "Good";
        } else if (percentage < 40){
            performance = "Poor";
        } else{
            performance = "Average";
        }

        return performance;
    }


}
