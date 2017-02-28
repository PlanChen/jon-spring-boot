package hello.test;

import javax.annotation.Resource;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class TestRedisTemple implements ApplicationListener<ContextRefreshedEvent>{
	@Resource
	private RedisTemplate<String, String> redisTemplate;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
//		redisTemplate.opsForValue().set("11", "111");
//		System.out.println(redisTemplate.opsForValue().get("111"));
		System.out.println("121312321");
	}

}
