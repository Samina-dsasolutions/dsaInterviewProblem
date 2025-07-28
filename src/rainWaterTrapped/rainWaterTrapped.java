package rainWaterTrapped;

public class rainWaterTrapped {
    int getRainWaterTrapped(int arr[]){
       int lmax[];
       int rmax[];
       int leftmaxval;
       int rightmaxval;
       int ans=0;
       int actualHeight;
       lmax=getLeftMax(arr);
       rmax=getRightMax(arr);

       for(int i=0;i<arr.length;i++){
           leftmaxval=lmax[i];
           rightmaxval=rmax[i];
           actualHeight=arr[i];
           ans+=Math.abs(actualHeight-(Math.min(leftmaxval,rightmaxval)));
       }
       return ans;
    }
    int[] getLeftMax(int arr[]){
        int lmax[]=new int[arr.length];
        lmax[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            lmax[i] = Math.max(arr[i],lmax[i-1]);
        }
        return lmax;
    }
    int[] getRightMax(int arr[]){
        int rmax[]=new int[arr.length];
        rmax[arr.length-1]=arr[arr.length-1];
        for(int i= arr.length-2;i>=0;i--){
            rmax[i]=Math.max(arr[i],rmax[i+1]);
        }
        return rmax;
    }
    public static void main(String[] args) {
        rainWaterTrapped rt = new rainWaterTrapped();
        System.out.println(rt.getRainWaterTrapped(new int[]{0, 1, 0, 2}));
        System.out.println(rt.getRainWaterTrapped(new int[]{1, 2}));
    }
}
