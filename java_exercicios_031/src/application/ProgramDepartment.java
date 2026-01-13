package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProgramDepartment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n === Teste 1: Departamento findById ===");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n === Teste 2: Departamento findAll ===");
        List<Department> list = departmentDao.findAll();
        for(
                Department obj :list)

        {
            System.out.println(obj);
        }

        System.out.println("\n === Teste 3: Departamento insert ===");
        Department newDepartment = new Department(null, "Greg");
        departmentDao.insert(newDepartment);
        System.out.println("Inserido com sucesso! Novo id: "+ newDepartment.getId());

        System.out.println("\n === Teste 4: Departamento update ===");
        department = departmentDao.findById(1);
        department.setName("Marta Waine");
        departmentDao.update(department);
        System.out.println("Update com sucesso!  ");

        System.out.println("\n === Teste 5: Departamento delete ===");
        System.out.println("Digite o ID para o teste do delete: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Deletado com sucesso!  ");

        sc.close();
    }
}
