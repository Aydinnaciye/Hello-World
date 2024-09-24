package d12loopsarrays;

public class WhileLoops03 {
    public static void main(String[] args) {

        //Ornek 1: Belirli bir tamsayinin palindrome olup olmadigini kontrol eden kodu yaziniz.
        //Palindrom tersinde de ayni olan.
        //Palindrom: 121 <==> 121

        int k= 312;
        String original =String.valueOf(k); //"312"
        String reversed = "";//Tesr cevrilmis olani bunun icinde sakliycaz.

        int index = original.length()-1;//length in 1 eksigi herzaman son indexi verir.
        while(index>=0){
            reversed = reversed +original.charAt(index);
            index--;
        }
        System.out.println(reversed);//"213"

        if (original.equals(reversed)){
            System.out.println("Palindromdur");

        }else {
            System.out.println("Palindrom degildir");

        }
    }
}
