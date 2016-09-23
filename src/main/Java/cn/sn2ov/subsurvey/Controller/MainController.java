package cn.sn2ov.subsurvey.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by SN2OV on 2016/9/20.
 */

@Controller
public class MainController {

    @RequestMapping(value = "/a", method = RequestMethod.GET)
    public String index() {
        return "indexa";
    }

    //这个方法很不好使
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test(){
        return "indexaa";
    }
}
