package day11_stringManipulation;

public class C04_replaceAll {

    public static void main(String[] args) {
        //Kullanıcının gırdıgı metınde
        //harf dısında kalan tum karakterlerı temızleyen bır kod yazın
        //NOT: space sılınmemelı

        String  input="Ja5+va cok 1+guzel";

        input=input.replaceAll("\\d","");//Ja+va cok  +guzel
        input=input.replace(" ","5");//Ja+va5cok5+guzel
        input=input.replaceAll("\\W","");//Java5cok5guzel
        input=input.replace("5"," ");//Java cok guzel

        //input=input.replaceAll("\\W","");//Ja5vacok1guzel
        //input=input.replaceAll("\\d","");//Javacokguzel

        System.out.println(input);

    }
}
