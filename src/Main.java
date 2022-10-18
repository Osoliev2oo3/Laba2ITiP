public class Main {
    public static void main(String[] args) {
        int s = 1;
        while (s<100) {
            if (isPrime(s) == true) {
                System.out.println(s);
            }
            s++;
        }
    }

    public static boolean isPrime(int n) {
        if(n<0){
            return  false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return  false;
            }
        }
        return  true;
    }
}
