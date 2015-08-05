/**
 * Created by yuan on 8/2/15.
 */
public class TrailingZero {
    public int trailingZeroes(int n) {
        if(n==0) return 0;
        long number = calc(1,n);
        System.out.println(number);
        int temp = 0;
        while(number>=10 && number%10==0){
            temp++;
            number = number/10;
        }

        return temp;

    }

    public long calc(int l, int r){

        if(l==r) return l;
        int mid = (l+r)/2;
        return calc(l,mid)*calc(mid+1,r);

    }

    public static void main(String[] args){

        TrailingZero trailingZero = new TrailingZero();

        System.out.print(trailingZero.trailingZeroes(10));

    }
}

