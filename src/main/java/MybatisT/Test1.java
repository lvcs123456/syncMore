package MybatisT;


import java.util.*;

public class Test1 {
    int i;

    void Run() {

    }


    public Test1() {
    }

    public Test1(int i) {
    }

    public static void main(String[] args) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<Object, Object>();
        for(int i=0;i<11;i++){
            objectObjectHashMap.put(i, "233");
        }
        objectObjectHashMap.put("12", "333");
        objectObjectHashMap.put(1569, "433");
//        ArrayList<String> strings = new ArrayList<String>();
//        strings.add("123");
          Set<Map.Entry<Object, Object>> entries = objectObjectHashMap.entrySet();
          Iterator<Map.Entry<Object, Object>> iterator = entries.iterator();
//        ArrayList<Object> objects = new ArrayList<Object>();
//        ReentrantLock reentrantLock = new ReentrantLock();

//        InputStream is=InputStream.class.getResourceAsStream("/mybatis-config.xml");
//
//        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
//
//        SqlSession sqlSession = build.openSession();
//        System.out.println(sqlSession.hashCode());
//        sqlSession.commit();


    }


}
