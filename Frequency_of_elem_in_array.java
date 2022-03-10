package array;

public class frequency_of_elem_in_awway {
      public static int frequency_count (int arr[], int target, boolean bound) {
            int low = 0;
            int result = -1;
            int high = arr.length-1 ;
            while (low <= high) {
                  int mid = low +(high -low) /2;
                  if (arr [mid]==target) {
                        result = mid;
                        if (bound == true) {
                              high = mid - 1;
                        }
                        else {
                              low = mid+1;
                        }
                  }
                  else if (arr [mid] < target) {
                        low = mid+1;
                  }
                  else {
                        high = mid-1 ; 
                  }
            }
            return result;
      }
      public static void main (string [] arys) {
            int arr [] = {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
            int target = 6;
            int upperbound = frequence_count(arr,target,true);
            int lower_bound = frequence_count (arr,target,false);
            int freq = lower_bound_upperbound +1;
            system.out.printin (freq);

      }
}