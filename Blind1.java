import java.util.HashMap;

public class Blind1 {
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){
            Integer requiredNum = (Integer)(target - numbers[i]);
            if(indexMap.containsKey(requiredNum)){
                int toReturn[] = {indexMap.get(requiredNum), i};
                return toReturn;
            }

            indexMap.put(numbers[i], i);
        }
        return null;    
    }

    public static void main(String args[]){
        int[] nums = new int[]{7,2,11,15};
        int [] solution = twoSum(nums,9);
        for (int i = 0; i<solution.length; i++){
            System.out.println(solution[i]);
        }
    }
}