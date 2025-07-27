package emp;
class Details {
    int EmpId;
    String EmpName;
    String EmpDept;

    void Insert(int a, String b, String c) {
        EmpId = a;
        EmpName = b;
        EmpDept = c;
    }

    void Display() {
        System.out.println(EmpId);
        System.out.println(EmpName);
        System.out.println(EmpDept);
    }
}


public class ABCD {
	 public static void main(String[] args) {
		 Details o1=new Details();
		 o1.Insert(101, "Sakshi","IT");
		 o1.Display();
	}
	}
