package service;

import vo.Category;
import vo.Task;

import java.util.List;

public interface TaskService {
    // category 등록
    void saveCategory(Category category);

    // 아이디로 category 조회
    Category findCategory(Long id);

    // 전체 category 조회
    List<Category> findCategories();

    // category 이름 변경
    void updateCategory(Category category);

    // category 삭제
    void removeCategory(Long id);

    // task 등록
    void saveTask(Task task);

    // task 상세 내용 조회
    Task findTask(Long id);

    // task 전체 목록 조회
    List<Task> findTasks();

    // task 완료 처리
    void completeTask(Long id);

    // task 삭제
    void removeTask(Long id);
}
