package it.figuccia;

public class Start {
    public static void main(String[] args) {

        String text = "are you able to climb, are you able to swim or are you able to fly?";

        //if previous character is only space
        String result = text.replaceAll(" are" ,"_XYZ");
        //result: "are you able to climb, _XYZ you able to swim or _XYZ you able to fly?"

        //if previous character is a special word
        //String result = text.replaceAll("(\\b)are","_XYZ");
        //result: "_XYZ you able to climb, _XYZ you able to swim or _XYZ you able to fly?"
        System.out.println(result);
    }
}
