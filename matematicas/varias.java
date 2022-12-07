package matematicas;
public class varias{
    public static boolean esCapicua(long x){
        long numini = x;
        long nvol = 0;
        while (x > 0){
            nvol = nvol * 10;
            nvol = nvol + (x % 10);
            x = x / 10;  
        }
        if (nvol == numini){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean esPrimo(long x1){
        if (x1 < 2){
            return false;
        }
        else {
            for (long i = 2; i < ((x1 / 2) + 1); i++){
                if ((x1 % i) == 0){
                    return false;
                }
            }
            return true;
        }
    }
    public static long siguientePrimo(long x2){
        long xaux = x2 + 1;
        while (!esPrimo(xaux)){
            xaux++;
        }
        return xaux;
    }
    public static double potencia(int base, int exp){
        if (exp == 0){
            return 1;
        }
        if (exp < 0){
            return (1/(potencia(base, -exp)));
        }
        int x3 = 1;
        for (int i = 0; i < Math.abs(exp); i++){
            x3 = x3 * base;
        }
        return x3;
    }
    public static int digitos(long x4){
        int cont = 0;
        while (x4 > 0){
            cont++;
            x4 = x4 / 10;
        }
        return cont;
    }
    public static long voltea(long x5){
        long volt5 = 0;
        while (x5 > 0){
            volt5 = volt5 * 10;
            volt5 = volt5 + (x5 % 10);
            x5 = x5 / 10;
        }
        return volt5;
    }
    public static int digitoN(long x6, int n){
        x6 = voltea(x6);
        while (n-- > 1){
            x6 = x6 / 10;
        }
        return (int)(x6 % 10);
    }
    public static int posicionDeDigito(long x7, int numpos){
        int contpos;
        for (contpos = 0; (contpos < digitos(x7)) && (digitoN(x7, contpos) != numpos); contpos++) {};
        if (contpos == digitos(x7)) {
            return -1;
        } else {
            return contpos;
        }
    }
    public static long quitaPorDetras(long x8, int posdet){
        int contpos = 0;
        while(contpos < posdet - 1){
            x8 = x8 / 10;
            contpos++;
        }
        return x8;
    }
    public static long quitaPorDelante(long x9, int posdel){
        long numini = x9;
        x9 = voltea(x9);
        int posdet = posdel;
        x9 = quitaPorDetras(x9, posdet);
        x9 = voltea(x9);
        if (numini % 10 == 0){
            return (x9 * 10);
        }
        else{
            return x9;
        }
    }
    public static long pegaPorDetras(long x10, int numdet){
        x10 = x10 * 10;
        x10 = x10 + numdet;
        return x10;
    }
    public static long pegaPorDelante(long x11, int numdel){
        x11 = voltea(x11);
        x11 = x11 * 10;
        x11 = x11 + numdel;
        x11 = voltea(x11);
        return x11;
    }
    public static long trozoDeNumero(long x12, int ini, int fin){
        x12 = quitaPorDelante(x12, ini);
        x12 = quitaPorDetras(x12, fin);
        return x12;
    }
    public static long juntaNumeros(long x13, long y){
        return (long)(x13 * potencia(10, digitos(y))) + y;
    }
}