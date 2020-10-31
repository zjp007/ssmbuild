import com.zjp.pojo.Books;
import com.zjp.service.BooksService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        BooksService booksService = applicationContext.getBean("booksService", BooksService.class);
        System.out.println(booksService.getById(1));

        List<Books> books = booksService.getByPageList(new HashMap<String, Object>());

        Arrays.asList(books).forEach(s-> System.out.println(s));
    }
}
