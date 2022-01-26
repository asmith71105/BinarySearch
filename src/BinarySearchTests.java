import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTests
{
    int[] arr2 = {3, 4, 5};
    int[] arr4 = {2, 3, 4, 7, 8};
    int[] arr5 = {10, 11, 12, 13};

    @Test
    void binarySearchFindIndex2()
    {
        int expected = -1;
        int actual = BinarySearch.binarySearch(arr2, 2);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchFindIndex3()
    {
        int expected = -1;
        int actual = BinarySearch.binarySearch(arr4, -1);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchFindIndex4()
    {
        int expected = -1;
        int actual = BinarySearch.binarySearch(arr5, 0);
        assertEquals(expected, actual);
    }
}