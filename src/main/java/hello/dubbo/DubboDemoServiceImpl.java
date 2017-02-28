package hello.dubbo;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;

import com.alibaba.dubbo.config.annotation.Service;
import com.jon.show.service.IDubboDemoService;

@Service(version="1.0.0",provider="providerConfig1")
public class DubboDemoServiceImpl implements IDubboDemoService{
	
	@Resource
	private RedisTemplate<String, String> redisTemplate;

	@Override
	public String sayHello(String name) {
		redisTemplate.opsForValue().set("11", "11");
		System.out.println(redisTemplate.opsForValue().get("11"));
		return "hello " + name;
	}

	@Override
	public String sayYourAge(int age) {
		return null;
	}

}
