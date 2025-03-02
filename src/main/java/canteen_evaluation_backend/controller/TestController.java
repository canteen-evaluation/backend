package canteen_evaluation_backend.controller;

import canteen_evaluation_backend.pojo.TestPojo;
import canteen_evaluation_backend.service.TestService;
import canteen_evaluation_backend.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * FOR TEST
 */

@RestController
@RequestMapping("/test")
public class TestController {

    TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/getAllUsers")
    public List<TestVo> getAllUsers() {
        List<TestPojo> resultList = testService.getAllUsers();

        // transform to vo
        List<TestVo> resultVoList = new ArrayList<>();
        resultList.forEach(testPojo -> {
            TestVo testVo = new TestVo(testPojo.getUserName());
            resultVoList.add(testVo);
        });

        return resultVoList;
    }
}
