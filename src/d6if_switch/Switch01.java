package d6if_switch;

public class Switch01 {
    public static void main(String[] args) {
        // 1.Yol: if -else if

        /*Ornek: Gün isimlerini verince kacinci gün oldugunu yazdiran kodu yaziniz

         */

        String dayName = "Wednesday";

        if (dayName.equalsIgnoreCase("Sunday")) {


        } else if (dayName.equalsIgnoreCase("Monday")) {

        } else if (dayName.equalsIgnoreCase("Tuesday")) {

        } else if (dayName.equalsIgnoreCase("Wednesday")) {

        } else if (dayName.equalsIgnoreCase("Thursday")) {

        } else if (dayName.equalsIgnoreCase("Friday")) {

        } else if (dayName.equalsIgnoreCase("Saturday")) {

        } else {
            System.out.println("Lütfen gecerli gün ismi giriniz");
        }
        //----------------------
            //2.Yol: Switch
        // NOT:Switch condition parantezi icine String,int,byte,short,char yazabilirsiniz.
        //LONG,BOLEAN,FLOAT VE DOUBLE KULLANILMAZ.

            switch (dayName.toLowerCase()) {
                case "sunday":
                    System.out.println(1);
                    break;
                case "monday"  :
                    System.out.println(2);
                    break;
                case "tuesday":
                System.out.println(3);
                     break;
                case "wednesday":
                System.out.println(4);
                     break;
                case "thursday":
                System.out.println(5);
                     break;
                case "friday":
                System.out.println(6);
                     break;
                case "saturday":
                System.out.println(7);
                     break;
                default:
                    System.out.println("Gecerli bir gün ismi giriniz");
            }
        }


    }


