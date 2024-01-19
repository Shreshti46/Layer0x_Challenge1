import java.util.*;
class Challenge1{
    public static int MaximumSum(int[] inputArray){
        if(inputArray == null || inputArray.length == 0){
            return 0;
        }
        int start = inputArray[0];
        int end = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            start = Math.max(inputArray[i],start+inputArray[i]);
            end = Math.max(end,start);
        }
        return end;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of inputArray");
        int length = sc.nextInt();
        int inputArray[] = new int[length];
        System.out.println("Enter inputArray Elements:");
        for(int i=0;i<length;i++){
            inputArray[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(inputArray));
        System.out.println(MaximumSum(inputArray));
    }
}