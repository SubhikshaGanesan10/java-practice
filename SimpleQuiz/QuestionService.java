
import java.util.Scanner;

public class QuestionService{
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is the capital of Canada?", "Ontario", "Ottawa" , "Vancouver", "Quebec", "Ottawa");
        questions[1] = new Question(2, "What is the national fruit of Australia?", "Kiwi", "Apple" , "DragonFruit", "Plum", "Kiwi");
        questions[2] = new Question(3, "Which of these is not a prime number?", "1", "3" , "23", "13", "1");
        questions[3] = new Question(1, "Who is the President of the United States?", "Kamala Harris", "Joe Biden" , "Hillary Clinton", "Donald Trump", "Donald Trump");
        questions[4] = new Question(1, "What is the size of a boolean?", "8", "4" , "1", "2", "1");
    }



    public void playQuiz(){
        int i = 0;
        for(Question q : questions){
            System.out.print("QNo." + q.getId() + ". ");
            System.out.println(q.getQuestion());
            System.out.println("1. " + q.getOption1());
            System.out.println("2. " + q.getOption2());
            System.out.println("3. " + q.getOption3());
            System.out.println("4. " + q.getOption4());
            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine();
        }
    }

    public void printScore(){
        int score = 0;
        for(int i = 0; i < questions.length; i++){
            Question que = questions[i];
            String answer = que.getAnswer();
            String userAnswer = selection[i];
            if(answer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Print Score: " + score);
    }
    
}