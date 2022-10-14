package com.weijunzhe.filter;

import java.util.List;

/**
 * <h3>design-patterns</h3>
 * <p>or 连接过滤器</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-14 08:49
 **/

public class OrCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        List<Person> otherCriteriaPersons = otherCriteria.meetCriteria(persons);

        for (Person otherCriteriaPerson : otherCriteriaPersons) {
            if (!firstCriteriaPersons.contains(otherCriteriaPerson)) {
                firstCriteriaPersons.add(otherCriteriaPerson);
            }
        }
        return firstCriteriaPersons;
    }
}
