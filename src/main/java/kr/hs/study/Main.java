package kr.hs.study;

import kr.hs.study.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

//        // TestBean의 이름 없는 객체 가져와서 obj1에 넣어서
//        TestBean obj1 = ctx.getBean("t1", TestBean.class);
//        System.out.println("obj1:"+obj1);
//
//        // TestBean의 이름 없는 객체 가져와서 obj2에
//        TestBean obj2 = ctx.getBean("t2", TestBean.class);
//        System.out.println("obj2:"+obj2);

        // t3 가지고 와서 obj3에 넣고 주고값 출력
        ctx.close();
    }
}