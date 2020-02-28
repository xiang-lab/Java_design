package com.atguigu.principle.inversion;

public class DependecyInversion {
    public static void main(String[] args) {
        Persion persion = new Persion();
        persion.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息: hello world";
    }
}

/*
    完成Persion接受消息
    方式1分析
    1.简单，比较容易想到
    2.如果我们获取的对象是“微信”，“短信”等，则新增类，同时Persion也要增加相应的接受方法
    3.解决思路：引入一个抽象接口IReceiver，表示接收者，这样Perion类与接口IReceive发生依赖
      因为Email,weixin等等属于接受的范围，他们各自实现IReceiver接口就OK，这样我们就父合依赖倒转原则
 */
class Persion {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
