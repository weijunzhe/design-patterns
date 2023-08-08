package com.weijunzhe.迭代器模式;

/**
 * <h3>design-patterns</h3>
 * <p>名称仓库</p>
 *
 * @author : weijunzhe
 * @date : 2023-08-08 10:21
 **/

public class NameRepository implements Container {

    public String[] names = {"Robert", "John", "Julie", "Lora"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;


        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
