package org.main.fancode;



import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.main.fancode.dto.User;
import org.main.fancode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testFanCodeUserLocation() {
        List<User> fanCodeUsers = userService.getFanCodeUsers();
        assertFalse(fanCodeUsers.isEmpty());
    }

    @Test
    public void testUserTaskCompletion() {
        assertTrue(userService.hasCompletedMoreThanHalfOfTodos(1));  // Sample User ID
    }

}
