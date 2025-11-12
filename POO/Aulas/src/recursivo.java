public class recursivo {

    public static int fatorial(int num) {
        if (num == 0) {
            return 1;
        }
        else {
            return num * fatorial(num-1);
        }
    }

    public static int fibonnaci(int num) {
        if (num<2) {
            return 1;
        } else {
            return fibonnaci(num-1) + fibonnaci(num -2);
        }
    }
} 
