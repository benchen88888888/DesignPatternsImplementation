package Structural.Filter;

import java.util.List;

/**
 * Created by benchen on 11/26/16.
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
