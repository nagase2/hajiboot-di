package com.example.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean //DIコンテナに管理させたいBeanを生成するメソッドに＠Beanアノテーションを付ける
	Calculator calculator123(){
		//この例では、AddCalculatorインスタンスが、Calculator型でcalculatorという名前でDIコンテナにSingletonとして管理される
		return new AddCalculator();
	}
	
	@Bean
	ArgumentResolver argumentResolver(){
		return new ScannerArgumentResolver();
	}
	
}
