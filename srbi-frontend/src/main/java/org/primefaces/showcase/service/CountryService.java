package org.primefaces.showcase.service;

import org.primefaces.showcase.domain.Country;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Named
@ApplicationScoped
public class CountryService {

    private List<Country> countries;

    @PostConstruct
    public void init() {
        countries = new ArrayList<>();

        String[] locales = Locale.getISOCountries();

        for (int i = 0; i < locales.length; i++) {
            Locale country = new Locale("", locales[i]);
            countries.add(new Country(i, country.getDisplayCountry(), country.getCountry().toLowerCase()));
        }

    }

    public List<Country> getCountries() {
        return new ArrayList<>(countries);
    }
}
