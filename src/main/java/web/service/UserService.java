package web.service;

import web.models.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface UserService {

    List<User> getAll();
    User get(long id);
    void add(User user);
    void update(long id, User user);
    void delete(long id);
}
