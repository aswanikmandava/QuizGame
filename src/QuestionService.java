import java.util.Scanner;

public class QuestionService {
    private Question[] q = new Question[3];
    private String[] answer = new String[3];
    private int i = 0;

    public QuestionService() {
        String[] q0Opts = { "2", "1", "8", "4" };
        String[] q1Opts = { "1", "2", "4", "8" };
        String[] q2Opts = { "4", "2", "1", "8" };
        q[0] = new Question(1, "size of int in bytes", q0Opts, "4");
        q[1] = new Question(2, "size of char in bytes", q1Opts, "2");
        q[2] = new Question(3, "size of boolean in bytes", q2Opts, "1");
    }

    public void startQuiz() {
        for (Question ques:q) {
            System.out.println("Q NO: " + ques.getId());
            System.out.println(ques.getQuestion());
            for(int j=0; j<ques.getOpt().length;j++) {
                System.out.println(ques.getOpt()[j]);
            }
            // take an input from the user on the Question
            Scanner sc = new Scanner(System.in);
            System.out.print("INPUT: ");
            answer[i] = sc.nextLine();
            i++;
        }
    }

    public void showGivenAnswers() {
        int count = 1;
        for (String ans:answer) {
            System.out.println("Given answer for " + count + ": " + ans);
            count++;

        }
    }

    public void getScore() {
        int score=0;
        for (i=0; i < q.length; i++) {
            String correct_answer = answer[i];
            String submitted_answer = q[i].getAnswer();
            if (correct_answer.equals(submitted_answer)) {
                score++;
            }
        }
        System.out.println("Your score: " + score);
    }

    public void showCorrectAnswers() {
        int count=1;
        for (i=0; i < q.length; i++) {
            System.out.println("Answer for " + (count) + " - " + q[i].getQuestion() + ": " + q[i].getAnswer());
            count++;
        }
    }
}
