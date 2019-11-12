import com.rj.Provider01StartApp;
import com.rj.pojo.User;
import com.rj.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Provider01StartApp.class)
public class UserTest {
    @Autowired
    private UserService userService;

    @Test
    public void testFindAll() {
        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println(user.toString());
        }
    }

    @Test
    public void testFindById() {
        User user = userService.findByid(1);
        System.out.println(user);
    }
}
