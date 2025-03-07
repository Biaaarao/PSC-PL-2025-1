public class Operadores {
    public static void main(String[] args) {
        //operadores aritméticos

        int a = 10;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //Operadores de comparação

        int c = 20;
        int d = 15;

        System.out.println(c == d);
        System.out.println(c != d);
        System.out.println(c > d);
        System.out.println(c < d);
        System.out.println(c >= d);
        System.out.println(c <= d);

        //Operadores Lógicos

        boolean e = true;
        boolean f = false;

        System.out.println(e && f);
        System.out.println(e || f);
        System.out.println(!e);
    
        //Operadores de Atribuição 

        int h = 10;
        
        h+=5; // g = g + 5 
        h-=5;
        h*=5;
        h/=5;
        h%=5;

        System.out.println(h+=5);
        System.out.println(h-=5);
        System.out.println(h*=5);
        System.out.println(h/=5);
        System.out.println(h%=5);




    }

}