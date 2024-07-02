package com.example.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.example.config.EntityManagerConfig;
import com.example.model.Group;
import com.example.model.Member;

public class MemberRepository {
	
	// EntityManagerFactory 생성
	private final EntityManagerFactory entityManagerFactory = EntityManagerConfig.getEntityManagerFactory(); 
	
	// 회원정보 저장
	public void saveMember(Member member) {
		// EntityManager를 생성
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		// 트랜잭션을 생성
		EntityTransaction transaction = entityManager.getTransaction();
		
		try {
			// 트랜잭션 시작
			transaction.begin();
			
			entityManager.persist(member);
			
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			entityManager.close();
		}
	}
	
	// 그룹정보 저장
	public void saveGroup(Group group) {
		// EntityManager를 생성
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		// 트랜잭션을 생성
		EntityTransaction transaction = entityManager.getTransaction();
		
		try {
			// 트랜잭션 시작
			transaction.begin();
			
			entityManager.persist(group);
			
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			entityManager.close();
		}
	}
	
	// 회원정보 조회
	public Member findMember(Long id) {
		// EntityManager를 생성
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		try {
			return entityManager.find(Member.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		return null;
	}
	
	// 회원정보 전체조회
	public List<Member> findAllMembers(String name) {
		// EntityManager를 생성
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		try {
			// JPQL(JPA 공식지원. 쿼리를 직접 만들어야 함 - 오류확인 어려움, DB Table이 아닌 엔티티클래스로 조회) 
			// -> QueryDSL(메소드형식으로 쿼리 만드는것을 지원함 but 설치어려움)
			return entityManager.createQuery("select m from Member m where m.username = :username")
					.setParameter("username", name)
					.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		return null;
	}
	
	// 회원정보 수정
	
	// 회원정보 삭제
}
