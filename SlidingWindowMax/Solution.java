public class Solution {
    public int[] maxSlidingWindow(int[] array, int width) {
        if(array==null||array.length==0) return new int[0];
        Deque<Integer> doubleQueue = new LinkedList<Integer>();
       
        int [] maxArray = new int[array.length - width + 1];
        for (int i = 0; i < width; i++) {
            while(!doubleQueue.isEmpty() && array[i] > array[doubleQueue.peekLast()])
                doubleQueue.removeLast();
            doubleQueue.addLast(i);
        }
        maxArray[0] = array[doubleQueue.peekFirst()];
        //then try to move the window right and pop 
        for (int i = width; i < array.length; i++) {
            if (doubleQueue.peekFirst() == i-width) // if old max out of range, remove the first max element
                doubleQueue.removeFirst();
            while(!doubleQueue.isEmpty() && array[i] > array[doubleQueue.peekLast()])
                doubleQueue.removeLast();
            doubleQueue.addLast(i);
            
            maxArray[i-width+1] = array[doubleQueue.peekFirst()]; // first element will be the max;
        }
        return maxArray;
        
    }
}
