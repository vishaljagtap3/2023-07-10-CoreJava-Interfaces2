public class Main {
    public static void main(String[] args) {
        /*int [] arr = {45, 12, 89, 62, 73, 28, 33, 50, 69, 22};

        Util.sort(arr);

        for(int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();*/

        Student [] students = new Student[5];
        students[0] = new Student(23, "DD", 98);
        students[1] = new Student(56, "BB", 65);
        students[2] = new Student(18, "CC", 34);
        students[3] = new Student(88, "EE", 89);
        students[4] = new Student(40, "AA", 55);

        StudentComparator studentComparator =
                new StudentComparator();

        Util.sort(students, studentComparator);
        for(Student student : students) {
            System.out.println(student);
        }

        System.out.println();
        Util.sort(students, new StudentComparatorByMarks());
        for(Student student : students) {
            System.out.println(student);
        }


        System.out.println();
        Emp [] emps = new Emp[5];
        emps[0] = new Emp(59, "PQR", 4500);
        emps[1] = new Emp(34, "JKL", 4200);
        emps[2] = new Emp(90, "SRT", 4900);
        emps[3] = new Emp(44, "ABC", 4100);
        emps[4] = new Emp(16, "LMN", 4300);

        Util.sort(emps, new EmpComparator());
        for(Emp e : emps) {
            System.out.println(e);
        }

    }
}




