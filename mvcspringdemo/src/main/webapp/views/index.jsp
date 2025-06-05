<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Number Input Form</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <a href="home.jsp" class="top-left-link">🏠 Home</a>

    <div class="form-container">
        <h2>Enter Two Numbers</h2>
        <form action="add" method="post">
            <input type="number" name="id" placeholder="Enter student id" required />
            <input type="text" name="name" placeholder="Enter student name" required />
            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>
