package ui;

import exception.NoSuchCategoryException;
import exception.NoSuchTaskException;
import service.TaskService;
import service.TaskServiceImpl;
import vo.Category;
import vo.Task;

import java.util.List;
import java.util.Scanner;

public class TaskUI {

    private final TaskService taskService = new TaskServiceImpl();
    private final Scanner scanner = new Scanner(System.in);

    public TaskUI() {
        while (true) {
            mainUI();
            String input = scanner.nextLine();
            switch (input) {
                case "1": categoryUI(); break;
                case "2": taskUI(); break;
                case "3": System.exit(0); break;
                default:
                    System.out.println("번호를 다시 입력해 주세요");
            }
        }
    }

    // 메인
    public void mainUI() {
        System.out.println("[To Do List]");
        System.out.println("1. 분류 정보 관리");
        System.out.println("2. 할 일 관리");
        System.out.println("3. 프로그램 종료");
        System.out.print("선택: ");
    }

    // 분류 관리 메뉴
    public void categoryUI() {
        while (true) {
            System.out.println("[분류 정보 관리]");
            System.out.println("######################");
            printAllCategories();
            System.out.println("######################");
            System.out.println("1. 분류 정보 등록");
            System.out.println("2. 분류 정보 수정");
            System.out.println("3. 분류 정보 삭제");
            System.out.println("4. 상위 정보 메뉴로");
            System.out.print("선택: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1": saveCategory(); break;
                case "2": updateCategory(); break;
                case "3": removeCategory(); break;
                case "4": return;
                default:
                    System.out.println("번호를 다시 입력해 주세요");
            }
        }
    }

    // category 전체 목록 검색
    public List<Category> findCategories() {
        return taskService.findCategories();
    }

    // category 전체 목록 출력
    public void printAllCategories() {
        List<Category> categories = findCategories();
        if (categories != null && categories.size() > 0) {
            for (Category category : categories) {
                System.out.println(category);
            }
        } else {
            System.out.println("등록된 분류 정보가 없습니다.");
        }
    }

    // category 등록
    public void saveCategory() {
        System.out.print("분류명: ");
        String title = scanner.nextLine();
        taskService.saveCategory(new Category(title));
        System.out.println("분류 정보가 등록 되었습니다.");
    }

    // category 명 수정
    public void updateCategory() {
        System.out.print("수정할 분류 ID: ");
        String id = scanner.nextLine();
        try {
            Category findCategory = taskService.findCategory(Long.valueOf(id));
            System.out.println(findCategory);
            System.out.print("변경할 분류명: ");
            String title = scanner.nextLine();
            findCategory.setTitle(title);
            taskService.updateCategory(findCategory);
            System.out.println("분류 정보가 수정 되었습니다.");
        } catch (NoSuchCategoryException e) {
            System.out.println(e.getMessage());
        }
    }

    // category 삭제
    public void removeCategory() {
        System.out.print("삭제할 분류 ID: ");
        String id = scanner.nextLine();
        try {
            taskService.removeCategory(Long.valueOf(id));
            System.out.println("분류 정보가 삭제되었습니다.");
        } catch (NoSuchCategoryException e) {
            System.out.println(e.getMessage());
        }
    }

    // 할 일 관리 메뉴
    public void taskUI() {
        while (true) {
            System.out.println("[할 일 관리]");
            System.out.println("######################");
            printAllTasks();
            System.out.println("######################");
            System.out.println("1. 할 일 등록");
            System.out.println("2. 할 일 완료");
            System.out.println("3. 할 일 삭제");
            System.out.println("4. 상위 메뉴로");
            System.out.print("선택: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1": saveTask(); break;
                case "2": completeTask(); break;
                case "3": removeTask(); break;
                case "4": return;
                default:
                    System.out.println("번호를 다시 입력해 주세요");
            }
        }
    }

    // task 등록
    public void saveTask() {

        try {
            List<Category> categories = findCategories();
            if (categories != null && categories.size() > 0) {
                for (Category category : categories) {
                    System.out.println(category);
                }
                System.out.print("분류 정보 아이디 선택: ");
            } else {
                System.out.println("분류 정보를 먼저 등록 하세요");
                return;
            }
            String categoryId = scanner.nextLine();
            Category category = taskService.findCategory(Long.valueOf(categoryId));
            System.out.print("제목: ");
            String title = scanner.nextLine();
            System.out.print("내용: ");
            String contents = scanner.nextLine();
            System.out.print("기한(yyyy-mm-dd, 미입력 시 엔터키): ");
            String deadline = scanner.nextLine();
            if (deadline.length() != 10) deadline = null;
            Task task = new Task(title, contents, category, deadline);
            taskService.saveTask(task);
            System.out.println("할 일이 등록 되었습니다.");
        } catch (NoSuchCategoryException e) {
            System.out.println(e.getMessage());
        }
    }

    // task 전체 목록 출력
    public void printAllTasks() {
        List<Task> tasks = taskService.findTasks();
        if (tasks != null && tasks.size() > 0) {
            for (Task task : tasks) {
                System.out.println(task);
            }
        } else {
            System.out.println("등록된 할 일 정보가 없습니다.");
        }
    }

    // task 완료 처리
    public void completeTask() {
        try {
            System.out.print("완료할 할 일 아이디: ");
            String id = scanner.nextLine();
            taskService.completeTask(Long.valueOf(id));
            System.out.println("할 일이 완료 되었습니다.");
        } catch (NoSuchTaskException e) {
            System.out.println(e.getMessage());
        }
    }

    // task 삭제
    public void removeTask() {
        try {
            System.out.print("삭제할 할 일 아이디: ");
            String id = scanner.nextLine();
            taskService.removeTask(Long.valueOf(id));
            System.out.println("할 일이 삭제 되었습니다.");
        } catch (NoSuchTaskException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new TaskUI();
    }
}
