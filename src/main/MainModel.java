package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainModel {
    final private ArrayList<String> pos_answers=new ArrayList<>();
    final private ArrayList<String> neut_answers=new ArrayList<>();
    final private ArrayList<String> neg_answers=new ArrayList<>();
    final private ArrayList<String> answers=new ArrayList<>();


    public MainModel(){
        String[] pos={"It is certain","It is decidedly so","Without a doubt","Yes - definitely","You may rely on it",
                "As i see it, yes.","Most likely","Outlook good","Yes","Signs point to yes"};
        pos_answers.addAll(Arrays.asList(pos));

        String[] neut={"Reply hazy, try again","Ask again later","Better not tell you now","Cannot predict now","Concentrate and ask again"};
        neut_answers.addAll(Arrays.asList(neut));

        String[] neg={"Don't count on it","My reply is no","My sources say no","Outlook not so good","Very doubtful"};
        neg_answers.addAll(Arrays.asList(neg));

        answers.addAll(pos_answers);
        answers.addAll(neut_answers);
        answers.addAll(neg_answers);
    }

    public String getAnswer(String q){
        if (q.equals(""))
            return "I don't understand";
        else if (!q.contains("?")){
            return getNeutAnswer();
        }else if (q.toUpperCase().contains("SEW")){
            return getPosAnswer();
        }else if (q.toUpperCase().contains("MATH"))
            return getNegAnswer();
        return getRandomAnswer();
    }
    public String getRandomAnswer(){
        Random random=new Random();
        return answers.get(random.nextInt(answers.size()));
    }
    public String getPosAnswer(){
        Random random=new Random();
        return pos_answers.get(random.nextInt(pos_answers.size()));
    }
    public String getNegAnswer(){
        Random random=new Random();
        return neg_answers.get(random.nextInt(neg_answers.size()));
    }
    public String getNeutAnswer(){
        Random random=new Random();
        return neut_answers.get(random.nextInt(neut_answers.size()));
    }
}
