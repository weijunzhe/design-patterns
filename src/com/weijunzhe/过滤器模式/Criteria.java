package com.weijunzhe.过滤器模式;

import java.util.List;

/**
 * <h3>design-patterns</h3>
 * <p>标准接口</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-14 08:37
 **/
public interface Criteria {

    public List<Person> meetCriteria(List<Person> persons);
}
