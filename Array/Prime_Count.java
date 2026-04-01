class Solution {
    public int totalPrime(int n){
        int count=0;
        boolean[] num = new boolean[n];
        if(n<=2) return 0;
        for(int i=0; i<n; i++){
            num[i]= true;
        }
        num[0]=false;
        num[1]=false;

        for(int i=2; i<n; i++){
            if(num[i]==true){
                for(int j=2; j*i < n; j++){
                    num[i*j]=false;
                }
            }
        }
        for(int i=0; i<n; i++){
            if(num[i]==true){
                count++;
            }
        }
        return count;
    }
    public int countPrimes(int n) {
        return totalPrime(n);
    }
}
