package entity;

public class TestInstance {
    private  String name="张三";
    private  int age;
    private TestInstance2 entity;
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
        System.out.println("set方法被调用");
        this.age = age;
    }

    public TestInstance2 getEntity() {
        return entity;
    }

    public void setEntity(TestInstance2 entity) {
        this.entity = entity;
    }

    public TestInstance() {
    }

    public TestInstance(String name, int age, TestInstance2 entity) {
        this.name = name;
        this.age = age;
        this.entity = entity;
    }

    public TestInstance(TestInstance2 entity) {
        this.entity = entity;
    }
}
