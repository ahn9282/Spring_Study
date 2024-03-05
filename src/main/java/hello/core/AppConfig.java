package hello.core;

import hello.core.docount.FixDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRespository;
import hello.core.oreder.OrderService;
import hello.core.oreder.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService(){

        return new MemberServiceImpl(new MemoryMemberRespository());

    }

    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRespository(),
                                        new FixDiscountPolicy() );
    }
}
