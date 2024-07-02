package com.example;    
import java.util.List;

import com.example.model.Album;
import com.example.model.Child;
import com.example.model.Group;
import com.example.model.Member;
import com.example.model.Movie;
import com.example.model.Parent;
import com.example.repository.MemberRepository;
import com.example.repository.ParentRepository;
import com.example.repository.ProductRepository;

public class JPAMain {
	
	private final MemberRepository memberRepository;
	private final ProductRepository productRepository;
	private final ParentRepository parentRepository;
	
	public JPAMain() {
		memberRepository = new MemberRepository();
		productRepository = new ProductRepository();
		parentRepository = new ParentRepository();
	}
	
	public void parentTest() {
		Parent parent = new Parent();
		parent.setName("홍길동");
		//parent 정보 저장
		
		Child child1 = new Child();
		Child child2 = new Child();
//		child1.setParent(parent);
//		child2.setParent(parent);
//		
//		// 양방향 관계일 시 주의
//		parent.getChildList().add(child1);
//		parent.getChildList().add(child2);
		
		parent.addChild(child1);
		parent.addChild(child2);
		
//		parentRepository.saveChild(child1);
//		parentRepository.saveChild(child2);
		
		parentRepository.saveParent(parent);
//		System.out.println("parent : " + parent);
		parentRepository.updateParent(parent);
		
		Parent findParent = parentRepository.findParent(1L);
		System.out.println("findParent ID: " + findParent.getId()
							+ ", name: " + findParent.getName());
		
		parentRepository.removeParent(findParent);
	}
	
	public void memberTest() {
		Group group1 = new Group();
		group1.setName("그룹1");
		memberRepository.saveGroup(group1);
		
		Member member1 = new Member();
		member1.setUsername("유저1");
		Member member2 = new Member();
		member2.setUsername("유저2");
		
		member1.setGroup(group1);
		member2.setGroup(group1);
		
		memberRepository.saveMember(member1);
		memberRepository.saveMember(member2);
		
//		Member findMember1 = memberRepository.findMember(1L);
//		System.out.println("findMember1 : " + findMember1);
		
		List<Member> members = memberRepository.findAllMembers("유저2");
		for(Member member : members) {
			System.out.println(member);
		}
	}
	
	public void productTest() {
		Movie movie = new Movie();
		movie.setName("서울의 봄");
		movie.setPrice(14000);
		movie.setGenre("시대극");
		
		productRepository.saveProduct(movie);
		
		Album album = new Album();
		album.setName("에스파 정규 2집");
		album.setPrice(20000);
		album.setArtist("에스파");
		
		productRepository.saveProduct(album);
	}
	
	public static void main(String[] args) {
		JPAMain main = new JPAMain();
//		main.memberTest();
//		main.productTest();
		main.parentTest();
		
		
		
		
		
//		// EntityManagerFactory 생성
//		EntityManagerFactory entityManagerFactory = EntityManagerConfig.getEntityManagerFactory(); 
//		
//		// EntityManager를 생성
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		
//		// 트랜잭션을 생성
//		EntityTransaction transaction = entityManager.getTransaction();
//		
//		// 트랜잭션 시작
//		transaction.begin();
//		
//		try {
//			Group group1 = new Group();
//			group1.setName("그룹1");
//			entityManager.persist(group1);
//			
//			Member member = new Member();
//			member.setUsername("홍길동");
//			member.setPassword("1234");
//			member.setBirth(LocalDate.of(1990, 10, 30));
//			member.setGender(GenderType.MALE);
//			member.setGroup(group1);
//			group1.getMembers().add(member);
//			
//			// member 객체를 insert -> 영속성 컨텍스트 -> flush() -> DB insert
//			entityManager.persist(member);
//			
//			// 새로운 member2 생성하여 insert
//			Member member2 = new Member();
//			member2.setUsername("김개똥");
//			member2.setPassword("2222");
//			
//			group1.getMembers().add(member2);
//			
//			entityManager.persist(member2);
//			
//			// member 객체를 select
//			Member findMember1 = entityManager.find(Member.class, 1L);
//			System.out.println("findMember1: " + findMember1);
//			
//			Member findMember2 = entityManager.find(Member.class, 2L);
//			System.out.println("findMember2: " + findMember2);
//			
//			// member 객체를 update(별도의 메소드 호출 X, member객체의 setter로)
////			member.setEmail("hong@gmail.com");
//			
//			// member 객체를 delete
////			entityManager.remove(member);
//			
//			Group group2 = entityManager.find(Group.class, 1L);
//			System.out.println("group2: " + group2);
//			System.out.println("group2.members: " + group2.getMembers());
//			
//			transaction.commit();
//			entityManager.close();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		entityManagerFactory.close();
		
	}

}
