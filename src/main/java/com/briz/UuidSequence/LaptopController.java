package com.briz.UuidSequence;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {
	@Autowired
	LaptopRepository lrepo;
	
	@RequestMapping("/save")
	public String save()
	{
		Laptop l=new Laptop();
		l.setName("Dell");
		l.setPrice("40k");
		
		lrepo.save(l);
		return"data saved";
	}
	@RequestMapping("/saveall")
	public String saveall()
	{
		Laptop l1=new Laptop();
		l1.setName("Hp");
		l1.setPrice("35k");
		
		Laptop l2=new Laptop();
		l2.setName("Asus");
		l2.setPrice("38k");
		
		Laptop l3=new Laptop();
		l3.setName("Apple Macbook");
		l3.setPrice("90k");
		
		Laptop l4=new Laptop();
		l4.setName("Acer");
		l4.setPrice("48k");
		
		Laptop l5=new Laptop();
		l5.setName("Lenovo");
		l5.setPrice("53k");
		
		Laptop l6=new Laptop();
		l6.setName("Samsung");
		l6.setPrice("32k");
		
		Laptop l7=new Laptop();
		l7.setName("macbook pro");
		l7.setPrice("99k");
		
		Laptop l8=new Laptop();
		l8.setName("Hp 15s");
		l8.setPrice("43k");
		
		
		List<Laptop>list=Arrays.asList(l1,l2,l3,l4,l5,l6,l7,l8);
		lrepo.saveAll(list);
		
		return"multiples data are saved";
	}
		
		
		

}
