import java.util.Collections;
import java.util.LinkedList;


public class Test {

    public static void main(String[] args) {
        LinkedList<User> theList = new LinkedList<>();
        User user1 = new User();
        user1.setName("tree");
        user1.setOrder(1);

        User user2 = new User();
        user2.setName("Orange");
        user2.setOrder(3);
        theList.add(user1);
        theList.add(user2);

        Collections.sort(theList);

        for(User counter: theList){
            System.out.println(counter.getName());
            System.out.println(counter.getOrder());

        }


    }
}


