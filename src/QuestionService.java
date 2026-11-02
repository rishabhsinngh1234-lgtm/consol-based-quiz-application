import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService(){
        questions[0] = new Question(1, "Size of int", "4", "5", "4", "4", "3");
        questions[1] = new Question(2, "Size od double", "8", "8", "4", "87", "4");
        questions[2] = new Question(3, "Size of char", "2", "6", "7", "2", "9");
        questions[3] = new Question(4, "default value of int", "0", "0", "null", "undefined", "");
        questions[4] = new  Question(5, "what is wour name", "Rishabh", "ppp", "rrr", "rishabh", "ttt");
    }
    public void playQuiz() {
        int i = 0;
        for (Question question : questions) {
            System.out.println("Question no " + question.getId());
            System.out.println("Question. : " + question.getQuestion());
            System.out.println("Answer : " + question.getAnswer());
            System.out.println("Option1 : " + question.getOption1());
            System.out.println("Option2 : " + question.getOption2());
            System.out.println("Option3 : " + question.getOption3());
            System.out.println("Option4 : " + question.getOption4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;

        }
        for (String s : selection) {
            System.out.println(s);

        }
    }
    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String answer = que.getAnswer();
            String userAnswer = selection[i];
            if (answer.equals(userAnswer)) {
                score += 1;
            }

        }
        System.out.println("The score is " + score);
    }
}


