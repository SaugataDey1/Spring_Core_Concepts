package com.lcwd.core;

import Test.test;
import com.lcwd.core.couple.Mouse;
import com.lcwd.core.couple.Person;
import com.lcwd.core.couple.Samosa;
import com.lcwd.core.scope.Pepsi;
import com.lcwd.core.scope.Soda;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
// @ComponentScan(basePackages = {"", ""})
@ComponentScan(basePackages = {"com.lcwd.core", "Test", "scope"})

public class SpringCoreConceptsApplication
{
	public static void main(String[] args)
	{
	   //  About the Beans --> @Component

       //  About the Dependencies --> @Autowired

	   //  Where to search the beans --> com.lcwd.core.couple --> @SpringBootApplication --> for root Package
	   //  @ComponentScan(basePackages = {"", ""}) --> for other packages

	   /*  Animal animal = new Dog();
	       Person p = new Person(animal);
	   	   p.playWithAnimal();   */


		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);
		Person personBean = context.getBean(Person.class);
		personBean.playWithAnimal();

		test testBean = context.getBean(test.class);
		testBean.testing();

		/*
		Animal cat = context.getBean("cat", Animal.class);
		Animal dog = context.getBean("dog", Animal.class);
		cat.play();
		dog.play();
		*/

		/*
			// Bean Scope
			Pepsi bean = context.getBean(Pepsi.class);
			System.out.println(bean);
			// bean.drink();

			Pepsi bean2 = context.getBean(Pepsi.class);
			System.out.println(bean2);
		*/

		Mouse mouse = context.getBean(Mouse.class);
		System.out.println(mouse);

		System.out.println("// ----------------------------------------------------------------------");

		Pepsi pepsi1 = context.getBean(Pepsi.class);
		System.out.println(pepsi1);
		Soda soda1 = pepsi1.getSoda();
		System.out.println(soda1);

		Pepsi pepsi2 = context.getBean(Pepsi.class);
		System.out.println(pepsi2);
		System.out.println(pepsi2.getSoda());


	}

	/*
		// Declaring the Bean using @Bean

			@Bean(name = "samosa_1")
			@Primary
			public Samosa getSamosa_1()
			{
				return new Samosa("Sweet Samosa");
			}

			@Bean(name = "samosa_2")
			public Samosa getSamosa_2()
			{
				return new Samosa("Spicy Samosa");
			}

	 */



}
