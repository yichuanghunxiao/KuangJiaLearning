<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试@Controller注解</title>
</head>
<body>
    <!-- 页面可以访问Controller传递传递出来的message -->
    ${requestScope.message}
</body>
</html>
