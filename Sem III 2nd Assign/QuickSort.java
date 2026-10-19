import java.util.Arrays;

public class QuickSort {
    static void quickSort(int a[],int s,int e){
        if(s<=e){
            int pi = helper(a,s,e);
            quickSort(a,s,pi-1);
            quickSort(a,pi-1,e);
        }
    }

    static int helper(int[] a,int s,int e){
        int pi=a[e];
        int i=s-1;
        for(int j=s;j<e;j++){
            if(a[j]<pi) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        int temp = a[e];
        a[e] = a[i];
        a[i] = temp;
        return i;
    }
    public static void main(String[] args){
        int[] a = {3,4,5,2,7,2,3,4,7,2};
        System.out.println(Arrays.toString(a));
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
