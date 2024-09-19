package day06_ifElseStatement;

public class C06_IfElseStatements {

    public static void main(String[] args) {

        //If else statementte suslu parantez kullanmazsak hem ıf hem
        //else bodysini bir satır kabul eder.Sonrakı satırlar ıf else ile iliskilendirilmez.
        int not=56;

        if (not>=56){
            System.out.println("Sınıfı gectın");
            System.out.println("Yazın kafan rahat");
        }else {
            System.out.println("Bu dersten kaldın");
            System.out.println("Yaz okuluna beklerız");
        }
    }
}

