package Commons.exceptions;

import Models.Customer;

import java.util.Comparator;

public class NameComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        if (o1.getName().equals(o2.getName())) {
            String[] year = o1.getBirthDay().split("/");
            String[] year2 = o2.getBirthDay().split("/");
            if (Integer.parseInt(year[year.length - 1]) > Integer.parseInt(year2[year2.length - 1])) {
                return 1;
            } else {
                return -1;
            }
        }
        return o1.getName().compareTo(o2.getName());
    }
}
