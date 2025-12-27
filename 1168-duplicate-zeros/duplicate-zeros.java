class Solution {
    public void duplicateZeros(int[] arr) {
        int c = 0;
        for(int a : arr){
            if(a == 0){
                c++;
            }
        }
        int i = arr.length-1, j = ((arr.length-1)+c);
        while(i >= 0 && i < j){
            write(arr , i , j--);
            if(arr[i] == 0){
                write(arr , i , j--);
            }
            i--;
        }
    }
    public void write(int arr[], int i, int j){
        if(j < arr.length){
            arr[j] = arr[i];
        }
    }
}