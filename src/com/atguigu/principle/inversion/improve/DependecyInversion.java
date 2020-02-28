package com.atguigu.principle.inversion.improve;

public class DependecyInversion {
    public static void main(String[] args) {
        Persion persion = new Persion();
        persion.receive(new Email());
        persion.receive(new WeiXin());
    }
}

// 定义接口
interface IReceiver {
    public String getInfo();
}

class Email implements IReceiver{
    public String getInfo() {
        return "电子邮件信息: hello world";
    }
}

class WeiXin implements IReceiver {

    @Override
    public String getInfo() {
        return "微信信息：hello, ok";
    }
}

// 方式2
class Persion {
    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}
