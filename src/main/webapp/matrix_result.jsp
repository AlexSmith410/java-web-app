<html lang="en">
<head>
    The matrix is:
</head>
<body>
    <table border = "1">
    <%
        int count = Integer.parseInt(request.getParameter("number"));
        out.print("<tr>");
        for (int i = 1; i <= count; i++) {
        for (int j = 1; j <= count; j++) {
        out.print("<td>" + i + "-" + j + "</td>");
        }
        out.print("</tr>");
        }
        out.println();
        %>
    </table>
</form>
</body>
</html>