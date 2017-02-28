package hello.dubbo;


import com.alibaba.dubbo.config.annotation.Service;
import com.google.gson.Gson;
import com.jon.show.model.Person;
import com.jon.show.service.IDubboPersonService;

@Service(version="1.0.0", provider="providerConfig2")
public class PersonServiceImpl implements IDubboPersonService{
	
	@Override
	public String toJson(Person person) {
		Gson gson = new Gson();
		return gson.toJson(person);
	}

}
