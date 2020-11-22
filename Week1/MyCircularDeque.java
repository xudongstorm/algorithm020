package firstweek;

/**
 * 641. 设计循环双端队列
 */
public class MyCircularDeque {

    private int arr[];
    private int curIndex;

    public MyCircularDeque(int k) {
        arr = new int[k];
    }

    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        for(int i=curIndex; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = value;
        curIndex++;
        return true;
    }

    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        arr[curIndex++] = value;
        return true;
    }

    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        for(int i=0; i<curIndex-1; i++){
            arr[i] = arr[i+1];
        }
        arr[curIndex-1] = 0;
        curIndex--;
        return true;
    }

    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        arr[curIndex-1] = 0;
        curIndex--;
        return true;
    }

    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return arr[0];
    }

    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return arr[curIndex-1];
    }

    public boolean isEmpty() {
        return arr==null || arr.length==0 || curIndex==0;
    }

    public boolean isFull() {
        return arr.length==curIndex;
    }
}
