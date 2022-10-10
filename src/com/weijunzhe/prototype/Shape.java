package com.weijunzhe.prototype;

/**
 * <h3>design-patterns</h3>
 * <p>形状类</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-10 21:43
 **/

public abstract class Shape implements Cloneable {
    // 标识
    private String id;
    // 形状类型
    protected String type;

    // 画
    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }


    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
