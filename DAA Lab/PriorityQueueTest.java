     

    //Java Program to Implement Heap Sort Using a Priority Queue

     

    import java.io.BufferedReader;

    import java.io.IOException;

    import java.io.InputStreamReader;

    import java.util.Arrays;

     

    class PriorityQueue{

        int[] arr;

        int size;

        int count;

        PriorityQueue(int size){

            this.size = size;

            arr = new int[size];

            count = 0;

        }

        // Function to insert an element into the priority queue

        void insert(int value){

            if(count == size){

                System.out.println("Cannot insert the key");

                return;

            }

            arr[count++] = value;

            heapifyUpwards(count);

        }

        // Function to heapify an element upwards

        void heapifyUpwards(int x){

            if(x<=0)

                return;

            int par = (x-1)/2;

            int temp;

            if(arr[x-1] < arr[par]){

                temp = arr[par];

                arr[par] = arr[x-1];

                arr[x-1] = temp;

                heapifyUpwards(par+1);

            }

        }

        // Function to extract the minimum value from the priority queue

        int extractMin(){

           int rvalue = arr[0];

           arr[0] = Integer.MAX_VALUE;

           heapifyDownwards(0);

           return rvalue;

        }

        // Function to heapify an element downwards

        void heapifyDownwards(int index){

            if(index >=arr.length)

                return;

            int temp;

            int min = index;

            int left,right;

            left = 2*index;

            right = left+1;

            if(left<arr.length && arr[index] > arr[left]){

                min =left;

            }

            if(right <arr.length && arr[min] > arr[right]){

                min = right;

            }

            if(min!=index) {

                temp = arr[min];

                arr[min] = arr[index];

                arr[index] = temp;

                heapifyDownwards(min);

            }

        }

        // Function to implement the heapsort using priority queue

        static void heapSort(int[] array){

            PriorityQueue object = new PriorityQueue(array.length);

            int i;

            for(i=0; i<array.length; i++){

                object.insert(array[i]);

            }

            for(i=0; i<array.length; i++){

                array[i] = object.extractMin();

            }

        }

    }

    public class PriorityQueueTest {

        // Function to read user input

        public static void main(String[] args) {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n;

            System.out.println("Enter the number of elements in the array");

            try{

                n = Integer.parseInt(br.readLine());

            }catch (IOException e){

                System.out.println("An error occurred");

                return;

            }

            System.out.println("Enter array elements");

            int[] array = new int[n];

            int i;

            for(i=0; i<array.length; i++){

                try{

                    array[i] = Integer.parseInt(br.readLine());

                }catch (IOException e){

                    System.out.println("An error occurred");

                }

            }

            System.out.println("The initial array is");

            System.out.println(Arrays.toString(array));

            PriorityQueue.heapSort(array);

            System.out.println("The sorted array is");

            System.out.println(Arrays.toString(array));

        }

    }