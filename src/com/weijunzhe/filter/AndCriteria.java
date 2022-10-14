package com.weijunzhe.filter;

import java.util.List;

/**
 * <h3>design-patterns</h3>
 * <p>and连接过滤器</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-14 08:47
 **/

public class AndCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
