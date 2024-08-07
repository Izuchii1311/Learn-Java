package oop_java.inner_class;

// Outer Class
public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Inner Class
    public class Employee {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Mengakses Outer Class
        public String getCompany() {
            return Company.this.getName();
        }
    }
}
