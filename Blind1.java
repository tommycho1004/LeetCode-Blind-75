import java.util.HashMap;
//this solution utilizes a hashmap
public class Blind1 {
    public static int[] twoSum(int[] nums, int target) {
        //create a new hashmap that can hold a key value pair of integers
        //keys being the element's integer value and value being the element's index
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        //run through the input array and perform functions
        for(int i = 0; i < nums.length; i++){
            //the required number is the complement of the target and the current element in the loop
            Integer complement = (Integer)(target - nums[i]);
            //if the hashmap contains the complement which when added to the current element equals
            //the target, it will store the complement's index and the current element's index into 
            //the desired return type of an int array
            if(map.containsKey(complement)){
                int solution[] = {map.get(complement), i};
                return solution;
            }
            //if the complement is not found, the current key value pair is stored into the hashmap
            //and the process will repeat with the next element of the input array
            map.put(nums[i], i);
        }
        //return null statement just in case ;)
        return null;    
    }
}
//this solution is pretty nice because the time complexity is O(n) since in the worst case scenario, 
//we would have to iterate through the entire input array. 
// -- JAVA SKILLS USED --
//Hashmap initialization: in line 7 to create a hashmap with key value pairs of Integers
//Type casting: in line 11 because the Hashmap deals with the type Integer not int
//Hashmap.containsKey(): in line 15 finds the desired key (the element's value in our case) in the map
//Hashmap.get(): in line 16 gets the value of the map that matches with the key
//Hashmap.put(): in line 21 stores a key value pair into the map