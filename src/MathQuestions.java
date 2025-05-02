public class MathQuestions {

    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }

    public double myPow(double x, int n) {
        // my attempt of implementing pow(x,n):
//        double result = 1;
//        int index = 0;
//
//        if (n < 0) {
//            x = 1/x;
//            n = -n;
//        } else if (n == 0){
//            return 1;
//        } else if(x == 1){
//            return 1;
//        }
//
//        while (index < n) {
//            result *= x;
//            index++;
//        }
//        return result;

        // with help implementation:
        double result = 1;
        long index = n;

        if (n < 0) {
            x = 1/x;
            index = -index;
        } else if (n == 0){
            return 1;
            }

        while (index > 0) {
            if(index % 2 == 1){ //odd
                result *= x; // when finding result last halve will always be an odd number which means this statement will always run last
            }
            x *= x; // x = x * x

            index /= 2; //halve index(n) since we are counting down doubles of power 2^6 -> 2^3 (which will go in if statement to set result) or 2^8 -> 2^4 (which will skip if)
        }

        return result;
    }
}
