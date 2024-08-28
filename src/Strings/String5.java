package Strings;
//package org.example;

public class String5 {
    public static void main(String[] args) {
        String[] roles = new String[]{"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука", "Лука Лукич", "Немой"};
        String[] textLines = new String[]{
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор."
                , "Аммос Федорович: Как ревизор?"
                , "Артемий Филиппович: Как ревизор?"
                , "Лука: Тра ля ля, тарам-парам"
                , "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем."
                , "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!"
                , "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
                , "Лука Лукич: Господи боже! Лука: еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles, textLines));
        /**
         * Привер вывода:
         * Городничий:
         * 1) Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
         * 4) Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.
         *
         * Аммос Федорович:
         * 2) Как ревизор?
         * 5) Вот те на!
         *
         * Артемий Филиппович:
         * 3) Как ревизор?
         * 6) Вот не было заботы, так подай!
         *
         * Лука Лукич:
         * 7) Господи боже! еще и с секретным предписаньем!
         * 8) Господи боже! Лука: еще и с секретным предписаньем!
         *
         * Немой:
         **/
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
            StringBuilder result = new StringBuilder();

            for (String role : roles) {
                result.append(role).append(":\n");
                int lineNumber = 1;
                for (String textLine : textLines) {
                    if (textLine.startsWith(role + ":")) {
                        result.append(lineNumber).append(") ").append(textLine.substring(role.length() + 2)).append("\n");
                        lineNumber++;

                    }
                }
                result.append("\n");
            }
            return result.toString();
    }
}
//1.6.11

