package week08;

/*231. 2的幂*/
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n&(n-1))==0;
    }
}
