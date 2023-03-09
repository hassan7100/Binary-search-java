public class Main {
    public static int search(int[] nums, int target) {
        int min=0;
        int max=nums.length-1;
        int mid=(max+min)/2;
        int index=-1;
        while(true){
            if(target<nums[mid]){
                max=mid;
                mid=(max+min)/2;
            }
            if(target>nums[mid]){
                min=mid;
                mid=(max+min)/2;

            }
            if(target==nums[mid]){
                index=mid;
                break;
            }
            if(target==nums[max]){
                index=max;
                break;
            }
            if(target==nums[min]){
                index=min;
                break;
            }
            if(max==mid||min==mid){
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(search(arr,5));
    }
}