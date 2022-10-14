package com.weijunzhe.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>design-patterns</h3>
 * <p>女人过滤器</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-14 08:42
 **/

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersonList = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersonList.add(person);
            }
        }
        return femalePersonList;
    }
}
