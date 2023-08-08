package com.weijunzhe.迭代器模式;

/**
 * <h3>design-patterns</h3>
 * <p>迭代器模式</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-08 10:25
 **/

public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            String next = (String) iterator.next();
            System.out.println("Name:" + next);
        }
    }
}
