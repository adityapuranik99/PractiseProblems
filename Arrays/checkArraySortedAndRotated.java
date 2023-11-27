package Arrays;

public class checkArraySortedAndRotated {

    static void checkIfSortedRotated(int arr[], int n)
    {
        int minEle = Integer.MAX_VALUE;
        int maxEle = Integer.MIN_VALUE;

        int minIndex = -1;

        for(int i = 0; i < n; i++)
        {
            if(arr[i] < minEle)
            {
                minEle = arr[i];
                minIndex = i;
            }
        }
        boolean flag1 = true ;

        for(int i = 1; i < minIndex; i++)
        {
            if(arr[i] < arr[i-1])
            {
                flag1 = false;
                break;
            }
        }

        boolean flag2 = true;
        for(int i = minIndex+1; i<n; i++)
        {
            if(arr[i] < arr[i-1]);
        }
    }

}