package Demo;

import Requests.OpenTDB;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] Args) throws LoginException {
        OpenTDB obj = new OpenTDB();
        obj.setCategory = 32;
        obj.setDifficulty = "easy";

        obj.getQuestion();

        System.out.println(obj.getQuestion);
        System.out.println(obj.getCorrectAnswer);

        for (int i = 0; i < obj.getIncorrectAnswers.length ; i++) {
            System.out.println(obj.getIncorrectAnswers[i]);
        }

        System.out.println(obj.getCategory);
        System.out.println(obj.getDifficulty);

    }
}
