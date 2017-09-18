import java.util.*;

//Method1
public class ArraySort {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 6, 71, 43, 65};

        Arrays.sort(arr);

        for(int counter: arr){
            System.out.print(counter + " "); //1 3 4 5 6 43 65 71
        }
        System.out.println();

        for(int  i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + " "); //71 65 43 6 5 4 3 1
        }

        System.out.println();
        ArraySort newArr = new ArraySort();
        newArr.listSort2(); //99 65 13 5 3

    }

    //Method2 descending order
    public void listSort2 (){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(5);
        list.add(99);
        list.add(13);
        list.add(65);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for(int counter: list){
            System.out.print(counter + " ");
        }

    }

}
