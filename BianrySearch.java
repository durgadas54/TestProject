public class BianrySearch {
    public static void main(String[] args) {
        int[] arr={0, 1, 21, 33, 45, 45, 61, 71, 72, 73};

        System.out.println("Result is "+binarySearch(arr,33));
    }
    public static int binarySearch(int[] array, int target) {
        // Write your code here.
        return binarySearch(array,target,0,array.length-1);
    }

    public static int binarySearch(int [] array,int target,int start,int end){
        if(end > start){
            return -1;
        }
        int mid= (start+end) / 2;
        int match=array[mid];
        if(match == target){
            return mid;
        }
        else if(match>target){
            return binarySearch(array,target,start,mid-1);
        }
        else {
            return binarySearch(array,target,mid+1,end);
        }


    }
}
