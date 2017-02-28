package hello.test;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	@Cacheable(value = "reportcache", keyGenerator = "wiselyKeyGenerator")
	public ReportBean getReport(Long id, String date, String content, String title) {
		System.out.println("无缓存的时候调用这里---数据库查询");
		return new ReportBean(id, date, content, title);
	}
}
