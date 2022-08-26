def two_sum(nums: list[int], target: int) -> list[int]:
    #create an empty dictionary (same as key value hashmap in java)
    dict = {}
    #enumerate nums to make a list of key value pairs of element index and element value 
    for i, n in enumerate(nums):
        #the complement is the number we need to get the solution with this particular element
        complement = target - n
        #if the complement is in the dictionary as a value, set a variable to the index of the input
        #array by calling the element index of the complement by its key (the element value)
        # then return the solution
        if complement in dict:
            j = dict[complement]
            return [i, j]
        #if the complement is not yet in our dictionary, then we add the current index, value pair to it
        #using the element value as the key and the element index as the value (dont be confused by the names)
        else:
            dict[n] = i
        #after adding to our dictionary, repeat the process again with the next element in the input array

#This solution is pretty much the same as the Java one and also has runtime O(n). It effectively uses
#the enumerate function in python to make the input easy to use!
# -- PYTHON SKILLS USED --
#Creating an empty dictionary: in line 3 
#enumerate(): in line 5 to split the input array into index, value pairs
#calling a dictionary value by its key: in line 12. rememeber, the key is the element's value and the value is the element's index
#adding to a dictionary: in line 17. you can add to a dictionary in the form dict[key] = value