package ua.kv.andrii.klykavka.tommy.magicball;

import java.util.Random;
public class App {
    public static void main(String[] args) {


        if(args == null || args.length < 1) {
            System.out.println("Невірна кількість параметрів запису");
            System.exit(1);
        }

        String question = String.join(" ", args);
        System.out.println("отримано запитання:");
        System.out.println(" - " + question);

        String[] answerOptions = new String[] {
            "це точно",
            "жодних сумнівів",
            "можеш на це розраховувати",
            "так, однозначно",
            "саме так і було вирішено",
            "я бачу, що так",
            "скоріш за все",
            "так",
            "шанси є",
            "знаки вказують, що так",
            "відповідь нечітка, спробуй ще раз",
            "наразі краще тобі не казати",
            "спитай-но ще раз",
            "зараз не можу передбачити",
            "сконцентруйся і спитайся наново",
            "не розраховуй на це",
            "без шансів",
            "мої джерела кажуть, що ні",
            "дуже сумнівно",
            "моя відповідь - ні"

        };

        String answer = answerOptions[new Random().nextInt(answerOptions.length)];

        System.out.println("Відповідь магічної кулі: ");
        System.out.println(" - " + answer.substring(0, 1).toUpperCase() + answer.substring(1));
    }
}
