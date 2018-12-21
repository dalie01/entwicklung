package dalieOCP.pattern.dao;

import java.util.Collection;

class Emp {
	int id;
	String name;
	int age;
	String address;
}

interface EmpDAO {
	
	public int create(Emp e);

	public Emp get(int id);

	public boolean delete(Emp e);

	public boolean update(Emp e);

	public Collection<Emp> getAll();
}

class EmpDAOImpl implements EmpDAO {

	public int create(Emp e) {
		/* connect to datastore, insert data for employee e */
		return 0;
	}

	public Emp get(int id) {
		/* connect to datastore, retrieve and return data for employee-id id */
		return new Emp();
	}

	public boolean delete(Emp e) {
		/* connect to datastore and delete data for employee-id e.id */
		return false;
	}

	public boolean update(Emp e) {
		/* connect to datastore and update employee data */
		return false;
	}

	public Collection<Emp> getAll() {
		/* connect to datastore, retrieve emp data, return as Collection */
		return null;
	}
}

class EmpDAOOracleImpl implements EmpDAO { 
	
	public int create(Emp e) {
		/* connect to datastore, insert data for employee e */
		return 0;
	}

	public Emp get(int id) {
		/* connect to datastore, retrieve and return data for employee-id id */
		return new Emp();
	}

	public boolean delete(Emp e) {
		/* connect to datastore and delete data for employee-id e.id */
		return false;
	}

	public boolean update(Emp e) {
		/* connect to datastore and update employee data */
		return false;
	}

	public Collection<Emp> getAll() {
		/* connect to datastore, retrieve emp data, return as Collection */
		return null;
	}
}
class EmpDAOMySQLImpl implements EmpDAO { 
	
	public int create(Emp e) {
		/* connect to datastore, insert data for employee e */
		return 0;
	}

	public Emp get(int id) {
		/* connect to datastore, retrieve and return data for employee-id id */
		return new Emp();
	}

	public boolean delete(Emp e) {
		/* connect to datastore and delete data for employee-id e.id */
		return false;
	}

	public boolean update(Emp e) {
		/* connect to datastore and update employee data */
		return false;
	}

	public Collection<Emp> getAll() {
		/* connect to datastore, retrieve emp data, return as Collection */
		return null;
	}
}

abstract class DAOFactory {
	public static int ORACLE = 1;
	public static int MYSQL = 2;

	public static EmpDAO getEmpDAOInstance(int DBtype) {
		if (DBtype == ORACLE)
			return new EmpDAOOracleImpl();
		else if (DBtype == MYSQL)
			return new EmpDAOMySQLImpl();
		else
			return null;
	}
}

class Execute {

	/*
	 * The exam might ask you whether it’s common to use the Factory
	 * pattern with the DAO pattern.
	 * The answer is yes.
	 * */
	
	public static void main(String[] args) {

		Emp emp = new Emp();
		emp.id = 10;
		emp.name = "Harry";
		emp.age = 39;
		emp.address = "UK";
		
		EmpDAO dao = new EmpDAOImpl();
		dao.create(emp);
		
		emp.name = "Harry M";
		emp.age = 40;
		dao.update(emp);
		
		Emp emp2 = dao.get(11);
		if (emp2 != null)
			dao.delete(emp2);
		
		
		EmpDAO empDAO = DAOFactory.getEmpDAOInstance(DAOFactory.ORACLE);
		Emp e = new Emp();
		e.id = 10; 
		e.name = "Harry";
		e.age = 39; 
		e.address = "UK";
		empDAO.create(emp);
		
		/*
		 * - It abstracts and encapsulates all access to a data source. It manages the connection
		 * to the data source to obtain and store data.
		 * It promotes programming to an interface. It completely hides the data access
		 * implementation from its clients.
		 * - It decouples the business logic layer and persistence layer. 
		 * It makes the code independent of any changes to a data source or its vendor 
		 * (for example, plaintext, XML, LDAP, MySQL, Oracle, or DB2).
		 * - It promotes flexibility. Because the interfaces accessible to client classes don’t change, 
		 * new implementation classes can be added.
		 * - The DAO pattern might also include Factory pattern classes.
		 * - It prevents tight coupling between client classes and DAO implementation
		 * classes. It promotes the creation of cohesive classes.
		 * - Factories are an example of the OO principle "program to an interface."
		 * */
	}
}
