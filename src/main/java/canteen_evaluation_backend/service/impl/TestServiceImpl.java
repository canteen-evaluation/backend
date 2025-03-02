package canteen_evaluation_backend.service.impl;

import canteen_evaluation_backend.dao.TestMapper;
import canteen_evaluation_backend.pojo.TestPojo;
import canteen_evaluation_backend.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    TestMapper testMapper;

    @Autowired
    public TestServiceImpl(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    @Override
    public List<TestPojo> getAllUsers() {
        return testMapper.getAll();
    }
}
