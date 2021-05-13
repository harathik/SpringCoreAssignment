package com.controller.service.repository.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class SpringApplicationMain {
 public static void main(String[] args) {
 
  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
  CountryController controller = (CountryController) context.getBean("countryController");
  Country country = controller.createNewCountry();
  System.out.println("Country Name : " + country.getCountryName());
  System.out.println("Country's Population : " + country.getPopulation());
 }
}