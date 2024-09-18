package day13_nestedForLoop_method;

public class Increment01 {
    public static void main(String[] args) {
        //Increment
        int a =2;
        int b =4;
        a +=2;
        b +=4;
        System.out.println(a);//4
        System.out.println(b);//8

        //Decrement
        int c = 4;

        c = c - 3; //BUNUN YERINE
        c -= 4;
        System.out.println(c);//-3

        //Carpma
        int d =2;
        d*= 2;
        System.out.println(d);//4

        //Bölme

        int e =20;
        e /=2;
        System.out.println(e);//10


        //1 ile increment
        int f =13;
        f =f+1;
        f+=1;
        f++;
        System.out.println(f);//16

        int h =15;
        h -=1;
        h --;
        System.out.println(h);//13

        //Post  Increment (i++), Pre Increment (++i)
        int i =10;
        int k =i++; //i yi gördü k=10 yazdi arkasindaki +lari görmedi
        System.out.println(k); //10
        System.out.println(i); //11 sonradan + yi gördü o yüzden i=11 aldi
        //önce atadi sonra arttirdi
        //.................

        int  m=15;
        int n= ++m;
        System.out.println(n); //16
        System.out.println(m); //16
        //...................

        int p=17;
        int r= p--;
        System.out.println(r); //17
        System.out.println(p);//16
        //....................

        int s = 20;
        int t= --s;
        System.out.println(t);//19 Neyi azaltacagini bilmedigi icin devam ediyor
        System.out.println(s);//19


    }
}

