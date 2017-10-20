package bericolor;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Configuration cfg=new Configuration();  
		    cfg.configure("hibernate.cfg.xml");
		    SessionFactory sessionFactory=cfg.buildSessionFactory();
		    Session session =sessionFactory.openSession();
		   /* SubEmploye emp=session.get(SubEmploye.class, 2);
		    System.out.println(emp.getFirstName());*/
		    Transaction tx;
		    tx=session.beginTransaction();
		    Employee e1=new Employee();
		    e1.setFirstName("med");
		    e1.setLastName("e1");
		    SubEmploye e2=new SubEmploye();
		    e2.setFirstName("coco");
		    e2.setLastName("e2");
		    e2.setVal(5);
		    session.persist(e1);
		    session.persist(e2);
		    tx.commit();
		    session.close();

	}

}
