import java.util.ArrayList;

public class App {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);

            int childIndex = arr.size() - 1;
            int parentIndex = (childIndex - 1) / 2;

            while (arr.get(childIndex) < arr.get(parentIndex)) {
                int temp = arr.get(childIndex);
                arr.set(childIndex, arr.get(parentIndex));
                arr.set(parentIndex, temp);

                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int index) {
            int leftIndex = 2 * index + 1;
            int rightIndex = 2 * index + 2;
            int minIndex = index;

            if (leftIndex < arr.size() && arr.get(minIndex) > arr.get(leftIndex)) {
                minIndex = leftIndex;
            }
            if (rightIndex < arr.size() && arr.get(minIndex) > arr.get(rightIndex)) {
                minIndex = rightIndex;
            }

            if (minIndex != index) {
                int temp = arr.get(index);
                arr.set(index, arr.get(minIndex));
                arr.set(minIndex, temp);

                heapify(minIndex);
            }
        }

        // First swap the first and the last element, then remove the last element, fix
        // the heap using a function called heapify
        public int delete() {
            // swap first and last element
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // delete last
            arr.remove(arr.size() - 1);

            // heapify
            heapify(0);
            return temp;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) throws Exception {
        Heap heap = new Heap();
        heap.add(3);
        heap.add(4);
        heap.add(1);
        heap.add(5);

        while (!heap.isEmpty()) {
            System.out.println(heap.peek());
            heap.delete();
        }
    }
}
