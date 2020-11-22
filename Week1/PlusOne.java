package firstweek;

/**
 * 66. 加一
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        if(digits==null || digits.length<=0){
            return null;
        }
        int cur=0,i=digits.length-1;
        while(i>=0){
            cur = digits[i];
            if(cur!=9){
                digits[i] = digits[i]+1;
                return digits;
            }else{
                digits[i--] = 0;
            }
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }
}
