class Solution {
    public boolean reorderedPowerOf2(int n) {
        int [] numFreq = frequency(n);
        int power = 1;
        for(int i=0;i<30;i++){
            if(Arrays.equals(numFreq, frequency(power))) return true;
            power<<=1;
        }
        return false;
    }
    
    int[] frequency(int num){
        int ar[] = new int[10];
        while(num>0){
            ar[num%10]++;
            num/=10;
        }
        return ar;
    }
}
