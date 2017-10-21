package bericolor;



import org.hibernate.Query;
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
		    Session session1 =sessionFactory.openSession();
		    Employee emp=session1.get(Employee.class, 1);
		    session1.close();
		    Session session2 =sessionFactory.openSession();
		    Employee emp2=session2.get(Employee.class, 1);
		    Query query= session2.createQuery("select e from Employee e where id=1");
		    query.setCacheable(true);
		    Employee e2=(Employee) session2.createQuery("select e from Employee e where id=1").getSingleResult();

		    session2.close();
	}

}
