package oop_08;

public class Employee {
    private String name;
    private int age;
    private String gender;

    public Employee(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) {
            return false;
        }
        if (name != null) {
            if (!name.equals(employee.name)) {
                return false;
            }
        } else {
            if (employee.name != null) {
                return false;
            }
        }
        if (gender != null) {
            return gender.equals(employee.gender);
        }
        else {
            return employee.gender == null;
        }
    }

    @Override
    public int hashCode() {
        int result;

        if (name != null) {
            result = name.hashCode();
        } else {
            result = 0;
        }

        result = 31 * result + age;

        if (gender != null) {
            result = 31 * result + gender.hashCode();
        } else {
            result = 31 * result + 0;
        }

        return result;
    }

    @Override
    public String toString() {
        return name + " : " + age + " : " + gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
