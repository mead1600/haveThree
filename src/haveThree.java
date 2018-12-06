public class haveThree {
    public static boolean haveThree(int[] arr){
        int threeNums = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 3){
                threeNums++;
            }
        }
        boolean notConsecutive = true;
        for(int j = 0; j < arr.length - 1; j++) {
            if(arr[j] == 3 && arr[j + 1] == 3){
                notConsecutive = false;
            }
        }
        if(threeNums == 3 && notConsecutive){
            return true;
        }
        return  false;
    }
}
