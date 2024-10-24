public class maxsum {
    public static void main(String[] args) {
        int arr[]={2,4,3,5,6,4,3,2,4,3};
        int curr=0;
        int w=3;
        for(int i=0;i<w;i++){
            curr=curr+arr[i];
        }
        int max=curr;
        for(int i=1;i<=arr.length-w;i++){
            curr=curr-arr[i-1]+arr[i+w-1];
            if(curr>max){
                max=curr;
            }
        }
        System.out.println(max);
    }
}
