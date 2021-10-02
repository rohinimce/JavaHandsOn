package stringPrograms;

import java.util.Arrays;
import java.util.HashMap;

public class TryHandsOn {
    public static void main(String args[]) {

        hndsOn();

    }

    public static void hndsOn() {
       String arr[]={"mint","mini","mineral"};
       int size=arr.length;
       Arrays.sort(arr);
       int length= arr[0].length();
       StringBuilder result= new StringBuilder();
       for(int i=0;i<length;i++){
           if(arr[0].charAt(i)==arr[size-1].charAt(i)){
               result.append(arr[0].charAt(i));
           }else{
               break;
           }
       }
       System.out.println(result);
        }

    }
