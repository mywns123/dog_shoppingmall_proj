package dog_shoppingmall_proj.dao.impl;

import java.sql.Connection;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import dog_shoppingmall_proj.JdbcUtil;
import dog_shoppingmall_proj.dto.Dog;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DogDaoImplTest {
private static Connection con = JdbcUtil.getConnection();
private static DogDaoImpl dao = DogDaoImpl.getInstance();
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao.setCon(con);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void test04SelectDogList() {
		System.out.printf("%s()%n", "test04SelectDogList()");
		List<Dog> list = dao.selectDogList();
		Assert.assertNotNull(list);
		
		list.stream().forEach(System.out::println);
	}

	@Test
	public void test02SelectDog() {
		System.out.printf("%s()%n", "test02SelectDog()");
		int id = 1;
		Dog res = dao.selectDog(id);
		Assert.assertNotNull(res);
		System.out.println("SelectDog >> " + res);
	}

	@Test
	public void test01InsertDog() {
		System.out.println("test01InsertDog()");
		Dog dog = new Dog(
				"푸들4",1000,"pu.jpg","프랑스",1,20,"털 많다");
		int res = dao.insertDog(dog);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test03UpdateReadCount() {
		System.out.println("test03UpdateReadCount()");
		int id = 1;
		int res = dao.updateReadCount(id);
		Assert.assertNotEquals(-1, res);
		System.out.println("UpdateReadCount >> " + res);
	}

}
