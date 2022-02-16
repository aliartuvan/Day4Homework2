package Concreate;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerChackManager implements CustomerCheckService {
     public boolean checkIfRealPerson(Customer customer) {
        return  true;
    }
}
