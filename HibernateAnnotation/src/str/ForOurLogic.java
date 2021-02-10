package str;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ForOurLogic {

	public static void main(String[] args) {
 
		//To Connect the hibernate.cfg.xml
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		//To Connect the db
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
		
		
		Customers c1=new Customers();
		c1.setCustomerid(1001);
		c1.setCustomerName("likhit");
		
//		Customers c2=new Customers();
//		c2.setCustomerid(1002);
//		c2.setCustomerName("ompra");
//		
//		ArrayList<Customers>list1=new ArrayList<>();
//		list1.add(c1);
//		list1.add(c2);
		
		
		session.save(c1);
		
		t.commit();
		
		System.out.println("Inserted..");
		
		
		
		

	}

}
