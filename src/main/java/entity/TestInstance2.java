package entity;

public class TestInstance2 {
    private  String name;
    private  int age;
    private  TestInstance3 entity;

    public TestInstance3 getEntity() {
        return entity;
    }

    public void setEntity(TestInstance3 entity) {
        this.entity = entity;
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
}
