package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: department insert ===");
		Department newDepartment = new Department(null, "Engineering");
		departmentDao.insert(newDepartment);
		System.out.println("New department inserted! Id = " + newDepartment.getId());
		
		System.out.println("\n=== TEST 2: department update ===");
		Department dep = new Department(3, "Construction");
		departmentDao.update(dep);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 3: department delete ===");
		System.out.print("Enter Id of department to delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");

		sc.close();

	} 

}
