package org.arpit.javapostsforlearning;
import org.springframework.beans.factory.annotation.Required;
public class Country {
 
    String countryName;
    Capital capital;
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public Capital getCapital() {
        return capital;
    }
 
    @Required
    public void setCapital(Capital capital) {
        this.capital = capital;
    }
}