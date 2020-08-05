package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	//INSERIR,UPDATE,DELETE OBJETO NO BD , COMO PARAMETRO DE ENTRADA !
	void insert (Seller obj);
	void update (Seller obj);
	void deleteByIdd(Integer id);
	//PEGAR ID , CONSULTAR OBJ COM ESSE ID !
	Seller findById(Integer id);
	//RETORNAR TODOS OS DEPARTAMENTOS !
	List<Seller> findAll();
	//ASSINATURA DO METODO 
	List<Seller> findByDepartment(Department department);
}


