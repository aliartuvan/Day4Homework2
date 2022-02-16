import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concreate.NeroCustomerManager;
import Concreate.StarbucksCustomerManager;
import Entities.Customer;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {


    BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
    BaseCustomerManager baseCustomerManager1 = new NeroCustomerManager();
    Customer ali = new Customer(1,"Ali","Artuvan", LocalDate.of(1998,1,1),"98809582174");
    Customer baran = new Customer(2,"Baran","Artuvan",LocalDate.of(2000,12,19),"90049641542");


    baseCustomerManager1.save(ali);



    }

}
