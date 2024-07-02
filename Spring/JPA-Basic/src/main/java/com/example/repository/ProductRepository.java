package com.example.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.example.config.EntityManagerConfig;
import com.example.model.Group;
import com.example.model.Member;
import com.example.model.Product;

public class ProductRepository {
	
	// EntityManagerFactory 생성
	private final EntityManagerFactory entityManagerFactory = EntityManagerConfig.getEntityManagerFactory(); 
	
	// 회원정보 저장
	public void saveProduct(Product product) {
		// EntityManager를 생성
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		// 트랜잭션을 생성
		EntityTransaction transaction = entityManager.getTransaction();
		
		try {
			// 트랜잭션 시작
			transaction.begin();
			
			entityManager.persist(product);
			
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			entityManager.close();
		}
	}
	
}
