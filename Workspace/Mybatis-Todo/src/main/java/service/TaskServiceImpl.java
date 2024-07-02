package service;

import dao.TaskDao;
import exception.NoSuchCategoryException;
import exception.NoSuchTaskException;
import vo.*;

import java.util.List;

public class TaskServiceImpl implements TaskService {

    private final TaskDao dao = new TaskDao();

    @Override
    public void saveCategory(Category category) {
        dao.saveCategory(category);
    }

    @Override
    public Category findCategory(Long id) {
    	if(dao.findCategoryById(id) == null) throw new NoSuchCategoryException();
    	return dao.findCategoryById(id);
    }

    @Override
    public List<Category> findCategories() {
    	return dao.findCategories();
    }

    @Override
    public void updateCategory(Category category) {
    	dao.updateCategory(category);
    }

    @Override
    public void removeCategory(Long id) {
    	findCategory(id);
        dao.removeCategoryById(id);
    }

    @Override
    public void saveTask(Task task) {
        dao.saveTask(task);
    }

    @Override
    public Task findTask(Long id) {
    	if(dao.findTaskById(id) == null) throw new NoSuchTaskException();
    	return dao.findTaskById(id);
    }

    @Override
    public List<Task> findTasks() {
    	return dao.findTasks();
    }

    @Override
    public void completeTask(Long id) {
    	Task task = findTask(id);
    	if(task != null) {
    		task.setStatus(StatusType.COMPLETE);
    		dao.updateTask(task);
    	}
    }

    @Override
    public void removeTask(Long id) {
    	findTask(id);
        dao.removeTask(id);
    }
}
