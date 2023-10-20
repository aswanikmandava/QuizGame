public class QuestionService {
    private Question q[] = new Question[3];

    public QuestionService() {
        q[0] = new Question(0, "size of int in bytes", "2", "1", "8", "4", "4");
        q[1] = new Question(0, "size of char in bytes", "1", "2", "4", "8", "2");
        q[2] = new Question(0, "size of boolean in bytes", "4", "2", "1", "8", "1");
    }



    public void showQuestions() {
        // System.out.println(q[0].getQuestion());
        for (Question ques:q) {
            // System.out.println(ques.getQuestion());
            System.out.println(ques);
        }
    }
}
