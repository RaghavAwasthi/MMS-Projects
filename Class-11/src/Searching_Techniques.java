public class Searching_Techniques {

    public static void main(String args[]){
        int arr[] = {10,20,30,58,69,1,52,52,40,50};
        int value = 130;
        int last=arr.length-1;
        binarySearch(arr,0,last,value);
    }

    public static void binarySearch(int arr[], int first, int last, int value){
        int mid = (first + last)/2; //yaha mid value nikal li
        for( ;first <= last; ){
            if ( arr[mid] < value ){
                first = mid + 1;
            }else if ( arr[mid] == value ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }

}

