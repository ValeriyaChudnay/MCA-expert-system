<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table>
<tr>
<th>id</th>
<th>name</th>
<th>email</th>
<th>password</th>
</tr>
</table>
    <#list users as user>
        <tr>
            <th>${user.id}</th>
            <th>${user.name}</th>
            <th>${user.email}</th>
            <th>${user.password}</th>
        </tr>
    </#list>
</body>
</html>

