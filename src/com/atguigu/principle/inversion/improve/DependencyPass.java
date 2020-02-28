package com.atguigu.principle.inversion.improve;

public class DependencyPass {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(changHong);
    }
}

// 方式1：通过接口传递实现依赖
// 开关的接口
interface IOpenAndClose {
    public void open(ITV tv);   // 抽象方法，接收接口
}

interface ITV {     // ITV接口
    public void play();
}

class ChangHong implements ITV {

    @Override
    public void play() {
        System.out.println("长虹电视 打开");
    }
}

// 实现接口
class OpenAndClose implements IOpenAndClose {

    @Override
    public void open(ITV tv) {
        tv.play();
    }
}

//// 方式2：通过构造方法依赖出传递
//interface IOpenAndClose {
//    public void open();
//}
//
//interface ITV {
//    public void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//    public ITV tv;
//    public OpenAndClose(ITV tv) {
//        this.tv = tv;
//    }
//
//    @Override
//    public void open() {
//        this.tv.play();
//    }
//}

//// 方式3，通过settter方法传递
//interface IOpenAndClose {
//    public void open();
//    public void setTv(ITV tv);
//}
//
//interface ITV {
//    public void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//    private ITV tv;
//
//    @Override
//    public void open() {
//        tv.play();
//    }
//
//    @Override
//    public void setTv(ITV tv) {
//        this.tv = tv;
//    }
//}