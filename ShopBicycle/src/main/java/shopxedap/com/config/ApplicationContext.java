package shopxedap.com.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration 
@ComponentScan(basePackages = {"shopxedap.com"})
@EnableWebMvc
@Import({SpringDataConfig.class, ThymeleafConfig.class})
@ImportResource("classpath:trace-context.xml")
@PropertySource("classpath:spring.properties")
public class ApplicationContext extends WebMvcConfigurerAdapter {
	
	// Maps resources path to webapp/resources
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	// Only needed if we are using @Value and ${...} when referencing properties
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySources = new PropertySourcesPlaceholderConfigurer();
		Resource[] resources = new ClassPathResource[] { 
				new ClassPathResource("spring.properties") };
		propertySources.setLocations(resources);
		propertySources.setIgnoreUnresolvablePlaceholders(true);
		return propertySources;
	}
	
	// Provides internationalization of messages--fgfgffgfggfg
	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("messages");
		return source;
	}
	
	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		argumentResolvers.add(new PageableHandlerMethodArgumentResolver());
	}
}
