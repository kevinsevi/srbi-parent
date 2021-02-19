/*
 * Copyright 2009-2014 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.showcase.view.data.datatable;

import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.showcase.domain.Customer;
import org.primefaces.showcase.service.CountryService;
import org.primefaces.showcase.service.CustomerService;

@Named("dtFilterView")
@ViewScoped
public class FilterView implements Serializable {

    private List<Customer> customers1;
    private List<Customer> customers2;

    private List<Customer> filteredCustomers1;
    private List<Customer> filteredCustomers2;

    @Inject
    private CustomerService service;

    @Inject
    private CountryService countryService;

    @PostConstruct
    public void init() {
        customers1 = service.getCustomers(50);
        customers2 = service.getCustomers(50);
    }

    public List<Customer> getCustomers1() {
        return customers1;
    }

    public List<Customer> getCustomers2() {
        return customers2;
    }

    public List<Customer> getFilteredCustomers1() {
        return filteredCustomers1;
    }

    public void setFilteredCustomers1(List<Customer> filteredCustomers1) {
        this.filteredCustomers1 = filteredCustomers1;
    }

    public List<Customer> getFilteredCustomers2() {
        return filteredCustomers2;
    }

    public void setFilteredCustomers2(List<Customer> filteredCustomers2) {
        this.filteredCustomers2 = filteredCustomers2;
    }

    public void setService(CustomerService service) {
        this.service = service;
    }
}
