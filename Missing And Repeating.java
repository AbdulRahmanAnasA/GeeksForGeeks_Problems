class Solve {
    int[] findTwoElement(int arr[], long n) {
          long s2n=(n*(n+1)*(2*n+1))/6;
          long sn=(n*(n+1))/2;
          
          long s1=0;
          long s2=0;
          for(int i=0;i<n;i++){
              s1+=arr[i];
              s2+=(long) arr[i]*(long) arr[i];
          }
          long val1=s1-sn;
          long val2=s2-s2n;
          
          val2=val2/val1;
          
          long x=(val1+val2)/2;
          long y=x-val1;
          int nas[]={(int) x,(int) y};
          
          return nas;
          
    }
}
