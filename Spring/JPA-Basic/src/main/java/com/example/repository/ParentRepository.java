package com.example.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.example.config.EntityManagerConfig;
import com.example.model.Child;
import com.example.model.Parent;

public class ParentRepository {

	// EntityManagerFactory 생성
	private final EntityManagerFactory entityManagerFactory = EntityManagerConfig.getEntityManagerFactory();

	// parent 저장
	public void saveParent(Parent parent) {
		// EntityManager를 생성
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// 트랜잭션을 생성
		EntityTransaction transaction = entityManager.getTransaction();

		try {
			// 트랜잭션 시작
			transaction.begin();

			entityManager.persist(parent);

			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			entityManager.close();
		}
	}

	// child 저장
	public void saveChild(Child child) {
		// EntityManager를 생성
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// 트랜잭션을 생성
		EntityTransaction transaction = entityManager.getTransaction();

		try {
			// 트랜잭션 시작
			transaction.begin();

			entityManager.persist(child);

			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			entityManager.close();
		}
	}

	// parent 정보 조회
	public Parent findParent(Long id) {
		// EntityManager를 생성
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		try {
			Parent parent = entityManager.find(Parent.class, id);
			System.out.println(parent.getChildList());
			return parent;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

		return null;
	}

	// parent 정보 수정
	public void updateParent(Parent parent) {
		// EntityManager를 생성
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// 트랜잭션을 생성
		EntityTransaction transaction = entityManager.getTransaction();
		
		try {
			transaction.begin();
			Parent findParent = entityManager.find(Parent.class, parent.getId());
			findParent.getChildList().remove(1);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			entityManager.close();
		}

	}

	// parent 정보 삭제
	public void removeParent(Parent parent) {
		// EntityManager를 생성
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// 트랜잭션을 생성
		EntityTransaction transaction = entityManager.getTransaction();
		
		try {
			transaction.begin();
			Parent findParent = entityManager.find(Parent.class, parent.getId());
			entityManager.remove(findParent);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			entityManager.close();
		}

	}
}
