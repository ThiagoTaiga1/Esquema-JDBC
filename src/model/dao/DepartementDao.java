package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartementDao {
	//INSERIR,UPDATE,DELETE OBJETO NO BD , COMO PARAMETRO DE ENTRADA !
		void insert (Department obj);
		void update (Department obj);
		void deleteByIdd(Integer id);
		//PEGAR ID , CONSULTAR OBJ COM ESSE ID !
		Department findById(Integer id);
		//RETORNAR TODOS OS DEPARTAMENTOS !
		List<Department> findAll();
}
