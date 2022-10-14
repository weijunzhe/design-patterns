package com.weijunzhe.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>design-patterns</h3>
 * <p>未婚过滤器</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-14 08:44
 **/

public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersonList = new ArrayList<>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersonList.add(person);
            }
        }
        return singlePersonList;
    }
}
