import java.util.ArrayList;

public class RotateArray {
    public static void main(String[] args) {
        ArrayList <Integer> arrObj= new ArrayList<Integer>();
        int[] arr={1,2,3,4,5,6,7,8,9};
        for (int num : arr) {
            arrObj.add(num);
        }
        int k=3;
        int size=arrObj.size()-1;
        int start=0;
        while(k>0)
        {
            int lastElement=arrObj.get(size);
            arrObj.remove(size);
            arrObj.add(0,lastElement);
            System.out.println(arrObj.toString());
            k-=1;
        }
    }
}
