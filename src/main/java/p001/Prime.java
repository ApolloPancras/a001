package p001;

public class Prime {
    private int min = 2;
    private int max;
    private int count = 0;

    public int getCount() {
        return count;
    }

    public Prime(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void findPrime(){
        for(int i = min; i <= max; i++){
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
    }

    @Override
    public String toString() {
        return "Prime [min=" + min + ", max=" + max + ", count=" + count + "]";
    }
}
