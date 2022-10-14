package com.weijunzhe.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>design-patterns</h3>
 * <p>男人过滤器</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-14 08:40
 **/

public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersonList = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersonList.add(person);
            }
        }
        return malePersonList;
    }
}
