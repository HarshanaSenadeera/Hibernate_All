import lk.ijse.hibernate.embedded.Name;
import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.Factoryconfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Appinizializor {

    public static void main(String[] args) {

        Name name = new Name();
        name.setfName("Dasun");
        name.setsName("Thisara");
        name.setlName("Kawishka");

       /* Customer c2 = new Customer();
        c2.setId("0003");
        c2.setName(name);
        c2.setAddress("Matara");
        c2.setSalary(50000);*/

        /*Customer c2 = new Customer();
        c2.setId("0001");
        c2.setName("Dineth");
        c2.setAddress("Kumarakanda");
        c2.setSalary(40000);*/

        Customer c3 = new Customer();
        c3.setId("0004");
        c3.setName(name);
        c3.setAddress("Galle");
        c3.setSalary(56000);

        Session session = Factoryconfiguration.getInstance().session();

        Transaction transaction = session.beginTransaction();





        session.save(c3);
        /*update
        session.update(c2);*/

        /*get
        Customer customer = session.get(Customer.class, "0002");
        System.out.println(customer);*/

        /*Customer customer = session.get(Customer.class, "0002");
        session.delete(customer);*/

        transaction.commit();

        session.close();
    }
}


