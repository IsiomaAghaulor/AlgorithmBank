import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZeros {
        public  void duplicateZeros(int []arr){
            Queue<Integer> arrElements = new LinkedList<>();
            for(int i = 0; i < arr.length; i++){
                if(arr[i]==0){
                    arrElements.add(arr[i]);
                    arrElements.add(arr[i]);
                }else {
                    arrElements.add(arr[i]);
                }
                Integer firstElementOfQueue = arrElements.poll();
                arr[i]=firstElementOfQueue;
            }
        }
    }

