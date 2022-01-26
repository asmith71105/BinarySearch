public class BinarySearch
{
    public static int binarySearch(int[] arr, int answer)
    {
        int size = arr.length;

        int min = 0;
        int max = size;
        int mid = (min + max)/2;
        int midTemp = 0;

        for(int i = 0; i < mid; i++)
        {
            midTemp = (min + max) / 2;

            if(answer > arr[midTemp])
            {
                min = midTemp;
            }

            else if(answer < arr[midTemp])
            {
                max = midTemp;
            }

            else if(answer == arr[midTemp])
            {
                return midTemp;
            } //end else if
        } //end for loop

        if(arr.length < 4)
        {
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] == answer)
                {
                    return i;
                } //end if statement
            } //end for loop
        } //end if statement
        return -1;
    } //end method
} //end class