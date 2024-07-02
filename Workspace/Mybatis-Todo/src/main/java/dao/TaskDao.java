package dao;

import config.MybatisConfig;
import exception.NoSuchCategoryException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import vo.Category;
import vo.Task;

import java.util.List;

public class TaskDao {
    private SqlSessionFactory sqlSessionFactory = MybatisConfig.getSqlSessionFactory();

    // category 등록
    public void saveCategory(Category category) {
    	try(SqlSession sqlSession = sqlSessionFactory.openSession()){
    		TaskMapper mapper = sqlSession.getMapper(TaskMapper.class);
    		mapper.saveCategory(category);
    		sqlSession.commit();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }

    // 아이디로 category 조회
    public Category findCategoryById(Long id) {
    	try(SqlSession sqlSession = sqlSessionFactory.openSession()){
    		TaskMapper mapper = sqlSession.getMapper(TaskMapper.class);
    		Category category = mapper.findCategoryById(id);
   			return category;
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
        return null;
    }

    // 전체 category 조회
    public List<Category> findCategories() {
    	try(SqlSession sqlSession = sqlSessionFactory.openSession()){
    		TaskMapper mapper = sqlSession.getMapper(TaskMapper.class);
    		return mapper.findCategories();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
        return null;
    }

    // category 수정
    public void updateCategory(Category category) {
    	try(SqlSession sqlSession = sqlSessionFactory.openSession()){
    		TaskMapper mapper = sqlSession.getMapper(TaskMapper.class);
    		mapper.updateCategory(category);
    		sqlSession.commit();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }

    // category 삭제
    public void removeCategoryById(Long id) {
    	try(SqlSession sqlSession = sqlSessionFactory.openSession()){
    		TaskMapper mapper = sqlSession.getMapper(TaskMapper.class);
    		mapper.removeTaskByCategoryId(id);
    		mapper.removeCategoryById(id);
    		sqlSession.commit();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }

    // task 등록
    public void saveTask(Task task) {
    	try(SqlSession sqlSession = sqlSessionFactory.openSession()){
    		TaskMapper mapper = sqlSession.getMapper(TaskMapper.class);
    		mapper.saveTask(task);
    		sqlSession.commit();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }

    // task 상세 정보 조회
    public Task findTaskById(Long id) {
    	try(SqlSession sqlSession = sqlSessionFactory.openSession()){
    		TaskMapper mapper = sqlSession.getMapper(TaskMapper.class);
    		return mapper.findTaskById(id);
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
        return null;
    }

    // 모든 task 목록 조회
    public List<Task> findTasks() {
    	try(SqlSession sqlSession = sqlSessionFactory.openSession()){
    		TaskMapper mapper = sqlSession.getMapper(TaskMapper.class);
    		return mapper.findTasks();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
        return null;
    }

    // task 완료 처리
    public void updateTask(Task task) {
    	try(SqlSession sqlSession = sqlSessionFactory.openSession()){
    		TaskMapper mapper = sqlSession.getMapper(TaskMapper.class);
    		mapper.updateTask(task);
    		sqlSession.commit();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }

    // 아이디로 task 삭제
    public void removeTask(Long id) {
    	try(SqlSession sqlSession = sqlSessionFactory.openSession()){
    		TaskMapper mapper = sqlSession.getMapper(TaskMapper.class);
    		mapper.removeTaskById(id);;
    		sqlSession.commit();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
}
