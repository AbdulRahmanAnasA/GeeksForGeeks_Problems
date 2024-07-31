class HelloWorld {
    public static void main(String[] args) {
        int arr[]={5, 6, 7, 8, 9};
        int n=5;
        int k=5;
    int count=0;
        
        for(int i=0;i<n;i++){
           int xor=0;
            for(int j=i;j<n;j++){
                xor=xor^arr[j];
                if(xor==k){
                    count++;
                }
            }
        }
        System.out.print(count);
        
        
        
    }
}
