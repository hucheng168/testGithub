package action;

import common.DataSource;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/")
public class UserControllor{

    private static final Logger logger = Logger.getLogger(UserControllor.class);

    @Value("${user}")
    private String user;

    @Value("${pwd}")
    private String pwd;

    @Autowired
    private DataSource dataSource;

    @RequestMapping(value="/login",method = {RequestMethod.GET})
    public String login(HttpServletRequest request, HttpServletResponse response){
        logger.info("====datasource info======");
        dataSource.toString();
        String userName = request.getParameter("userName");
        String pwd = request.getParameter("pwd");
        if(userName.equals(user) && pwd.equals(pwd)){
            return "welcom to "+userName+" login system!";

        }else{
            return "login fail";
        }

    }
}
