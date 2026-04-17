package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import pojo.Dog;
import pojo.Person;

import java.util.*;

public class TestJson {
  @Test
    public void testWriteJson() throws JsonProcessingException {
      Dog dog = new Dog("小黄");
      Person person = new Person("张三",18,dog);
      //将Person对象转换成一个字符串
    ObjectMapper objectMapper = new ObjectMapper();
    String personStr = objectMapper.writeValueAsString(person);
    System.out.println(personStr);
  }
  @Test
  public void testReadJson() throws JsonProcessingException {
    String personStr = "{\"name\":\"张三\",\"age\":18,\"dog\":{\"name\":\"小黄\"}}";
    ObjectMapper objectMapper = new ObjectMapper();
    Person person = objectMapper.readValue(personStr, Person.class);
    System.out.println(person);
  }
  @Test
  public void testMapToJson() throws JsonProcessingException {
    Map data = new HashMap();
    data.put("a","valuea");
    data.put("b","valueb");

    ObjectMapper objectMapper = new ObjectMapper();
    String s = objectMapper.writeValueAsString(data);
    System.out.println(s);
  }
  @Test
  public void testListToJson() throws JsonProcessingException {
    List data = new ArrayList();
//    data.add("a");
//    data.add("b");
//    data.add("b");
    Dog dog = new Dog("小黄");
    Person person = new Person("张三",18,dog);
    data.add(person);

    ObjectMapper objectMapper = new ObjectMapper();
    String s = objectMapper.writeValueAsString(data);
    System.out.println(s);
  }
  @Test
  public void newArr(){
    int[] arr ={1,2,3};
    System.out.println(Arrays.toString(arr));
  }
}
