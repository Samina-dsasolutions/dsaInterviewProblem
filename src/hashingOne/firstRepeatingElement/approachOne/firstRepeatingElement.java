package hashingOne.firstRepeatingElement.approachOne;

public class firstRepeatingElement {
    int firstRepeatingElement(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    return arr[j];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        firstRepeatingElement firstRepeatingElement = new firstRepeatingElement();
        System.out.println(firstRepeatingElement.firstRepeatingElement(new int[]{10, 5, 3, 4, 3, 5, 6}));
    }
}
