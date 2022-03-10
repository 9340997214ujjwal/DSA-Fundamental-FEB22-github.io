package com.ali;

import java.util.scanner;

class position 
      {
            static int find_index(int[] arr,int n,int k)
            {
                  for(int i = 0; i < n; i++)
                  if (arr [i] == k)
                    return i;

                  else if (arr[i] > k)
                       return i ;
                  return n;     
            }
            public static void main (string [] args)
            {
                  int [] arr = {1,3,5,6};
                  int n = arr.length;
                  int k = 2;

                      system.out.printin(find_index(arr,n,k));
            }
      }