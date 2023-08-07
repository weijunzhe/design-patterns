package com.weijunzhe.过滤器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>design-patterns</h3>
 * <p>过滤器测试类</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-14 08:51
 **/

public class CriteriaPatternDemo {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("熊大", "male", "single"));
        personList.add(new Person("王二", "male", "married"));
        personList.add(new Person("张三靓", "female", "single"));
        personList.add(new Person("李思思", "female", "married"));
        personList.add(new Person("王五", "male", "single"));
        personList.add(new Person("赵六", "male", "married"));

        CriteriaMale criteriaMale = new CriteriaMale();
        CriteriaFemale criteriaFemale = new CriteriaFemale();
        CriteriaSingle criteriaSingle = new CriteriaSingle();
        AndCriteria singleMaleCriteria = new AndCriteria(criteriaMale, criteriaSingle);
        OrCriteria singleOrFemaleCriteria = new OrCriteria(criteriaFemale, singleMaleCriteria);

        System.out.println("Males:");
        printPersons(criteriaMale.meetCriteria(personList));

        System.out.println("\nFemales:");
        printPersons(criteriaFemale.meetCriteria(personList));

        System.out.println("\nSingle:");
        printPersons(criteriaSingle.meetCriteria(personList));

        System.out.println("\nSingle Male: ");
        printPersons(singleMaleCriteria.meetCriteria(personList));

        System.out.println("\nSingle Or Female: ");
        printPersons(singleOrFemaleCriteria.meetCriteria(personList));
    }

    private static void printPersons(List<Person> personList) {
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
