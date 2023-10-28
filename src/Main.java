public class Main {
    public static void main(String[] args) {
        QuestionService q = new QuestionService();
        q.startQuiz();
        q.getScore();
        System.out.println("------- GIVEN ANSWERS ------");
        q.showGivenAnswers();
        System.out.println("------- CORRECT ANSWERS ------");
        q.showCorrectAnswers();
    }
}
