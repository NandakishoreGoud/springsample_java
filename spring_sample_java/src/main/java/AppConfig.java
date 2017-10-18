import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pluralsite.repository.CustomerRepository;
import com.pluralsite.repository.HibernateCustomerRepositoryImpl;
import com.pluralsite.service.CustomerService;
import com.pluralsite.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.pluralsite"})
public class AppConfig {

	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
	//-----SETTER INJECTION ELSE CONSTRUCTIOR INJECTION 
		//CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
	CustomerServiceImpl service = new CustomerServiceImpl();
		//service.setCustomerRepository(getCustomerRepository());
		return service;
	}
	
	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
return new HibernateCustomerRepositoryImpl();
}
	
	
	
}