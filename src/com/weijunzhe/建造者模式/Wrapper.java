package com.weijunzhe.建造者模式;

/**
 * <h3>design-patterns</h3>
 * <p>纸盒类</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-09 19:17
 **/

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "纸盒打包";
    }
}
