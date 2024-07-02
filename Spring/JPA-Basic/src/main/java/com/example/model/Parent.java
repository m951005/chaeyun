package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Entity
public class Parent {
	@Id @GeneratedValue
	private Long Id;
	
	private String name;
	
	// LAZY 로딩은 바로 가져오지 않고 필요할 때 셀렉트 한다.
	/*
	 * cascade: 영속성 전이, 엔티티를 영속화할 때 연관된 엔티티를 함께 넣는다.
	 * . CascadeType.ALL: 모든 영속성 작업을 자식 엔티티도 함께 적용한다.
	 * . CascadeType.PERSIST: 부모 엔티티를 저장할 때 연관된 자식 엔티티도 함께 저장한다.
	 * . CascadeType.REMOVE: 부모 엔티티를 삭제할 때 연관된 자식 엔티티도 함께 삭제한다.
	 * . CascadeType.MARGE: 부모 엔티티를 병합할 때 연관된 자식 엔티티도 함께 병합한다.
	 * . CascadeType.REFRESH: 부모 엔티티를 새로고침 할 때 연관된 자식 엔티티도 함께 새로고침 한다.
	 * . CascadeType.DETACH: 부모 엔티티가 영속성 컨텍스트에서 분리될 때 연관된 자식 엔티티도 함께 분리된다.
	 * 
	 * orphanRemoval = true: 부모 엔티티와 연관관계가 끊어진 자식 엔티티를 자동으로 삭제한다.
	 */
	@OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Child> childList = new ArrayList<>();
	
	public void addChild(Child child) {
		childList.add(child);
		child.setParent(this);
	}

}
