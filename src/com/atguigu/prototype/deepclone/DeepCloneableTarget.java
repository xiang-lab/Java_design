package com.atguigu.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {

    private static final long serialVersionUID = 5987152584412222718L;
    private String cloneName;
    private String cloneClass;

    // 构造器
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneClass = cloneClass;
        this.cloneName = cloneName;
    }

    // 因为该类的属性都是String，所以使用默认的Clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
