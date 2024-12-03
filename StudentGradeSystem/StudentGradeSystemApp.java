import java.io.*;
import java.util.*;

class Student implements Serializable {
    private int id;
    private String name;
    private double[] marks;
    private String grade;

    public Student(int id, String name, double[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.grade = calculateGrade();
    }

    private String calculateGrade() {
        double average = Arrays.stream(marks).average().orElse(0.0);
        if (average >= 90) return "A+";
        else if (average >= 80) return "A";
        else if (average >= 70) return "B";
        else if (average >= 60) return "C";
        else return "F";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double[] getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }

    public void updateMarks(double[] newMarks) {
        this.marks = newMarks;
        this.grade = calculateGrade();
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + Arrays.toString(marks) + ", Grade: " + grade;
    }
}

class StudentGradeSystem {
    private List<Student> students = new ArrayList<>();
    private final String DATA_FILE = "students.dat";

    public void addStudent(int id, String name, double[] marks) {
        students.add(new Student(id, name, marks));
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
        } else {
            students.forEach(System.out::println);
        }
    }

    public void searchStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found!");
    }

    public void updateStudent(int id, double[] newMarks) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.updateMarks(newMarks);
                System.out.println("Student record updated!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found!");
    }

    public void deleteStudent(int id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
                System.out.println("Student deleted!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found!");
    }

    public void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            oos.writeObject(students);
            System.out.println("Data saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATA_FILE))) {
            students = (List<Student>) ois.readObject();
            System.out.println("Data loaded successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("No saved data found!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}

public class StudentGradeSystemApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGradeSystem system = new StudentGradeSystem();
        system.loadData();

        while (true) {
            System.out.println("\n=== Student Grade System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Save Data");
            System.out.println("7. Exit");
            System.out.print("Choose an option: \n");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter number of subjects: ");
                    int n = scanner.nextInt();
                    double[] marks = new double[n];
                    System.out.println("Enter marks for " + n + " subjects:");
                    for (int i = 0; i < n; i++) {
                        marks[i] = scanner.nextDouble();
                    }
                    system.addStudent(id, name, marks);
                    break;

                case 2:
                    system.displayAllStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int searchId = scanner.nextInt();
                    system.searchStudentById(searchId);
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter number of new marks: ");
                    int m = scanner.nextInt();
                    double[] newMarks = new double[m];
                    System.out.println("Enter new marks for " + m + " subjects:");
                    for (int i = 0; i < m; i++) {
                        newMarks[i] = scanner.nextDouble();
                    }
                    system.updateStudent(updateId, newMarks);
                    break;

                case 5:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    system.deleteStudent(deleteId);
                    break;

                case 6:
                    system.saveData();
                    break;

                case 7:
                    System.out.println("Exiting... Goodbye!");
                    system.saveData();
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
