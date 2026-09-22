class Solution {
    public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        // Add elements of arr1
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        // Add elements of arr2
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        // Convert set to ArrayList
        ArrayList<Integer> result = new ArrayList<>(set);

        // Sort in ascending order
        Collections.sort(result);

        return result;
    }
}