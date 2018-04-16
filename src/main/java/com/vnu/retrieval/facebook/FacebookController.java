package com.vnu.retrieval.facebook;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vnu.retrieval.common.ControllerSupport;
import com.vnu.retrieval.common.DomainException;
import com.vnu.retrieval.common.RetrievalResponse;

@CrossOrigin
@RestController
public class FacebookController implements ControllerSupport {
    @Autowired
    FacebookCrawlwerService facebookCrawlwerService;

    @PostMapping(path = "/crawler/index")
    public RetrievalResponse<List> getCategory(
	    @RequestParam(name = "user_name", required = false, defaultValue = "") String userName,
	    @RequestParam(name = "password", required = false, defaultValue = "") String password,
	    @RequestParam(name = "deep", required = false, defaultValue = "1") String deepValue,
	    HttpServletResponse httpResponse) {
	try {
	    int deep = Integer.parseInt(deepValue);
	    if (userName.isEmpty() || password.isEmpty()) {
		return error(new DomainException("", 1));
	    }
	    List<User> users = facebookCrawlwerService.fetchMusic(userName, password, deep);
	    return success(users);
	} catch (Exception ex) {
	    return error(new DomainException("has a exception", ex));
	}
	 
    }

}
