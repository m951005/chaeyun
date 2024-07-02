package dao;

import vo.Category;
import vo.Task;

import java.util.List;

public interface TaskMapper {
    // catetory 생성
    void saveCategory(Category category);

    // category 이름 변경
    void updateCategory(Category category);

    // 아이디로 category 조회
    Category findCategoryById(Long id);

    // 전체 category 조회
    List<Category> findCategories();

    // category 삭제
    void removeCategoryById(Long id);

    // task 생성
    void saveTask(Task task);

    // task 상세 정보 조회
    Task findTaskById(Long id);

    // task 전체 조회
    List<Task> findTasks();

    // task 완료 처리
    void updateTask(Task task);

    // 아이디로 task 삭제
    void removeTaskById(Long id);

    // category 아이디로 task 삭제
    void removeTaskByCategoryId(Long id);
}
