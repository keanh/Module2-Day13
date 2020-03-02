public class Main {
    public int BinarySearch(int[] arr,int low,int high,int number){
        if (high >= low){
            int mid = (low+high)/2;
            if (arr[mid] == number){
                return mid;
            }
            if (arr[mid] > number){
                return BinarySearch(arr,low,mid-1,number);
            }
            return BinarySearch(arr,mid+1,high,number);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int low = 0;
        int high = arr.length;
        int number = 3;
        Main main = new Main();
        int result = main.BinarySearch(arr,low,high,number);
        if (result == -1){
            System.out.println("Không tìm thấy phần tử " + number);
        }else{
            System.out.println("Phần tử " + number + " ở vị trí " + result);
        }
    }
}
