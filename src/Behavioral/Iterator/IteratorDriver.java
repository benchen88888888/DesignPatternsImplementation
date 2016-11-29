package Behavioral.Iterator;

/**
 * Created by benchen on 11/26/16.
 */
public class IteratorDriver {
    public static void main(String args[]){
        System.out.println("Iterator Pattern");
        NameRepository nameRepository = new NameRepository();

        for(Iterator iter = nameRepository.getIterator();iter.hasNext();){
            String name = (String) iter.next();
            System.out.println("Name: " + name);
        }
    }
}
