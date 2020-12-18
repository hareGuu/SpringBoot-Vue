# SpringBoot-Vue

# SpringBoot+Vue实现系统管理

## 后台环境

> Spring Boot版本 2.4.0.RELEASE
>
> JDK版本	1.8
>
> thymeleaf 版本  3.0.9.RELEASE , 其中thymeleaf的layout版本为2.3.0

```xml
<properties>
    <java.version>1.8</java.version>
    <springboot-thymeleaf.version>3.0.9.RELEASE</springboot-thymeleaf.version>
    <thymeleaf-layout-dialect.version>2.3.0</thymeleaf-layout-dialect.version>
</properties>
```

### 关于接受参数问题
    
    如果使用的是VUE传参, 那么方法中可以用 @RequestBody Map<String, Object> para
    如果是html, 测试阶段, 使用 @RequestParam("username") String username, @RequestParam("password") String password
    带@RequestParam("username")注解, 为必填, 名称一致
