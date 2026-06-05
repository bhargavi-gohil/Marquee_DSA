// Find Geometric Triplet:   arr[j] / arr[i] = r and arr[k] / arr[j] = r
public class GTriplet {
    public static void triplets(int[] arr,int n){
        System.out.println("Geometric Triplet: ");
        int i = 0;
        for(int j=i+1; j<n-1; j++){
            int k = j+1;
            while(i >= 0){
                if(arr[j]*arr[j] == arr[k]*arr[i]){
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 16};
        // int count = 0;
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = i+1; j < arr.length; j++){
        //         for(int k = j+1; k < arr.length; k++){
        //             if(arr[j] / arr[i] == arr[k] / arr[j] && arr[j] % arr[i] == 0 && arr[k] % arr[j] == 0){
        //                 count++;
        //                 System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
        //             }
        //         }
        //     }
        // }
        // System.out.println("count triplets: " + count);
        triplets(arr, 5);
    }
}