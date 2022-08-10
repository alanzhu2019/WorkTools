import com.alibaba.fastjson.JSON;

public class FastJsonDemo {
    public static void main(String[] args) {

        DemoUser demoUser = new DemoUser();

        demoUser.setId(1);
        demoUser.setName("小明");
        demoUser.setPassword("123123");

        String jsonString = JSON.toJSONString(demoUser);

        System.out.println(jsonString);

        DemoUser user = JSON.parseObject("{\"id\":1,\"name\":\"小明\",\"password\":\"123123\"}", DemoUser.class);

        System.out.println(user);

    }
}
