package canteen_evaluation_backend.dao;

import canteen_evaluation_backend.pojo.TestPojo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestMapper {
    List<TestPojo> getAll();
}
