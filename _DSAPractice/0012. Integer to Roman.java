//1. map
import static java.util.Map.entry; 
class Solution {
    public String intToRoman(int num) {
        String result = "";
        int numOfdigit=1;
        Map<Integer, String >map = Map.ofEntries(entry(1,"I"), entry(4,"IV"), entry(5,"V"),entry(9,"IX"),entry(10,"X"),entry(40, "XL"),entry(50, "L"), entry(90,"XC"),entry(100,"C"), entry(400, "CD"),entry(500, "D"), entry(900,"CM"), entry(1000,"M"));
        while(num>0){
            int r=num%10;
            int t= numOfdigit * (r);
            if(map.containsKey(t)){
                result = map.get(t)+result;
            }else{
                String temp = "";
                if(r/5!=0){
                    temp+=map.get(5*numOfdigit);
                    r = r-5;
                }
                while(r>0){
                    temp +=map.get(numOfdigit);
                    r--;
                }
                result = temp+result;
            }
            num=num/10;
            numOfdigit*=10;
        }
        return result;
    }
}

//array
class Solution {
    public String intToRoman(int num) {
        String result = "";
        int val[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String rom[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<val.length;i++){
            while(num>=val[i]){
                result = result + rom[i];
                num-=val[i];
            }
        }
        return result;
    }
}
