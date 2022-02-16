package Abstract;

import Entities.Customer;

public interface CustomerCheckService {
    default boolean checkIfRealPerson(Customer customer) {
    return true;
    }

}
