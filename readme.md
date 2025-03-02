# canteen-evaluation

---
- 使用 springboot，后续如果需要改造为 cloud 成本也很低
---
- 结构说明
```
├── config/           # 配置类目录
│   └── CORSConfig.java  # 跨域配置
├── controller/       # 控制器层，处理HTTP请求
│   └── TestController.java
├── dao/             # 数据访问层，与数据库交互
│   └── TestMapper.java
├── pojo/            # 实体类，对应数据库表
│   └── TestPojo.java
├── service/         # 业务逻辑层
│   ├── TestService.java      # 服务接口
│   └── impl/
│       └── TestServiceImpl.java  # 服务实现
├── util/            # 工具类
│   └── PackageUtil.java
└── vo/              # 视图对象，用于前端展示
    └── TestVo.java
```