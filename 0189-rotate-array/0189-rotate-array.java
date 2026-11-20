class Solution {
    public void rotate(int[] arr, int d) {
        
            d=d%arr.length;
        
        int arr1[] = new int[d];
        // code here
        for(int i = arr.length-d, j=0;i<arr.length;i++){
            arr1[j]=arr[i];
            j++;
        }
        for(int i=arr.length-1;i>=d;i--){
            arr[i]=arr[i-d];
        }
        for(int i=0;i<d;i++){
            arr[i]=arr1[i];
            
        }
    }
}